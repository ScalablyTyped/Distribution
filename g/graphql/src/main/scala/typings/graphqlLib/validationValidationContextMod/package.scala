package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationValidationContextMod {
  type SDLValidationRule = js.Function1[/* context */ SDLValidationContext, graphqlLib.languageVisitorMod.ASTVisitor]
  type ValidationRule = js.Function1[/* context */ ValidationContext, graphqlLib.languageVisitorMod.ASTVisitor]
}
