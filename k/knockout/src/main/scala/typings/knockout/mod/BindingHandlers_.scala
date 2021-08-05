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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingHandlers_
  extends StObject
     with /* name */ StringDictionary[BindingHandler[js.Any]] {
  
  var attr: `2`
  
  var checked: AfterInit
  
  var checkedValue: Update
  
  var `class`: `0`
  
  var click: `7`
  
  var component: `12`
  
  var css: `1`
  
  var disable: Update
  
  var enable: Update
  
  // Working with form fields
  var event: `6`
  
  // Control Flow
  var foreach: `3`
  
  var hasFocus: InitUpdate
  
  var hasfocus: InitUpdate
  
  var hidden: Update
  
  var html: Init
  
  var `if`: `4`
  
  var ifnot: `4`
  
  var let: `5`
  
  var options: `9`
  
  var selectedOptions: AfterInitUpdate
  
  var style: `2`
  
  var submit: `7`
  
  var template: `11`
  
  var text: Init
  
  var textInput: `8`
  
  var textinput: Preprocess
  
  var uniqueName: `10`
  
  var `using`: `4`
  
  var value: After
  
  // Controlling text and appearance
  var visible: Update
  
  var `with`: `4`
}
object BindingHandlers_ {
  
  inline def apply(
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
    `using`: `4`,
    value: After,
    visible: Update,
    `with`: `4`
  ): BindingHandlers_ = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], checkedValue = checkedValue.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], foreach = foreach.asInstanceOf[js.Any], hasFocus = hasFocus.asInstanceOf[js.Any], hasfocus = hasfocus.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ifnot = ifnot.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedOptions = selectedOptions.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textInput = textInput.asInstanceOf[js.Any], textinput = textinput.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(`using`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingHandlers_]
  }
  
  extension [Self <: BindingHandlers_](x: Self) {
    
    inline def setAttr(value: `2`): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setChecked(value: AfterInit): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedValue(value: Update): Self = StObject.set(x, "checkedValue", value.asInstanceOf[js.Any])
    
    inline def setClass(value: `0`): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClick(value: `7`): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: `12`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setCss(value: `1`): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: Update): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: Update): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: `6`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setForeach(value: `3`): Self = StObject.set(x, "foreach", value.asInstanceOf[js.Any])
    
    inline def setHasFocus(value: InitUpdate): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Update): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: Init): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setIf(value: `4`): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfnot(value: `4`): Self = StObject.set(x, "ifnot", value.asInstanceOf[js.Any])
    
    inline def setLet(value: `5`): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: `9`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptions(value: AfterInitUpdate): Self = StObject.set(x, "selectedOptions", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: `2`): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: `7`): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: `11`): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setText(value: Init): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextInput(value: `8`): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: `10`): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUsing(value: `4`): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    inline def setValue(value: After): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Update): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWith(value: `4`): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
  }
}
