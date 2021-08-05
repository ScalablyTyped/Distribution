package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutControlsDescendantBindings extends StObject {
  
  var controlsDescendantBindings: Boolean
}
object KnockoutControlsDescendantBindings {
  
  inline def apply(controlsDescendantBindings: Boolean): KnockoutControlsDescendantBindings = {
    val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutControlsDescendantBindings]
  }
  
  extension [Self <: KnockoutControlsDescendantBindings](x: Self) {
    
    inline def setControlsDescendantBindings(value: Boolean): Self = StObject.set(x, "controlsDescendantBindings", value.asInstanceOf[js.Any])
  }
}
