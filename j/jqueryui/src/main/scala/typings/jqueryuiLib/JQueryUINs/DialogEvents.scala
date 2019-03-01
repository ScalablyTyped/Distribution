package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogEvents extends js.Object {
  var beforeClose: js.UndefOr[DialogEvent] = js.undefined
  var close: js.UndefOr[DialogEvent] = js.undefined
  var create: js.UndefOr[DialogEvent] = js.undefined
  var drag: js.UndefOr[DialogEvent] = js.undefined
  var dragStart: js.UndefOr[DialogEvent] = js.undefined
  var dragStop: js.UndefOr[DialogEvent] = js.undefined
  var focus: js.UndefOr[DialogEvent] = js.undefined
  var open: js.UndefOr[DialogEvent] = js.undefined
  var resize: js.UndefOr[DialogEvent] = js.undefined
  var resizeStart: js.UndefOr[DialogEvent] = js.undefined
  var resizeStop: js.UndefOr[DialogEvent] = js.undefined
}

object DialogEvents {
  @scala.inline
  def apply(
    beforeClose: DialogEvent = null,
    close: DialogEvent = null,
    create: DialogEvent = null,
    drag: DialogEvent = null,
    dragStart: DialogEvent = null,
    dragStop: DialogEvent = null,
    focus: DialogEvent = null,
    open: DialogEvent = null,
    resize: DialogEvent = null,
    resizeStart: DialogEvent = null,
    resizeStop: DialogEvent = null
  ): DialogEvents = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (close != null) __obj.updateDynamic("close")(close)
    if (create != null) __obj.updateDynamic("create")(create)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (dragStop != null) __obj.updateDynamic("dragStop")(dragStop)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (open != null) __obj.updateDynamic("open")(open)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(resizeStart)
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(resizeStop)
    __obj.asInstanceOf[DialogEvents]
  }
}

