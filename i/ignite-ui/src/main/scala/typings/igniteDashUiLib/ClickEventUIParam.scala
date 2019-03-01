package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventUIParam extends js.Object {
  /**
  	 * Used to get a reference the igSplitButton element.
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
}

object ClickEventUIParam {
  @scala.inline
  def apply(item: js.Any = null): ClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[ClickEventUIParam]
  }
}

