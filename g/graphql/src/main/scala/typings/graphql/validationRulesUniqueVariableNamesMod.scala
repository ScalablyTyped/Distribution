package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueVariableNames", JSImport.Namespace)
@js.native
object validationRulesUniqueVariableNamesMod extends js.Object {
  def UniqueVariableNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateVariableMessage(variableName: String): String = js.native
}

