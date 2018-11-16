package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownDirectives", JSImport.Namespace)
@js.native
object validationRulesKnownDirectivesMod extends js.Object {
  def KnownDirectives(context: graphqlLib.validationValidationContextMod.SDLValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def KnownDirectives(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def misplacedDirectiveMessage(directiveName: java.lang.String, location: java.lang.String): java.lang.String = js.native
  def unknownDirectiveMessage(directiveName: java.lang.String): java.lang.String = js.native
}

