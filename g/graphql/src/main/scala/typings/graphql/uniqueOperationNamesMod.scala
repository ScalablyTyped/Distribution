package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationNames", JSImport.Namespace)
@js.native
object uniqueOperationNamesMod extends js.Object {
  def UniqueOperationNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateOperationNameMessage(operationName: String): String = js.native
}

