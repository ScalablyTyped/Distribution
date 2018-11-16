package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/FragmentsOnCompositeTypes", JSImport.Namespace)
@js.native
object validationRulesFragmentsOnCompositeTypesMod extends js.Object {
  def FragmentsOnCompositeTypes(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def fragmentOnNonCompositeErrorMessage(fragName: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  def inlineFragmentOnNonCompositeErrorMessage(`type`: java.lang.String): java.lang.String = js.native
}

