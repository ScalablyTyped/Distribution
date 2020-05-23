package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorSerialization extends js.Object {
  var custom: js.UndefOr[js.Function] = js.undefined
  var entities: js.UndefOr[Boolean] = js.undefined
  var scripts: js.UndefOr[Boolean] = js.undefined
  var semantic: js.UndefOr[Boolean] = js.undefined
}

object EditorSerialization {
  @scala.inline
  def apply(
    custom: js.Function = null,
    entities: js.UndefOr[Boolean] = js.undefined,
    scripts: js.UndefOr[Boolean] = js.undefined,
    semantic: js.UndefOr[Boolean] = js.undefined
  ): EditorSerialization = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scripts)) __obj.updateDynamic("scripts")(scripts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(semantic)) __obj.updateDynamic("semantic")(semantic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSerialization]
  }
}

