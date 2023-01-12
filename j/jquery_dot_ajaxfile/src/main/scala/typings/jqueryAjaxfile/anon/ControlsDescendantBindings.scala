package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlsDescendantBindings extends StObject {
  
  var controlsDescendantBindings: Boolean
}
object ControlsDescendantBindings {
  
  inline def apply(controlsDescendantBindings: Boolean): ControlsDescendantBindings = {
    val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlsDescendantBindings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlsDescendantBindings] (val x: Self) extends AnyVal {
    
    inline def setControlsDescendantBindings(value: Boolean): Self = StObject.set(x, "controlsDescendantBindings", value.asInstanceOf[js.Any])
  }
}
