package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownDirectivesRule", JSImport.Namespace)
@js.native
object knownDirectivesRuleMod extends js.Object {
  def KnownDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: ValidationContext): ASTVisitor = js.native
}

