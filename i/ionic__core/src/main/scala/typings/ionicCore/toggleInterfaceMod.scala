package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleInterfaceMod {
  
  trait ToggleChangeEventDetail extends StObject {
    
    var checked: Boolean
    
    var value: js.Any
  }
  object ToggleChangeEventDetail {
    
    inline def apply(checked: Boolean, value: js.Any): ToggleChangeEventDetail = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleChangeEventDetail]
    }
    
    extension [Self <: ToggleChangeEventDetail](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
