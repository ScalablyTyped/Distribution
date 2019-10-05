package typings.graphql.validationValidationContextMod

import typings.graphql.languageAstMod.VariableNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableUsage extends js.Object {
  val defaultValue: Maybe[_]
  val node: VariableNode
  val `type`: Maybe[GraphQLInputType]
}

object VariableUsage {
  @scala.inline
  def apply(node: VariableNode, defaultValue: Maybe[_] = null, `type`: Maybe[GraphQLInputType] = null): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUsage]
  }
}

