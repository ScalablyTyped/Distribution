package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorSerialization extends js.Object {
  var custom: js.UndefOr[js.Function] = js.undefined
  var entities: js.UndefOr[scala.Boolean] = js.undefined
  var scripts: js.UndefOr[scala.Boolean] = js.undefined
  var semantic: js.UndefOr[scala.Boolean] = js.undefined
}

object EditorSerialization {
  @scala.inline
  def apply(
    custom: js.Function = null,
    entities: js.UndefOr[scala.Boolean] = js.undefined,
    scripts: js.UndefOr[scala.Boolean] = js.undefined,
    semantic: js.UndefOr[scala.Boolean] = js.undefined
  ): EditorSerialization = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities)
    if (!js.isUndefined(scripts)) __obj.updateDynamic("scripts")(scripts)
    if (!js.isUndefined(semantic)) __obj.updateDynamic("semantic")(semantic)
    __obj.asInstanceOf[EditorSerialization]
  }
}

