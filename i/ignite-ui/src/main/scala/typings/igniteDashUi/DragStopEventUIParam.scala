package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStopEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the helper.
  	 */
  var helper: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the offset.
  	 */
  var offset: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the original position of the draggable element.
  	 */
  var originalPosition: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the current position of the draggable element.
  	 */
  var position: js.UndefOr[js.Any] = js.undefined
}

object DragStopEventUIParam {
  @scala.inline
  def apply(
    helper: String = null,
    offset: js.Any = null,
    originalPosition: js.Any = null,
    position: js.Any = null
  ): DragStopEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (originalPosition != null) __obj.updateDynamic("originalPosition")(originalPosition.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStopEventUIParam]
  }
}

