package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorTool extends js.Object {
  var columns: js.UndefOr[scala.Double] = js.undefined
  var exec: js.UndefOr[js.Function] = js.undefined
  var items: js.UndefOr[js.Array[EditorToolItem]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var palette: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object EditorTool {
  @scala.inline
  def apply(
    columns: scala.Int | scala.Double = null,
    exec: js.Function = null,
    items: js.Array[EditorToolItem] = null,
    name: java.lang.String = null,
    palette: java.lang.String | js.Any = null,
    template: java.lang.String = null,
    tooltip: java.lang.String = null
  ): EditorTool = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (items != null) __obj.updateDynamic("items")(items)
    if (name != null) __obj.updateDynamic("name")(name)
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[EditorTool]
  }
}

