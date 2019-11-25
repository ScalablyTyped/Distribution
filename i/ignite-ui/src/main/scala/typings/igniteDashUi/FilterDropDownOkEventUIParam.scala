package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropDownOkEventUIParam extends js.Object {
  /**
  	 * A reference to the drop down.
  	 */
  var dropDownElement: js.UndefOr[String] = js.undefined
  /**
  	 * A collection with the selected filter members. If all filter members are selected the collection will be empty.
  	 */
  var filterMembers: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * A reference to the hierarchy.
  	 */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}

object FilterDropDownOkEventUIParam {
  @scala.inline
  def apply(dropDownElement: String = null, filterMembers: js.Array[_] = null, hierarchy: js.Any = null): FilterDropDownOkEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dropDownElement != null) __obj.updateDynamic("dropDownElement")(dropDownElement.asInstanceOf[js.Any])
    if (filterMembers != null) __obj.updateDynamic("filterMembers")(filterMembers.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropDownOkEventUIParam]
  }
}

