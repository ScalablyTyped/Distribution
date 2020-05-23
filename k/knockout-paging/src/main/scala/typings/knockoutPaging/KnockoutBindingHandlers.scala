package typings.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandlers extends // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
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
    StringDictionary: // Ko specific
  /* key */ StringDictionary[KnockoutBindingHandler] = null
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], foreach = foreach.asInstanceOf[js.Any], hasfocus = hasfocus.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ifnot = ifnot.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedOptions = selectedOptions.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textInput = textInput.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

