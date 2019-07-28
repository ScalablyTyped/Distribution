package typings.igniteDashUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridHeadersRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the igGrid widget, which holds the headers.
  	 */
  var grid: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the headers table DOM element.
  	 */
  var table: js.UndefOr[Element] = js.undefined
}

object PivotGridHeadersRenderedEventUIParam {
  @scala.inline
  def apply(grid: js.Any = null, owner: js.Any = null, table: Element = null): PivotGridHeadersRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[PivotGridHeadersRenderedEventUIParam]
  }
}

