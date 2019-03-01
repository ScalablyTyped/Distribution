package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandlers
  extends /* bindingHandler */ org.scalablytyped.runtime.StringDictionary[KnockoutBindingHandler] {
  var attr: KnockoutBindingHandler
  var checked: KnockoutBindingHandler
  // Working with form fields
  var click: KnockoutBindingHandler
  // Components (new for v3.2)
  var component: KnockoutBindingHandler
  var css: KnockoutBindingHandler
  var disable: KnockoutBindingHandler
  var enable: KnockoutBindingHandler
  var event: KnockoutBindingHandler
  // Control Flow
  var foreach: KnockoutBindingHandler
  var foreachInit: KnockoutBindingHandler
  var hasfocus: KnockoutBindingHandler
  var html: KnockoutBindingHandler
  var `if`: KnockoutBindingHandler
  var ifnot: KnockoutBindingHandler
  var init: KnockoutBindingHandler
  var options: KnockoutBindingHandler
  var selectedOptions: KnockoutBindingHandler
  var style: KnockoutBindingHandler
  var submit: KnockoutBindingHandler
  // Rendering templates
  var template: KnockoutBindingHandler
  var text: KnockoutBindingHandler
  var textInput: KnockoutBindingHandler
  var uniqueName: KnockoutBindingHandler
  var value: KnockoutBindingHandler
  // Controlling text and appearance
  var visible: KnockoutBindingHandler
  var `with`: KnockoutBindingHandler
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    attr: KnockoutBindingHandler,
    checked: KnockoutBindingHandler,
    click: KnockoutBindingHandler,
    component: KnockoutBindingHandler,
    css: KnockoutBindingHandler,
    disable: KnockoutBindingHandler,
    enable: KnockoutBindingHandler,
    event: KnockoutBindingHandler,
    foreach: KnockoutBindingHandler,
    foreachInit: KnockoutBindingHandler,
    hasfocus: KnockoutBindingHandler,
    html: KnockoutBindingHandler,
    `if`: KnockoutBindingHandler,
    ifnot: KnockoutBindingHandler,
    init: KnockoutBindingHandler,
    options: KnockoutBindingHandler,
    selectedOptions: KnockoutBindingHandler,
    style: KnockoutBindingHandler,
    submit: KnockoutBindingHandler,
    template: KnockoutBindingHandler,
    text: KnockoutBindingHandler,
    textInput: KnockoutBindingHandler,
    uniqueName: KnockoutBindingHandler,
    value: KnockoutBindingHandler,
    visible: KnockoutBindingHandler,
    `with`: KnockoutBindingHandler,
    StringDictionary: /* bindingHandler */ org.scalablytyped.runtime.StringDictionary[KnockoutBindingHandler] = null
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(`if` = `if`, `with` = `with`)
    __obj.updateDynamic("attr")(attr)
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("foreach")(foreach)
    __obj.updateDynamic("foreachInit")(foreachInit)
    __obj.updateDynamic("hasfocus")(hasfocus)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("ifnot")(ifnot)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("selectedOptions")(selectedOptions)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("template")(template)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("textInput")(textInput)
    __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("visible")(visible)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

