package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorTool extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var exec: js.UndefOr[js.Function] = js.undefined
  var items: js.UndefOr[js.Array[EditorToolItem]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var palette: js.UndefOr[String | js.Any] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object EditorTool {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    exec: js.Function = null,
    items: js.Array[EditorToolItem] = null,
    name: String = null,
    palette: String | js.Any = null,
    template: String = null,
    tooltip: String = null
  ): EditorTool = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorTool]
  }
}

