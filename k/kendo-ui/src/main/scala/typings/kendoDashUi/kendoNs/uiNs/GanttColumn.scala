package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttColumn extends js.Object {
  var editable: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object GanttColumn {
  @scala.inline
  def apply(
    editable: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    format: String = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: String | Double = null
  ): GanttColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (field != null) __obj.updateDynamic("field")(field)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttColumn]
  }
}

