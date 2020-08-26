package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneAnonymousOperationRule", JSImport.Namespace)
@js.native
object loneAnonymousOperationRuleMod extends js.Object {
  def LoneAnonymousOperationRule(context: ASTValidationContext): ASTVisitor = js.native
}

