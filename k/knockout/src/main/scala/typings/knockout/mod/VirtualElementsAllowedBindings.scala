package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualElementsAllowedBindings
  extends StObject
     with /* name */ StringDictionary[Boolean] {
  
  var component: Boolean
  
  var foreach: Boolean
  
  var `if`: Boolean
  
  var ifnot: Boolean
  
  var let: Boolean
  
  var template: Boolean
  
  var text: Boolean
  
  var `using`: Boolean
  
  var `with`: Boolean
}
object VirtualElementsAllowedBindings {
  
  inline def apply(
    component: Boolean,
    foreach: Boolean,
    `if`: Boolean,
    ifnot: Boolean,
    let: Boolean,
    template: Boolean,
    text: Boolean,
    `using`: Boolean,
    `with`: Boolean
  ): VirtualElementsAllowedBindings = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], foreach = foreach.asInstanceOf[js.Any], ifnot = ifnot.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(`using`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualElementsAllowedBindings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualElementsAllowedBindings] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: Boolean): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setForeach(value: Boolean): Self = StObject.set(x, "foreach", value.asInstanceOf[js.Any])
    
    inline def setIf(value: Boolean): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfnot(value: Boolean): Self = StObject.set(x, "ifnot", value.asInstanceOf[js.Any])
    
    inline def setLet(value: Boolean): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Boolean): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUsing(value: Boolean): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    inline def setWith(value: Boolean): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
  }
}
