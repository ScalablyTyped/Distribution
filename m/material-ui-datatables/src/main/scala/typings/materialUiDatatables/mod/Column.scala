package typings.materialUiDatatables.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Align right */
  var alignRight: js.UndefOr[Boolean] = js.undefined
  /** Class name to use */
  var className: js.UndefOr[String] = js.undefined
  /** The element key */
  var key: js.UndefOr[String] = js.undefined
  /** Label */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Render function. Given the value extracted
    * from the row; and the row also. Can return JSX content.
    * @param value - the extracted value from data
    * @param row - the data object representing this row
    * @returns Any react node (JSX compatible return)
    */
  var render: js.UndefOr[js.Function2[/* value */ js.Any, /* row */ js.Any, _]] = js.undefined
  /** If the column is sortable */
  var sortable: js.UndefOr[Boolean] = js.undefined
  /** Style for column */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** Cell tooltip */
  var tooltip: js.UndefOr[String] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    alignRight: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    key: String = null,
    label: String = null,
    render: (/* value */ js.Any, /* row */ js.Any) => _ = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tooltip: String = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignRight)) __obj.updateDynamic("alignRight")(alignRight.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

