package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoFragmentCycles", JSImport.Namespace)
@js.native
object validationRulesNoFragmentCyclesMod extends js.Object {
  def NoFragmentCycles(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def cycleErrorMessage(fragName: java.lang.String, spreadNames: js.Array[java.lang.String]): java.lang.String = js.native
}

