package typings
package knockoutDashPagingLib

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
  var hasfocus: KnockoutBindingHandler
  var html: KnockoutBindingHandler
  var `if`: KnockoutBindingHandler
  var ifnot: KnockoutBindingHandler
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
    hasfocus: KnockoutBindingHandler,
    html: KnockoutBindingHandler,
    `if`: KnockoutBindingHandler,
    ifnot: KnockoutBindingHandler,
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
    val __obj = js.Dynamic.literal(attr = attr, checked = checked, click = click, component = component, css = css, disable = disable, enable = enable, event = event, foreach = foreach, hasfocus = hasfocus, html = html, ifnot = ifnot, options = options, selectedOptions = selectedOptions, style = style, submit = submit, template = template, text = text, textInput = textInput, uniqueName = uniqueName, value = value, visible = visible)
    __obj.updateDynamic("if")(`if`)
    __obj.updateDynamic("with")(`with`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

