package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageIndexChangingEventUIParam extends js.Object {
  /**
    * Gets current page index.
    */
  var currentPageIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets new page index.
    */
  var newPageIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object PageIndexChangingEventUIParam {
  @scala.inline
  def apply(
    currentPageIndex: js.UndefOr[Double] = js.undefined,
    newPageIndex: js.UndefOr[Double] = js.undefined,
    owner: js.Any = null
  ): PageIndexChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentPageIndex)) __obj.updateDynamic("currentPageIndex")(currentPageIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newPageIndex)) __obj.updateDynamic("newPageIndex")(newPageIndex.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageIndexChangingEventUIParam]
  }
}

