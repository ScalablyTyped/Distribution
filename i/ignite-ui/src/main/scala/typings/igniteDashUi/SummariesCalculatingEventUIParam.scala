package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummariesCalculatingEventUIParam extends js.Object {
  /**
  	 * Gets the igGridSummaries widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object SummariesCalculatingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): SummariesCalculatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummariesCalculatingEventUIParam]
  }
}

