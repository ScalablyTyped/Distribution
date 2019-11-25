package typings.igniteDashUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowsRenderingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the grid's table body.
  	 */
  var tbody: js.UndefOr[Element] = js.undefined
}

object RowsRenderingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, tbody: Element = null): RowsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (tbody != null) __obj.updateDynamic("tbody")(tbody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsRenderingEventUIParam]
  }
}

