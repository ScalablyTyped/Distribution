package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivePaneChangedEventUIParam extends js.Object {
  /**
    * Gets the active cell of the new active pane or null if there is no active pane.
    */
  var activeCell: js.UndefOr[String] = js.native
  /**
    * Gets the current active [pane](ig.spreadsheet.SpreadsheetPane).
    */
  var newActivePane: js.UndefOr[js.Any] = js.native
  /**
    * Gets the previous active [pane](ig.spreadsheet.SpreadsheetPane).
    */
  var oldActivePane: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the current visible range of the new active pane or null if there is no active pane.
    */
  var visibleRange: js.UndefOr[String] = js.native
}

object ActivePaneChangedEventUIParam {
  @scala.inline
  def apply(): ActivePaneChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivePaneChangedEventUIParam]
  }
  @scala.inline
  implicit class ActivePaneChangedEventUIParamOps[Self <: ActivePaneChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveCell(value: String): Self = this.set("activeCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveCell: Self = this.set("activeCell", js.undefined)
    @scala.inline
    def setNewActivePane(value: js.Any): Self = this.set("newActivePane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewActivePane: Self = this.set("newActivePane", js.undefined)
    @scala.inline
    def setOldActivePane(value: js.Any): Self = this.set("oldActivePane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldActivePane: Self = this.set("oldActivePane", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setVisibleRange(value: String): Self = this.set("visibleRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleRange: Self = this.set("visibleRange", js.undefined)
  }
  
}

