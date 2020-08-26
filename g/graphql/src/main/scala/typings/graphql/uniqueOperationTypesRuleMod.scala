package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationTypesRule", JSImport.Namespace)
@js.native
object uniqueOperationTypesRuleMod extends js.Object {
  def UniqueOperationTypesRule(context: SDLValidationContext): ASTVisitor = js.native
}

