package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationValidationContextMod {
  import typings.graphql.languageVisitorMod.ASTVisitor

  type SDLValidationRule = js.Function1[/* context */ SDLValidationContext, ASTVisitor]
  type ValidationRule = js.Function1[/* context */ ValidationContext, ASTVisitor]
}
