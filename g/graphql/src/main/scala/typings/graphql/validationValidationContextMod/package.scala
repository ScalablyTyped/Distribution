package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationValidationContextMod {
  type SDLValidationRule = js.Function1[/* context */ SDLValidationContext, ASTVisitor]
  type ValidationRule = js.Function1[/* context */ ValidationContext, ASTVisitor]
}
