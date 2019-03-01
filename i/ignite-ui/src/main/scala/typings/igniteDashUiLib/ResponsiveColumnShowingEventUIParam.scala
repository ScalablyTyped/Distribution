package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveColumnShowingEventUIParam extends js.Object {
  /**
  	 * Gets the shown column index. Has a value only if the column's key is a number.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the shown column key. Has a value only if the column's key is a string.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the reference to the igGridResponsive widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ResponsiveColumnShowingEventUIParam {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    owner: js.Any = null
  ): ResponsiveColumnShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ResponsiveColumnShowingEventUIParam]
  }
}

