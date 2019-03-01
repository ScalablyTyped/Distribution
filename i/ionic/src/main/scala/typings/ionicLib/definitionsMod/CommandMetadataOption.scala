package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadataOption
  extends atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption {
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
}

object CommandMetadataOption {
  @scala.inline
  def apply(
    name: java.lang.String,
    summary: java.lang.String,
    aliases: js.Array[java.lang.String] = null,
    default: java.lang.String | scala.Boolean = null,
    description: java.lang.String = null,
    footnotes: js.Array[atIonicCliDashFrameworkLib.definitionsMod.Footnote] = null,
    groups: js.Array[java.lang.String] = null,
    hint: java.lang.String = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    spec: atIonicCliDashFrameworkLib.Anon_Value = null,
    `type`: atIonicCliDashFrameworkLib.definitionsMod.CommandOptionType = null
  ): CommandMetadataOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("summary")(summary)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (spec != null) __obj.updateDynamic("spec")(spec)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
}

