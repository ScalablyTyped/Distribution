package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ValuesOfCorrectType", JSImport.Namespace)
@js.native
object validationRulesValuesOfCorrectTypeMod extends js.Object {
  def ValuesOfCorrectType(context: ValidationContext): ASTVisitor = js.native
  def badEnumValueMessage(typeName: String, valueName: String, suggestedValues: js.Array[String]): String = js.native
  def badValueMessage(typeName: String, valueName: String): String = js.native
  def badValueMessage(typeName: String, valueName: String, message: String): String = js.native
  def requiredFieldMessage(typeName: String, fieldName: String, fieldTypeName: String): String = js.native
  def unknownFieldMessage(typeName: String, fieldName: String, suggestedFields: js.Array[String]): String = js.native
}

