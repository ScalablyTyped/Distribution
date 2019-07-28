package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ExecutableDefinitions", JSImport.Namespace)
@js.native
object validationRulesExecutableDefinitionsMod extends js.Object {
  def ExecutableDefinitions(context: ASTValidationContext): ASTVisitor = js.native
  def nonExecutableDefinitionMessage(defName: String): String = js.native
}

