package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowExpandedEventUIParam extends js.Object {
  /**
  	 * Gets access the hierarchical grid object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the row element for the row that was expanded.
  	 */
  var parentrow: js.UndefOr[java.lang.String] = js.undefined
}

object RowExpandedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, parentrow: java.lang.String = null): RowExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (parentrow != null) __obj.updateDynamic("parentrow")(parentrow)
    __obj.asInstanceOf[RowExpandedEventUIParam]
  }
}

