package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropDownClosedEventUIParam extends js.Object {
  /**
  	 * A reference to the hierarchy.
  	 */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}

object FilterDropDownClosedEventUIParam {
  @scala.inline
  def apply(hierarchy: js.Any = null): FilterDropDownClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropDownClosedEventUIParam]
  }
}

