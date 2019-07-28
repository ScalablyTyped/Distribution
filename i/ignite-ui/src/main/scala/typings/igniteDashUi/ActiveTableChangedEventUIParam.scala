package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveTableChangedEventUIParam extends js.Object {
  /**
  	 * Gets the current active [Table](ig.excel.WorksheetTable).
  	 */
  var newActiveTable: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the previous active [Table](ig.excel.WorksheetTable).
  	 */
  var oldActiveTable: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ActiveTableChangedEventUIParam {
  @scala.inline
  def apply(newActiveTable: js.Any = null, oldActiveTable: js.Any = null, owner: js.Any = null): ActiveTableChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newActiveTable != null) __obj.updateDynamic("newActiveTable")(newActiveTable)
    if (oldActiveTable != null) __obj.updateDynamic("oldActiveTable")(oldActiveTable)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ActiveTableChangedEventUIParam]
  }
}

