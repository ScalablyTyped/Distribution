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
    val __obj = js.Dynamic.literal(attr = attr, checked = checked, click = click, component = component, css = css, disable = disable, enable = enable, event = event, foreach = foreach, hasfocus = hasfocus, html = html, ifnot = ifnot, options = options, selectedOptions = selectedOptions, style = style, submit = submit, template = template, text = text, textInput = textInput, uniqueName = uniqueName, value = value, visible = visible)
    __obj.updateDynamic("if")(`if`)
    __obj.updateDynamic("with")(`with`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

