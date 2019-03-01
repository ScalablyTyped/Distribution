package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownCancelClickedEventUIParam extends js.Object {
  /**
  	 * Gets the column key for which Cancel button is clicked.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the igGridSummaries widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DropDownCancelClickedEventUIParam {
  @scala.inline
  def apply(columnKey: java.lang.String = null, owner: js.Any = null): DropDownCancelClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DropDownCancelClickedEventUIParam]
  }
}

