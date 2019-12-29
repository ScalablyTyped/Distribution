package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableClasses extends js.Object {
  var `ui-draggable`: js.UndefOr[String] = js.undefined
  var `ui-draggable-disabled`: js.UndefOr[String] = js.undefined
  var `ui-draggable-dragging`: js.UndefOr[String] = js.undefined
  var `ui-draggable-handle`: js.UndefOr[String] = js.undefined
}

object DraggableClasses {
  @scala.inline
  def apply(
    `ui-draggable`: String = null,
    `ui-draggable-disabled`: String = null,
    `ui-draggable-dragging`: String = null,
    `ui-draggable-handle`: String = null
  ): DraggableClasses = {
    val __obj = js.Dynamic.literal()
    if (`ui-draggable` != null) __obj.updateDynamic("ui-draggable")(`ui-draggable`.asInstanceOf[js.Any])
    if (`ui-draggable-disabled` != null) __obj.updateDynamic("ui-draggable-disabled")(`ui-draggable-disabled`.asInstanceOf[js.Any])
    if (`ui-draggable-dragging` != null) __obj.updateDynamic("ui-draggable-dragging")(`ui-draggable-dragging`.asInstanceOf[js.Any])
    if (`ui-draggable-handle` != null) __obj.updateDynamic("ui-draggable-handle")(`ui-draggable-handle`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableClasses]
  }
}

