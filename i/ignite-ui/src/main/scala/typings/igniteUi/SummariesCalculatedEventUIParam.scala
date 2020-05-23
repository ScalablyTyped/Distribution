package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummariesCalculatedEventUIParam extends js.Object {
  /**
    * Gets the data for calculated summaries.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object SummariesCalculatedEventUIParam {
  @scala.inline
  def apply(data: js.Array[_] = null, owner: js.Any = null): SummariesCalculatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummariesCalculatedEventUIParam]
  }
}

