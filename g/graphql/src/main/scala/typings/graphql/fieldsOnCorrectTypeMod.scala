package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/FieldsOnCorrectType", JSImport.Namespace)
@js.native
object fieldsOnCorrectTypeMod extends js.Object {
  def FieldsOnCorrectType(context: ValidationContext): ASTVisitor = js.native
  def undefinedFieldMessage(
    fieldName: String,
    `type`: String,
    suggestedTypeNames: js.Array[String],
    suggestedFieldNames: js.Array[String]
  ): String = js.native
}

