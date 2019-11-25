package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupExpandedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the jQuery object for the column being expanded (th).
  	 */
  var element: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the reference to the GridMultiColumnHeaders widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object GroupExpandedEventUIParam {
  @scala.inline
  def apply(element: String = null, owner: js.Any = null): GroupExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupExpandedEventUIParam]
  }
}

