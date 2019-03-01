package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageIndexChangingEventUIParam extends js.Object {
  /**
  	 * Gets current page index.
  	 */
  var currentPageIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets new page index.
  	 */
  var newPageIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets reference to GridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object PageIndexChangingEventUIParam {
  @scala.inline
  def apply(
    currentPageIndex: scala.Int | scala.Double = null,
    newPageIndex: scala.Int | scala.Double = null,
    owner: js.Any = null
  ): PageIndexChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentPageIndex != null) __obj.updateDynamic("currentPageIndex")(currentPageIndex.asInstanceOf[js.Any])
    if (newPageIndex != null) __obj.updateDynamic("newPageIndex")(newPageIndex.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[PageIndexChangingEventUIParam]
  }
}

