package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/SingleFieldSubscriptions", JSImport.Namespace)
@js.native
object validationRulesSingleFieldSubscriptionsMod extends js.Object {
  def SingleFieldSubscriptions(context: ASTValidationContext): ASTVisitor = js.native
  def singleFieldOnlyMessage(name: Maybe[String]): String = js.native
}

