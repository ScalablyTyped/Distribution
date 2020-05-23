package typings.graphql.definitionMod

import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValueConfig extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumValueDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object GraphQLEnumValueConfig {
  @scala.inline
  def apply(
    astNode: js.UndefOr[Null | Maybe[EnumValueDefinitionNode]] = js.undefined,
    deprecationReason: js.UndefOr[Null | Maybe[String]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined,
    value: js.Any = null
  ): GraphQLEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecationReason)) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumValueConfig]
  }
}

