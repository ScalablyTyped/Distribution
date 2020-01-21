package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowCollapsingEventUIParam extends js.Object {
  /**
  	 * Gets access the hierarchical grid object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the row element for the row that's about to be collapsed.
  	 */
  var parentrow: js.UndefOr[String] = js.undefined
}

object RowCollapsingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, parentrow: String = null): RowCollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parentrow != null) __obj.updateDynamic("parentrow")(parentrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowCollapsingEventUIParam]
  }
}

