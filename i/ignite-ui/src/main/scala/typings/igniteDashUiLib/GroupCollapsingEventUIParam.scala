package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupCollapsingEventUIParam extends js.Object {
  /**
  	 * Gets the column object for the current group that is collapsing.
  	 */
  var column: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get a reference to the jQuery object for the column being collapsing (th).
  	 */
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the reference to the GridMultiColumnHeaders widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object GroupCollapsingEventUIParam {
  @scala.inline
  def apply(column: js.Any = null, element: java.lang.String = null, owner: js.Any = null): GroupCollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (element != null) __obj.updateDynamic("element")(element)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[GroupCollapsingEventUIParam]
  }
}

