package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/FragmentsOnCompositeTypes", JSImport.Namespace)
@js.native
object fragmentsOnCompositeTypesMod extends js.Object {
  def FragmentsOnCompositeTypes(context: ValidationContext): ASTVisitor = js.native
  def fragmentOnNonCompositeErrorMessage(fragName: String, `type`: String): String = js.native
  def inlineFragmentOnNonCompositeErrorMessage(`type`: String): String = js.native
}

