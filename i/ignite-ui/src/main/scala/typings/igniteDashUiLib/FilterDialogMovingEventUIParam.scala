package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDialogMovingEventUIParam extends js.Object {
  /**
  	 * Gets reference to filtering dialog DOM element.
  	 */
  var dialog: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the original position of the groupby dialog div as { top, left } object, relative to the page.
  	 */
  var originalPosition: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the current position of the groupby dialog div as { top, left } object, relative to the page.
  	 */
  var position: js.UndefOr[js.Any] = js.undefined
}

object FilterDialogMovingEventUIParam {
  @scala.inline
  def apply(
    dialog: java.lang.String = null,
    originalPosition: js.Any = null,
    owner: js.Any = null,
    position: js.Any = null
  ): FilterDialogMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dialog != null) __obj.updateDynamic("dialog")(dialog)
    if (originalPosition != null) __obj.updateDynamic("originalPosition")(originalPosition)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[FilterDialogMovingEventUIParam]
  }
}

