package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/FragmentsOnCompositeTypes", JSImport.Namespace)
@js.native
object validationRulesFragmentsOnCompositeTypesMod extends js.Object {
  def FragmentsOnCompositeTypes(context: ValidationContext): ASTVisitor = js.native
  def fragmentOnNonCompositeErrorMessage(fragName: String, `type`: String): String = js.native
  def inlineFragmentOnNonCompositeErrorMessage(`type`: String): String = js.native
}

