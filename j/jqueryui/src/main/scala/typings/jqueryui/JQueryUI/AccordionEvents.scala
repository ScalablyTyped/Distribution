package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionEvents extends js.Object {
  var activate: js.UndefOr[AccordionEvent] = js.undefined
  var beforeActivate: js.UndefOr[AccordionEvent] = js.undefined
  var create: js.UndefOr[AccordionEvent] = js.undefined
}

object AccordionEvents {
  @scala.inline
  def apply(
    activate: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit = null,
    beforeActivate: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit = null,
    create: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit = null
  ): AccordionEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2(beforeActivate))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    __obj.asInstanceOf[AccordionEvents]
  }
}

