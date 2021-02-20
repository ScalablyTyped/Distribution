package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualElementsAllowedBindings extends /* name */ StringDictionary[Boolean] {
  
  var component: Boolean = js.native
  
  var foreach: Boolean = js.native
  
  var `if`: Boolean = js.native
  
  var ifnot: Boolean = js.native
  
  var let: Boolean = js.native
  
  var template: Boolean = js.native
  
  var text: Boolean = js.native
  
  var using: Boolean = js.native
  
  var `with`: Boolean = js.native
}
object VirtualElementsAllowedBindings {
  
  @scala.inline
  def apply(
    component: Boolean,
    foreach: Boolean,
    `if`: Boolean,
    ifnot: Boolean,
    let: Boolean,
    template: Boolean,
    text: Boolean,
    using: Boolean,
    `with`: Boolean
  ): VirtualElementsAllowedBindings = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], foreach = foreach.asInstanceOf[js.Any], ifnot = ifnot.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualElementsAllowedBindings]
  }
  
  @scala.inline
  implicit class VirtualElementsAllowedBindingsMutableBuilder[Self <: VirtualElementsAllowedBindings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: Boolean): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeach(value: Boolean): Self = StObject.set(x, "foreach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf(value: Boolean): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfnot(value: Boolean): Self = StObject.set(x, "ifnot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLet(value: Boolean): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: Boolean): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsing(value: Boolean): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWith(value: Boolean): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
  }
}
