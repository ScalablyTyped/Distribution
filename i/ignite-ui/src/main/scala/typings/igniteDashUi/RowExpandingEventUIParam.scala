package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowExpandingEventUIParam extends js.Object {
  /**
  	 * Gets access the hierarchical grid object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the row element for the row that's about to be expanded.
  	 */
  var parentrow: js.UndefOr[String] = js.undefined
}

object RowExpandingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, parentrow: String = null): RowExpandingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (parentrow != null) __obj.updateDynamic("parentrow")(parentrow)
    __obj.asInstanceOf[RowExpandingEventUIParam]
  }
}

