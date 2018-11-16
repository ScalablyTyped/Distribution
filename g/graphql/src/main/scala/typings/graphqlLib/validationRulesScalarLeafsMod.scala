package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ScalarLeafs", JSImport.Namespace)
@js.native
object validationRulesScalarLeafsMod extends js.Object {
  def ScalarLeafs(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def noSubselectionAllowedMessage(fieldName: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  def requiredSubselectionMessage(fieldName: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
}

