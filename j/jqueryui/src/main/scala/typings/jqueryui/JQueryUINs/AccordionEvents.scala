package typings.jqueryui.JQueryUINs

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
    activate: AccordionEvent = null,
    beforeActivate: AccordionEvent = null,
    create: AccordionEvent = null
  ): AccordionEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(beforeActivate)
    if (create != null) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[AccordionEvents]
  }
}

