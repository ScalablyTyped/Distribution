package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivePaneChangedEventUIParam extends js.Object {
  /**
  	 * Gets the active cell of the new active pane or null if there is no active pane.
  	 */
  var activeCell: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the current active [pane](ig.spreadsheet.SpreadsheetPane).
  	 */
  var newActivePane: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the previous active [pane](ig.spreadsheet.SpreadsheetPane).
  	 */
  var oldActivePane: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the current visible range of the new active pane or null if there is no active pane.
  	 */
  var visibleRange: js.UndefOr[String] = js.undefined
}

object ActivePaneChangedEventUIParam {
  @scala.inline
  def apply(
    activeCell: String = null,
    newActivePane: js.Any = null,
    oldActivePane: js.Any = null,
    owner: js.Any = null,
    visibleRange: String = null
  ): ActivePaneChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (activeCell != null) __obj.updateDynamic("activeCell")(activeCell)
    if (newActivePane != null) __obj.updateDynamic("newActivePane")(newActivePane)
    if (oldActivePane != null) __obj.updateDynamic("oldActivePane")(oldActivePane)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange)
    __obj.asInstanceOf[ActivePaneChangedEventUIParam]
  }
}

