package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUndefinedVariablesRule", JSImport.Namespace)
@js.native
object noUndefinedVariablesRuleMod extends js.Object {
  def NoUndefinedVariablesRule(context: ValidationContext): ASTVisitor = js.native
}

