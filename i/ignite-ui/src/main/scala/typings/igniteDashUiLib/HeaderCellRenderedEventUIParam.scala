package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderCellRenderedEventUIParam extends js.Object {
  /**
  	 * Gets the column key.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to header cell DOM element.
  	 */
  var th: js.UndefOr[stdLib.Element] = js.undefined
}

object HeaderCellRenderedEventUIParam {
  @scala.inline
  def apply(columnKey: java.lang.String = null, owner: js.Any = null, th: stdLib.Element = null): HeaderCellRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (th != null) __obj.updateDynamic("th")(th)
    __obj.asInstanceOf[HeaderCellRenderedEventUIParam]
  }
}

