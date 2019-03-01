package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the helper.
  	 */
  var helper: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the data.
  	 */
  var metadata: js.UndefOr[js.Any] = js.undefined
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

object DragEventUIParam {
  @scala.inline
  def apply(
    helper: java.lang.String = null,
    metadata: js.Any = null,
    offset: js.Any = null,
    originalPosition: js.Any = null,
    position: js.Any = null
  ): DragEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (helper != null) __obj.updateDynamic("helper")(helper)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (originalPosition != null) __obj.updateDynamic("originalPosition")(originalPosition)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[DragEventUIParam]
  }
}

