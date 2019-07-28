package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ScalarLeafs", JSImport.Namespace)
@js.native
object validationRulesScalarLeafsMod extends js.Object {
  def ScalarLeafs(context: ValidationContext): ASTVisitor = js.native
  def noSubselectionAllowedMessage(fieldName: String, `type`: String): String = js.native
  def requiredSubselectionMessage(fieldName: String, `type`: String): String = js.native
}

