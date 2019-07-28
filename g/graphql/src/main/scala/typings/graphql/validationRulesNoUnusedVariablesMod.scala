package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedVariables", JSImport.Namespace)
@js.native
object validationRulesNoUnusedVariablesMod extends js.Object {
  def NoUnusedVariables(context: ValidationContext): ASTVisitor = js.native
  def unusedVariableMessage(varName: String, opName: Maybe[String]): String = js.native
}

