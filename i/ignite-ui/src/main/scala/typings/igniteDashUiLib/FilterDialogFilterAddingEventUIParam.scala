package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDialogFilterAddingEventUIParam extends js.Object {
  /**
  	 * Gets reference to filters table body DOM element.
  	 */
  var filtersTableBody: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilterDialogFilterAddingEventUIParam {
  @scala.inline
  def apply(filtersTableBody: java.lang.String = null, owner: js.Any = null): FilterDialogFilterAddingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (filtersTableBody != null) __obj.updateDynamic("filtersTableBody")(filtersTableBody)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FilterDialogFilterAddingEventUIParam]
  }
}

