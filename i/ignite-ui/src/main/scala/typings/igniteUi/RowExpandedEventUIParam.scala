package typings.igniteUi

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
  var parentrow: js.UndefOr[String] = js.undefined
}

object RowExpandedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, parentrow: String = null): RowExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parentrow != null) __obj.updateDynamic("parentrow")(parentrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowExpandedEventUIParam]
  }
}

