package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownOpenedEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var list: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to igCombo.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DropDownOpenedEventUIParam {
  @scala.inline
  def apply(list: js.Any = null, owner: js.Any = null): DropDownOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (list != null) __obj.updateDynamic("list")(list)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DropDownOpenedEventUIParam]
  }
}

