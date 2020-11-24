package typings.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutBindingHandlers extends // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
  
  var attr: KnockoutBindingHandler = js.native
  
  var checked: KnockoutBindingHandler = js.native
  
  // Working with form fields
  var click: KnockoutBindingHandler = js.native
  
  // Components (new for v3.2)
  var component: KnockoutBindingHandler = js.native
  
  var css: KnockoutBindingHandler = js.native
  
  var disable: KnockoutBindingHandler = js.native
  
  var enable: KnockoutBindingHandler = js.native
  
  var event: KnockoutBindingHandler = js.native
  
  // Control Flow
  var foreach: KnockoutBindingHandler = js.native
  
  var hasfocus: KnockoutBindingHandler = js.native
  
  var html: KnockoutBindingHandler = js.native
  
  var `if`: KnockoutBindingHandler = js.native
  
  var ifnot: KnockoutBindingHandler = js.native
  
  var options: KnockoutBindingHandler = js.native
  
  var selectedOptions: KnockoutBindingHandler = js.native
  
  var style: KnockoutBindingHandler = js.native
  
  var submit: KnockoutBindingHandler = js.native
  
  // Rendering templates
  var template: KnockoutBindingHandler = js.native
  
  var text: KnockoutBindingHandler = js.native
  
  var textInput: KnockoutBindingHandler = js.native
  
  var uniqueName: KnockoutBindingHandler = js.native
  
  var value: KnockoutBindingHandler = js.native
  
  // Controlling text and appearance
  var visible: KnockoutBindingHandler = js.native
  
  var `with`: KnockoutBindingHandler = js.native
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
    `with`: KnockoutBindingHandler
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], foreach = foreach.asInstanceOf[js.Any], hasfocus = hasfocus.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ifnot = ifnot.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedOptions = selectedOptions.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textInput = textInput.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  
  @scala.inline
  implicit class KnockoutBindingHandlersOps[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttr(value: KnockoutBindingHandler): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecked(value: KnockoutBindingHandler): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: KnockoutBindingHandler): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: KnockoutBindingHandler): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: KnockoutBindingHandler): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable(value: KnockoutBindingHandler): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: KnockoutBindingHandler): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: KnockoutBindingHandler): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeach(value: KnockoutBindingHandler): Self = this.set("foreach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasfocus(value: KnockoutBindingHandler): Self = this.set("hasfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: KnockoutBindingHandler): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf(value: KnockoutBindingHandler): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfnot(value: KnockoutBindingHandler): Self = this.set("ifnot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: KnockoutBindingHandler): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOptions(value: KnockoutBindingHandler): Self = this.set("selectedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: KnockoutBindingHandler): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: KnockoutBindingHandler): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: KnockoutBindingHandler): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: KnockoutBindingHandler): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInput(value: KnockoutBindingHandler): Self = this.set("textInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: KnockoutBindingHandler): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: KnockoutBindingHandler): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: KnockoutBindingHandler): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWith(value: KnockoutBindingHandler): Self = this.set("with", value.asInstanceOf[js.Any])
  }
}
