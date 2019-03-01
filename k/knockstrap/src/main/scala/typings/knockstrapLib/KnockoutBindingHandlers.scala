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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alert")(alert)
    __obj.updateDynamic("carousel")(carousel)
    __obj.updateDynamic("checkbox")(checkbox)
    __obj.updateDynamic("modal")(modal)
    __obj.updateDynamic("popover")(popover)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("radio")(radio)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

