package typings
package graphqlDashComposeLib.esmEnumTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeEnumValueConfig extends js.Object {
  var astNode: js.UndefOr[graphqlLib.languageAstMod.EnumValueDefinitionNode | scala.Null] = js.undefined
  var deprecationReason: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ComposeEnumValueConfig {
  @scala.inline
  def apply(
    astNode: graphqlLib.languageAstMod.EnumValueDefinitionNode = null,
    deprecationReason: java.lang.String = null,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null,
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

