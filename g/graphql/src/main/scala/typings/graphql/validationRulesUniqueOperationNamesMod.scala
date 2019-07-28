package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationNames", JSImport.Namespace)
@js.native
object validationRulesUniqueOperationNamesMod extends js.Object {
  def UniqueOperationNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateOperationNameMessage(operationName: String): String = js.native
}

