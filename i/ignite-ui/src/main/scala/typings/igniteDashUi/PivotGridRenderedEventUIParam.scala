package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridRenderedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the igGrid widget, which represents the data.
  	 */
  var grid: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object PivotGridRenderedEventUIParam {
  @scala.inline
  def apply(grid: js.Any = null, owner: js.Any = null): PivotGridRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridRenderedEventUIParam]
  }
}

