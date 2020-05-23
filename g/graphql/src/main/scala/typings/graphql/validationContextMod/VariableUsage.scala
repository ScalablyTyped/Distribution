package typings.graphql.validationContextMod

import typings.graphql.astMod.VariableNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.maybeMod.Maybe
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
  def apply(
    node: VariableNode,
    defaultValue: js.UndefOr[Null | Maybe[_]] = js.undefined,
    `type`: js.UndefOr[Null | Maybe[GraphQLInputType]] = js.undefined
  ): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUsage]
  }
}

