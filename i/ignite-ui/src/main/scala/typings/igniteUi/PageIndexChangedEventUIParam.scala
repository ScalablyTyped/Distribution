package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageIndexChangedEventUIParam extends js.Object {
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the current page index.
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
}

object PageIndexChangedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, pageIndex: js.UndefOr[Double] = js.undefined): PageIndexChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(pageIndex)) __obj.updateDynamic("pageIndex")(pageIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageIndexChangedEventUIParam]
  }
}

