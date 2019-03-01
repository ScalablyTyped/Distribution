package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropDownOpenedEventUIParam extends js.Object {
  /**
  	 * A reference to the drop down.
  	 */
  var dropDownElement: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A reference to the hierarchy.
  	 */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}

object FilterDropDownOpenedEventUIParam {
  @scala.inline
  def apply(dropDownElement: java.lang.String = null, hierarchy: js.Any = null): FilterDropDownOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dropDownElement != null) __obj.updateDynamic("dropDownElement")(dropDownElement)
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy)
    __obj.asInstanceOf[FilterDropDownOpenedEventUIParam]
  }
}

