package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/FieldsOnCorrectType", JSImport.Namespace)
@js.native
object validationRulesFieldsOnCorrectTypeMod extends js.Object {
  def FieldsOnCorrectType(context: ValidationContext): ASTVisitor = js.native
  def undefinedFieldMessage(
    fieldName: String,
    `type`: String,
    suggestedTypeNames: js.Array[String],
    suggestedFieldNames: js.Array[String]
  ): String = js.native
}

