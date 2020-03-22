package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuOpeningEventUIParam extends js.Object {
  /**
  	 * Get the [area](ig.spreadsheet.SpreadsheetContextMenuArea) for which the menu is being displayed.
  	 */
  var menuArea: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ContextMenuOpeningEventUIParam {
  @scala.inline
  def apply(menuArea: String = null, owner: js.Any = null): ContextMenuOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (menuArea != null) __obj.updateDynamic("menuArea")(menuArea.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuOpeningEventUIParam]
  }
}

