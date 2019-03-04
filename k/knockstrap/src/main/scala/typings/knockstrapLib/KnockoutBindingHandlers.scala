package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandlers extends js.Object {
  var alert: AlertKnockoutBindingHandler
  var carousel: CarouselKnockoutBindingHandler
  var checkbox: knockoutLib.KnockoutBindingHandler[_, _, _]
  var modal: ModalKnockoutBindingHandler
  var popover: PopoverKnockoutBindingHandler
  var progress: ProgressKnockoutBindingHandler
  var radio: knockoutLib.KnockoutBindingHandler[_, _, _]
  var toggle: knockoutLib.KnockoutBindingHandler[_, _, _]
  var tooltip: knockoutLib.KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    alert: AlertKnockoutBindingHandler,
    carousel: CarouselKnockoutBindingHandler,
    checkbox: knockoutLib.KnockoutBindingHandler[_, _, _],
    modal: ModalKnockoutBindingHandler,
    popover: PopoverKnockoutBindingHandler,
    progress: ProgressKnockoutBindingHandler,
    radio: knockoutLib.KnockoutBindingHandler[_, _, _],
    toggle: knockoutLib.KnockoutBindingHandler[_, _, _],
    tooltip: knockoutLib.KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(alert = alert, carousel = carousel, checkbox = checkbox, modal = modal, popover = popover, progress = progress, radio = radio, toggle = toggle, tooltip = tooltip)
  
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

