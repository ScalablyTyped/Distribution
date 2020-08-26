package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownArgumentNamesRule", JSImport.Namespace)
@js.native
object knownArgumentNamesRuleMod extends js.Object {
  def KnownArgumentNamesOnDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesOnDirectivesRule(context: ValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesRule(context: ValidationContext): ASTVisitor = js.native
}

