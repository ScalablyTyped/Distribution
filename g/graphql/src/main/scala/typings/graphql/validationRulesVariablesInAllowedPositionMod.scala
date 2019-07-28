package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/VariablesInAllowedPosition", JSImport.Namespace)
@js.native
object validationRulesVariablesInAllowedPositionMod extends js.Object {
  def VariablesInAllowedPosition(context: ValidationContext): ASTVisitor = js.native
  def badVarPosMessage(varName: String, varType: String, expectedType: String): String = js.native
}

