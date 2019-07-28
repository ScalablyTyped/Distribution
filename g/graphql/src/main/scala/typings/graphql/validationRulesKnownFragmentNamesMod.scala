package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownFragmentNames", JSImport.Namespace)
@js.native
object validationRulesKnownFragmentNamesMod extends js.Object {
  def KnownFragmentNames(context: ValidationContext): ASTVisitor = js.native
  def unknownFragmentMessage(fragName: String): String = js.native
}

