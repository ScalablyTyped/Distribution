package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ProvidedRequiredArgumentsRule", JSImport.Namespace)
@js.native
object providedRequiredArgumentsRuleMod extends js.Object {
  def ProvidedRequiredArgumentsOnDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsOnDirectivesRule(context: ValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsRule(context: ValidationContext): ASTVisitor = js.native
}

