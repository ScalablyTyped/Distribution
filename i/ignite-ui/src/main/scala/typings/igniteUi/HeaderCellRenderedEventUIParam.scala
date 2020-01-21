package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderCellRenderedEventUIParam extends js.Object {
  /**
  	 * Gets the column key.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to header cell DOM element.
  	 */
  var th: js.UndefOr[Element] = js.undefined
}

object HeaderCellRenderedEventUIParam {
  @scala.inline
  def apply(columnKey: String = null, owner: js.Any = null, th: Element = null): HeaderCellRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (th != null) __obj.updateDynamic("th")(th.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderCellRenderedEventUIParam]
  }
}

