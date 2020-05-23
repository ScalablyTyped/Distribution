package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSizeChangingEventUIParam extends js.Object {
  /**
    * Gets the current page size.
    */
  var currentPageSize: js.UndefOr[Double] = js.undefined
  /**
    * Gets the new page size.
    */
  var newPageSize: js.UndefOr[Double] = js.undefined
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object PageSizeChangingEventUIParam {
  @scala.inline
  def apply(
    currentPageSize: js.UndefOr[Double] = js.undefined,
    newPageSize: js.UndefOr[Double] = js.undefined,
    owner: js.Any = null
  ): PageSizeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentPageSize)) __obj.updateDynamic("currentPageSize")(currentPageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newPageSize)) __obj.updateDynamic("newPageSize")(newPageSize.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSizeChangingEventUIParam]
  }
}

