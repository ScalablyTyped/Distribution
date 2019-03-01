package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownOKClickedEventUIParam extends js.Object {
  /**
  	 * Gets the column key for which OK button is clicked.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets data for summary methods. Format of event data is {type: "min", active: false};
  	 */
  var eventData: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the igGridSummaries widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DropDownOKClickedEventUIParam {
  @scala.inline
  def apply(columnKey: java.lang.String = null, eventData: js.Any = null, owner: js.Any = null): DropDownOKClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (eventData != null) __obj.updateDynamic("eventData")(eventData)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DropDownOKClickedEventUIParam]
  }
}

