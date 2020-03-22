package typings.graphqlCompose

import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<graphql-compose.graphql-compose/lib/EnumTypeComposer.ComposeEnumValueConfig> */
trait PartialComposeEnumValueCo extends js.Object {
  var astNode: js.UndefOr[EnumValueDefinitionNode] = js.undefined
  var deprecationReason: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PartialComposeEnumValueCo {
  @scala.inline
  def apply(
    astNode: EnumValueDefinitionNode = null,
    deprecationReason: String = null,
    description: String = null,
    extensions: Extensions = null,
    value: js.Any = null
  ): PartialComposeEnumValueCo = {
    val __obj = js.Dynamic.literal()
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialComposeEnumValueCo]
  }
}

