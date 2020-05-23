package typings.graphqlCompose.enumTypeComposerMod

import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeEnumValueConfig extends js.Object {
  var astNode: js.UndefOr[EnumValueDefinitionNode | Null] = js.undefined
  var deprecationReason: js.UndefOr[String | Null] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ComposeEnumValueConfig {
  @scala.inline
  def apply(
    astNode: js.UndefOr[Null | EnumValueDefinitionNode] = js.undefined,
    deprecationReason: js.UndefOr[Null | String] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    extensions: Extensions = null,
    value: js.Any = null
  ): ComposeEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecationReason)) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeEnumValueConfig]
  }
}

