package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummariesTogglingEventUIParam extends js.Object {
  /**
  	 * Gets whether summaries are shown or not.
  	 */
  var isToShow: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the igGridSummaries widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object SummariesTogglingEventUIParam {
  @scala.inline
  def apply(isToShow: js.UndefOr[Boolean] = js.undefined, owner: js.Any = null): SummariesTogglingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isToShow)) __obj.updateDynamic("isToShow")(isToShow)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[SummariesTogglingEventUIParam]
  }
}

