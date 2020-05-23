package typings.graphql.definitionMod

import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValue extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumValueDefinitionNode]] = js.undefined
  var deprecationReason: Maybe[String]
  var description: Maybe[String]
  var extensions: Maybe[Record[String, _]]
  var isDeprecated: js.UndefOr[Boolean] = js.undefined
  var name: String
  var value: js.Any
}

object GraphQLEnumValue {
  @scala.inline
  def apply(
    name: String,
    value: js.Any,
    astNode: js.UndefOr[Null | Maybe[EnumValueDefinitionNode]] = js.undefined,
    deprecationReason: js.UndefOr[Null | Maybe[String]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined,
    isDeprecated: js.UndefOr[Boolean] = js.undefined
  ): GraphQLEnumValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecationReason)) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeprecated)) __obj.updateDynamic("isDeprecated")(isDeprecated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumValue]
  }
}

