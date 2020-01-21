package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummariesToggledEventUIParam extends js.Object {
  /**
  	 * Gets whether summaries are shown or not.
  	 */
  var isToShow: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the igGridSummaries widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object SummariesToggledEventUIParam {
  @scala.inline
  def apply(isToShow: js.UndefOr[Boolean] = js.undefined, owner: js.Any = null): SummariesToggledEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isToShow)) __obj.updateDynamic("isToShow")(isToShow.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummariesToggledEventUIParam]
  }
}

