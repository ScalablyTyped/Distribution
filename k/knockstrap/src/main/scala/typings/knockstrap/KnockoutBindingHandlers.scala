package typings.knockstrap

import typings.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandlers extends js.Object {
  var alert: AlertKnockoutBindingHandler
  var carousel: CarouselKnockoutBindingHandler
  var checkbox: KnockoutBindingHandler[_, _, _]
  var modal: ModalKnockoutBindingHandler
  var popover: PopoverKnockoutBindingHandler
  var progress: ProgressKnockoutBindingHandler
  var radio: KnockoutBindingHandler[_, _, _]
  var toggle: KnockoutBindingHandler[_, _, _]
  var tooltip: KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    alert: AlertKnockoutBindingHandler,
    carousel: CarouselKnockoutBindingHandler,
    checkbox: KnockoutBindingHandler[_, _, _],
    modal: ModalKnockoutBindingHandler,
    popover: PopoverKnockoutBindingHandler,
    progress: ProgressKnockoutBindingHandler,
    radio: KnockoutBindingHandler[_, _, _],
    toggle: KnockoutBindingHandler[_, _, _],
    tooltip: KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(alert = alert, carousel = carousel, checkbox = checkbox, modal = modal, popover = popover, progress = progress, radio = radio, toggle = toggle, tooltip = tooltip)
  
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

