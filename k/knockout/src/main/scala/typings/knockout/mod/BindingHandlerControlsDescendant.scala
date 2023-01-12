package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingHandlerControlsDescendant extends StObject {
  
  var controlsDescendantBindings: Boolean
}
object BindingHandlerControlsDescendant {
  
  inline def apply(controlsDescendantBindings: Boolean): BindingHandlerControlsDescendant = {
    val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingHandlerControlsDescendant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingHandlerControlsDescendant] (val x: Self) extends AnyVal {
    
    inline def setControlsDescendantBindings(value: Boolean): Self = StObject.set(x, "controlsDescendantBindings", value.asInstanceOf[js.Any])
  }
}
