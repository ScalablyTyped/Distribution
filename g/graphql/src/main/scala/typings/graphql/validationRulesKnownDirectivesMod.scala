package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.SDLValidationContext
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownDirectives", JSImport.Namespace)
@js.native
object validationRulesKnownDirectivesMod extends js.Object {
  def KnownDirectives(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectives(context: ValidationContext): ASTVisitor = js.native
  def misplacedDirectiveMessage(directiveName: String, location: String): String = js.native
  def unknownDirectiveMessage(directiveName: String): String = js.native
}

