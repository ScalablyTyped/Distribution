package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSpreadsheetSelectionChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the [pane](ig.spreadsheet.SpreadsheetPane) for which the selection has changed.
  	 */
  var pane: js.UndefOr[js.Any] = js.undefined
}

object IgSpreadsheetSelectionChangedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, pane: js.Any = null): IgSpreadsheetSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSpreadsheetSelectionChangedEventUIParam]
  }
}

