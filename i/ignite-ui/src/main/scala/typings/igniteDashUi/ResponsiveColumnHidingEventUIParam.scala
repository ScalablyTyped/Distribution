package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveColumnHidingEventUIParam extends js.Object {
  /**
  	 * Gets the hidden column index. Has a value only if the column's key is a number.
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the hidden column key. Has a value only if the column's key is a string.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the reference to the igGridResponsive widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ResponsiveColumnHidingEventUIParam {
  @scala.inline
  def apply(columnIndex: Int | Double = null, columnKey: String = null, owner: js.Any = null): ResponsiveColumnHidingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveColumnHidingEventUIParam]
  }
}

