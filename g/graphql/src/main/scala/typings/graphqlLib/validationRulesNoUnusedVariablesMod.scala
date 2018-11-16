package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedVariables", JSImport.Namespace)
@js.native
object validationRulesNoUnusedVariablesMod extends js.Object {
  def NoUnusedVariables(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def unusedVariableMessage(varName: java.lang.String, opName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]): java.lang.String = js.native
}

