package typings.jqueryui.JQueryUI

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Accordion //////////////////////////////////////////////////
trait AccordionOptions extends AccordionEvents {
  var active: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var animate: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var heightStyle: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
}

object AccordionOptions {
  @scala.inline
  def apply(
    activate: (/* event */ Event, /* ui */ AccordionUIParams) => Unit = null,
    active: js.Any = null,
    animate: js.Any = null,
    beforeActivate: (/* event */ Event, /* ui */ AccordionUIParams) => Unit = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    create: (/* event */ Event, /* ui */ AccordionUIParams) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    event: String = null,
    header: String = null,
    heightStyle: String = null,
    icons: js.Any = null
  ): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (active != null) __obj.updateDynamic("active")(active)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2(beforeActivate))
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (event != null) __obj.updateDynamic("event")(event)
    if (header != null) __obj.updateDynamic("header")(header)
    if (heightStyle != null) __obj.updateDynamic("heightStyle")(heightStyle)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    __obj.asInstanceOf[AccordionOptions]
  }
}

