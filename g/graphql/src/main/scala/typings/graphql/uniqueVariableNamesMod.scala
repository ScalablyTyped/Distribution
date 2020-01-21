package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueVariableNames", JSImport.Namespace)
@js.native
object uniqueVariableNamesMod extends js.Object {
  def UniqueVariableNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateVariableMessage(variableName: String): String = js.native
}

