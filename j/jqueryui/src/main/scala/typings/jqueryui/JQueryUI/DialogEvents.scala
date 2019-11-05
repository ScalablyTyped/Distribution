package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
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
    beforeClose: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    close: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    create: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    drag: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    dragStart: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    dragStop: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    focus: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    open: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    resize: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    resizeStart: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    resizeStop: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null
  ): DialogEvents = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction2(beforeClose))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2(drag))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction2(dragStop))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction2(resize))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction2(resizeStart))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction2(resizeStop))
    __obj.asInstanceOf[DialogEvents]
  }
}

