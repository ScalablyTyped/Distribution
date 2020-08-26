package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/VariablesAreInputTypesRule", JSImport.Namespace)
@js.native
object variablesAreInputTypesRuleMod extends js.Object {
  def VariablesAreInputTypesRule(context: ValidationContext): ASTVisitor = js.native
}

