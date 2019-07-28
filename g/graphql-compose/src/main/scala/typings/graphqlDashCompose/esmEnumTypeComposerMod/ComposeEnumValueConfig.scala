package typings.graphqlDashCompose.esmEnumTypeComposerMod

import typings.graphql.languageAstMod.EnumValueDefinitionNode
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
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
    astNode: EnumValueDefinitionNode = null,
    deprecationReason: String = null,
    description: String = null,
    extensions: Extensions = null,
    value: js.Any = null
  ): ComposeEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    if (astNode != null) __obj.updateDynamic("astNode")(astNode)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ComposeEnumValueConfig]
  }
}

