package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueVariableNamesRule", JSImport.Namespace)
@js.native
object uniqueVariableNamesRuleMod extends js.Object {
  def UniqueVariableNamesRule(context: ASTValidationContext): ASTVisitor = js.native
}

