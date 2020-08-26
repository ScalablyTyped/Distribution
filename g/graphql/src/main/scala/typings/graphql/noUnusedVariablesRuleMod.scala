package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedVariablesRule", JSImport.Namespace)
@js.native
object noUnusedVariablesRuleMod extends js.Object {
  def NoUnusedVariablesRule(context: ValidationContext): ASTVisitor = js.native
}

