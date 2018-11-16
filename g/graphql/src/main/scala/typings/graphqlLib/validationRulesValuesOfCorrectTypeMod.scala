package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ValuesOfCorrectType", JSImport.Namespace)
@js.native
object validationRulesValuesOfCorrectTypeMod extends js.Object {
  def ValuesOfCorrectType(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def badValueMessage(typeName: java.lang.String, valueName: java.lang.String): java.lang.String = js.native
  def badValueMessage(typeName: java.lang.String, valueName: java.lang.String, message: java.lang.String): java.lang.String = js.native
  def requiredFieldMessage(typeName: java.lang.String, fieldName: java.lang.String, fieldTypeName: java.lang.String): java.lang.String = js.native
  def unknownFieldMessage(typeName: java.lang.String, fieldName: java.lang.String): java.lang.String = js.native
  def unknownFieldMessage(typeName: java.lang.String, fieldName: java.lang.String, message: java.lang.String): java.lang.String = js.native
}

