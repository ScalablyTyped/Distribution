package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropDownOpeningEventUIParam extends js.Object {
  /**
  	 * A reference to the hierarchy.
  	 */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}

object FilterDropDownOpeningEventUIParam {
  @scala.inline
  def apply(hierarchy: js.Any = null): FilterDropDownOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropDownOpeningEventUIParam]
  }
}

