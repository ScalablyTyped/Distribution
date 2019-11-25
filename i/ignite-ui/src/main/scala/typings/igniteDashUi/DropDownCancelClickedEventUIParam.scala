package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownCancelClickedEventUIParam extends js.Object {
  /**
  	 * Gets the column key for which Cancel button is clicked.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the igGridSummaries widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DropDownCancelClickedEventUIParam {
  @scala.inline
  def apply(columnKey: String = null, owner: js.Any = null): DropDownCancelClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownCancelClickedEventUIParam]
  }
}

