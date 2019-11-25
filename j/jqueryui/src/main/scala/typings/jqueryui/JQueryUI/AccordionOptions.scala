package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
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
    activate: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit = null,
    active: js.Any = null,
    animate: js.Any = null,
    beforeActivate: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    create: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    event: String = null,
    header: String = null,
    heightStyle: String = null,
    icons: js.Any = null
  ): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2(beforeActivate))
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (heightStyle != null) __obj.updateDynamic("heightStyle")(heightStyle.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionOptions]
  }
}

