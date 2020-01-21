package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSizeChangedEventUIParam extends js.Object {
  /**
  	 * Gets reference to GridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the current page size.
  	 */
  var pageSize: js.UndefOr[Double] = js.undefined
}

object PageSizeChangedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, pageSize: Int | Double = null): PageSizeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSizeChangedEventUIParam]
  }
}

