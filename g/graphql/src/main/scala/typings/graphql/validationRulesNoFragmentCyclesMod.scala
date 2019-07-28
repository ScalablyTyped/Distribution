package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoFragmentCycles", JSImport.Namespace)
@js.native
object validationRulesNoFragmentCyclesMod extends js.Object {
  def NoFragmentCycles(context: ValidationContext): ASTVisitor = js.native
  def cycleErrorMessage(fragName: String, spreadNames: js.Array[String]): String = js.native
}

