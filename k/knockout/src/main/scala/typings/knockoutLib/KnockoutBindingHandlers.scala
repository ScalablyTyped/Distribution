package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandlers
  extends /* bindingHandler */ org.scalablytyped.runtime.StringDictionary[KnockoutBindingHandler[_, _, _]] {
  var attr: KnockoutBindingHandler[_, _, _]
  var checked: KnockoutBindingHandler[_, _, _]
  // Working with form fields
  var click: KnockoutBindingHandler[_, _, _]
  // Components (new for v3.2)
  var component: KnockoutBindingHandler[_, _, _]
  var css: KnockoutBindingHandler[_, _, _]
  var disable: KnockoutBindingHandler[_, _, _]
  var enable: KnockoutBindingHandler[_, _, _]
  var event: KnockoutBindingHandler[_, _, _]
  // Control Flow
  var foreach: KnockoutBindingHandler[_, _, _]
  var hasfocus: KnockoutBindingHandler[_, _, _]
  var html: KnockoutBindingHandler[_, _, _]
  var `if`: KnockoutBindingHandler[_, _, _]
  var ifnot: KnockoutBindingHandler[_, _, _]
  var options: KnockoutBindingHandler[_, _, _]
  var selectedOptions: KnockoutBindingHandler[_, _, _]
  var style: KnockoutBindingHandler[_, _, _]
  var submit: KnockoutBindingHandler[_, _, _]
  // Rendering templates
  var template: KnockoutBindingHandler[_, _, _]
  var text: KnockoutBindingHandler[_, _, _]
  var textInput: KnockoutBindingHandler[_, _, _]
  var uniqueName: KnockoutBindingHandler[_, _, _]
  var value: KnockoutBindingHandler[_, _, _]
  // Controlling text and appearance
  var visible: KnockoutBindingHandler[_, _, _]
  var `with`: KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    attr: KnockoutBindingHandler[_, _, _],
    checked: KnockoutBindingHandler[_, _, _],
    click: KnockoutBindingHandler[_, _, _],
    component: KnockoutBindingHandler[_, _, _],
    css: KnockoutBindingHandler[_, _, _],
    disable: KnockoutBindingHandler[_, _, _],
    enable: KnockoutBindingHandler[_, _, _],
    event: KnockoutBindingHandler[_, _, _],
    foreach: KnockoutBindingHandler[_, _, _],
    hasfocus: KnockoutBindingHandler[_, _, _],
    html: KnockoutBindingHandler[_, _, _],
    `if`: KnockoutBindingHandler[_, _, _],
    ifnot: KnockoutBindingHandler[_, _, _],
    options: KnockoutBindingHandler[_, _, _],
    selectedOptions: KnockoutBindingHandler[_, _, _],
    style: KnockoutBindingHandler[_, _, _],
    submit: KnockoutBindingHandler[_, _, _],
    template: KnockoutBindingHandler[_, _, _],
    text: KnockoutBindingHandler[_, _, _],
    textInput: KnockoutBindingHandler[_, _, _],
    uniqueName: KnockoutBindingHandler[_, _, _],
    value: KnockoutBindingHandler[_, _, _],
    visible: KnockoutBindingHandler[_, _, _],
    `with`: KnockoutBindingHandler[_, _, _],
    StringDictionary: /* bindingHandler */ org.scalablytyped.runtime.StringDictionary[KnockoutBindingHandler[_, _, _]] = null
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
    __obj.updateDynamic("hasfocus")(hasfocus)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("ifnot")(ifnot)
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

