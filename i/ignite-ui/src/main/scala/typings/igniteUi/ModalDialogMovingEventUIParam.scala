package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogMovingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the modal dialog element. This is a jQuery object.
  	 */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the original position of the GroupBy Dialog div as { top, left } object, relative to the page.
  	 */
  var originalPosition: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the current position of the GroupBy Dialog div as { top, left } object, relative to the page.
  	 */
  var position: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogMovingEventUIParam {
  @scala.inline
  def apply(
    modalDialogElement: String = null,
    originalPosition: js.Any = null,
    owner: js.Any = null,
    position: js.Any = null
  ): ModalDialogMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (modalDialogElement != null) __obj.updateDynamic("modalDialogElement")(modalDialogElement.asInstanceOf[js.Any])
    if (originalPosition != null) __obj.updateDynamic("originalPosition")(originalPosition.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalDialogMovingEventUIParam]
  }
}

