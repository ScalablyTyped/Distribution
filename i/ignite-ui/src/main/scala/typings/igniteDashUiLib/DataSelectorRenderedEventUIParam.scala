package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSelectorRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the data selector.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DataSelectorRenderedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): DataSelectorRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DataSelectorRenderedEventUIParam]
  }
}

