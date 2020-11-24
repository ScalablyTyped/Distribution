package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.anon.After
import typings.knockout.anon.AfterInit
import typings.knockout.anon.AfterInitUpdate
import typings.knockout.anon.Init
import typings.knockout.anon.InitUpdate
import typings.knockout.anon.Preprocess
import typings.knockout.anon.Update
import typings.knockout.anon.`0`
import typings.knockout.anon.`10`
import typings.knockout.anon.`11`
import typings.knockout.anon.`12`
import typings.knockout.anon.`1`
import typings.knockout.anon.`2`
import typings.knockout.anon.`3`
import typings.knockout.anon.`4`
import typings.knockout.anon.`5`
import typings.knockout.anon.`6`
import typings.knockout.anon.`7`
import typings.knockout.anon.`8`
import typings.knockout.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingHandlers_ extends /* name */ StringDictionary[BindingHandler[_]] {
  
  var attr: `2` = js.native
  
  var checked: AfterInit = js.native
  
  var checkedValue: Update = js.native
  
  var `class`: `0` = js.native
  
  var click: `7` = js.native
  
  var component: `12` = js.native
  
  var css: `1` = js.native
  
  var disable: Update = js.native
  
  var enable: Update = js.native
  
  // Working with form fields
  var event: `6` = js.native
  
  // Control Flow
  var foreach: `3` = js.native
  
  var hasFocus: InitUpdate = js.native
  
  var hasfocus: InitUpdate = js.native
  
  var hidden: Update = js.native
  
  var html: Init = js.native
  
  var `if`: `4` = js.native
  
  var ifnot: `4` = js.native
  
  var let: `5` = js.native
  
  var options: `9` = js.native
  
  var selectedOptions: AfterInitUpdate = js.native
  
  var style: `2` = js.native
  
  var submit: `7` = js.native
  
  var template: `11` = js.native
  
  var text: Init = js.native
  
  var textInput: `8` = js.native
  
  var textinput: Preprocess = js.native
  
  var uniqueName: `10` = js.native
  
  var using: `4` = js.native
  
  var value: After = js.native
  
  // Controlling text and appearance
  var visible: Update = js.native
  
  var `with`: `4` = js.native
}
object BindingHandlers_ {
  
  @scala.inline
  def apply(
    attr: `2`,
    checked: AfterInit,
    checkedValue: Update,
    `class`: `0`,
    click: `7`,
    component: `12`,
    css: `1`,
    disable: Update,
    enable: Update,
    event: `6`,
    foreach: `3`,
    hasFocus: InitUpdate,
    hasfocus: InitUpdate,
    hidden: Update,
    html: Init,
    `if`: `4`,
    ifnot: `4`,
    let: `5`,
    options: `9`,
    selectedOptions: AfterInitUpdate,
    style: `2`,
    submit: `7`,
    template: `11`,
    text: Init,
    textInput: `8`,
    textinput: Preprocess,
    uniqueName: `10`,
    using: `4`,
    value: After,
    visible: Update,
    `with`: `4`
  ): BindingHandlers_ = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], checkedValue = checkedValue.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], foreach = foreach.asInstanceOf[js.Any], hasFocus = hasFocus.asInstanceOf[js.Any], hasfocus = hasfocus.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ifnot = ifnot.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedOptions = selectedOptions.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textInput = textInput.asInstanceOf[js.Any], textinput = textinput.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingHandlers_]
  }
  
  @scala.inline
  implicit class BindingHandlers_Ops[Self <: BindingHandlers_] (val x: Self) extends AnyVal {
    
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
    def setAttr(value: `2`): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecked(value: AfterInit): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedValue(value: Update): Self = this.set("checkedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: `0`): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: `7`): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: `12`): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: `1`): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable(value: Update): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Update): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: `6`): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeach(value: `3`): Self = this.set("foreach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFocus(value: InitUpdate): Self = this.set("hasFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Update): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: Init): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf(value: `4`): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfnot(value: `4`): Self = this.set("ifnot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLet(value: `5`): Self = this.set("let", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: `9`): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOptions(value: AfterInitUpdate): Self = this.set("selectedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: `2`): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: `7`): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: `11`): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Init): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInput(value: `8`): Self = this.set("textInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: `10`): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsing(value: `4`): Self = this.set("using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: After): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Update): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWith(value: `4`): Self = this.set("with", value.asInstanceOf[js.Any])
  }
}
