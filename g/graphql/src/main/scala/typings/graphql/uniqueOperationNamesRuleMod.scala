package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationNamesRule", JSImport.Namespace)
@js.native
object uniqueOperationNamesRuleMod extends js.Object {
  def UniqueOperationNamesRule(context: ASTValidationContext): ASTVisitor = js.native
}

