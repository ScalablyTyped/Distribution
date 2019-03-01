package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttColumn extends js.Object {
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object GanttColumn {
  @scala.inline
  def apply(
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    format: java.lang.String = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    width: java.lang.String | scala.Double = null
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

