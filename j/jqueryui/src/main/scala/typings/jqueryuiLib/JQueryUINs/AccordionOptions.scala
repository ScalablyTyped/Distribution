package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Accordion //////////////////////////////////////////////////
trait AccordionOptions extends AccordionEvents {
  var active: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var animate: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var heightStyle: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
}

object AccordionOptions {
  @scala.inline
  def apply(
    activate: AccordionEvent = null,
    active: js.Any = null,
    animate: js.Any = null,
    beforeActivate: AccordionEvent = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    create: AccordionEvent = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    event: java.lang.String = null,
    header: java.lang.String = null,
    heightStyle: java.lang.String = null,
    icons: js.Any = null
  ): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (active != null) __obj.updateDynamic("active")(active)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(beforeActivate)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (create != null) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (event != null) __obj.updateDynamic("event")(event)
    if (header != null) __obj.updateDynamic("header")(header)
    if (heightStyle != null) __obj.updateDynamic("heightStyle")(heightStyle)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    __obj.asInstanceOf[AccordionOptions]
  }
}

