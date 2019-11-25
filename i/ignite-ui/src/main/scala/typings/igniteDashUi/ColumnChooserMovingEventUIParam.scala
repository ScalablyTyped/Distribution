package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnChooserMovingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the Column Chooser element. This is a jQuery object.
  	 */
  var columnChooserElement: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the original position of the column chooser div as { top, left } object, relative to the page.
  	 */
  var originalPosition: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the GridHiding widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the current position of the column chooser div as { top, left } object, relative to the page.
  	 */
  var position: js.UndefOr[js.Any] = js.undefined
}

object ColumnChooserMovingEventUIParam {
  @scala.inline
  def apply(
    columnChooserElement: String = null,
    originalPosition: js.Any = null,
    owner: js.Any = null,
    position: js.Any = null
  ): ColumnChooserMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnChooserElement != null) __obj.updateDynamic("columnChooserElement")(columnChooserElement.asInstanceOf[js.Any])
    if (originalPosition != null) __obj.updateDynamic("originalPosition")(originalPosition.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnChooserMovingEventUIParam]
  }
}

