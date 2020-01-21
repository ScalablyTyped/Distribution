package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveColumnShownEventUIParam extends js.Object {
  /**
  	 * Gets the shown column index. Has a value only if the column's key is a number.
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the shown column key. Has a value only if the column's key is a string.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the reference to the igGridResponsive widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ResponsiveColumnShownEventUIParam {
  @scala.inline
  def apply(columnIndex: Int | Double = null, columnKey: String = null, owner: js.Any = null): ResponsiveColumnShownEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveColumnShownEventUIParam]
  }
}

