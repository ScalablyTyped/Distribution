package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedFragments", JSImport.Namespace)
@js.native
object validationRulesNoUnusedFragmentsMod extends js.Object {
  def NoUnusedFragments(context: ValidationContext): ASTVisitor = js.native
  def unusedFragMessage(fragName: String): String = js.native
}

