package typings
package materialDashUiDashDatatablesLib.materialDashUiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Align right */
  var alignRight: js.UndefOr[scala.Boolean] = js.undefined
  /** Class name to use */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** The element key */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Label */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Render function. Given the value extracted
    * from the row; and the row also. Can return JSX content.
    * @param value - the extracted value from data
    * @param row - the data object representing this row
    * @returns Any react node (JSX compatible return)
    */
  var render: js.UndefOr[js.Function2[/* value */ js.Any, /* row */ js.Any, _]] = js.undefined
  /** If the column is sortable */
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  /** Style for column */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /** Cell tooltip */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    alignRight: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    key: java.lang.String = null,
    label: java.lang.String = null,
    render: (/* value */ js.Any, /* row */ js.Any) => _ = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    tooltip: java.lang.String = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignRight)) __obj.updateDynamic("alignRight")(alignRight)
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[Column]
  }
}

