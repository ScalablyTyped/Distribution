package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperlinkExecutingEventUIParam extends js.Object {
  /**
  	 * Get the [hyperlink](ig.excel.WorksheetHyperlink) to be executed.
  	 */
  var hyperlink: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object HyperlinkExecutingEventUIParam {
  @scala.inline
  def apply(hyperlink: js.Any = null, owner: js.Any = null): HyperlinkExecutingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkExecutingEventUIParam]
  }
}

