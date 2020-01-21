package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueInputFieldNames", JSImport.Namespace)
@js.native
object uniqueInputFieldNamesMod extends js.Object {
  def UniqueInputFieldNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateInputFieldMessage(fieldName: String): String = js.native
}

