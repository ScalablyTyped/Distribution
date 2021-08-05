package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupInterfaceMod {
  
  trait RadioChangeEventDetail extends StObject {
    
    var checked: Boolean
    
    var value: js.Any
  }
  object RadioChangeEventDetail {
    
    inline def apply(checked: Boolean, value: js.Any): RadioChangeEventDetail = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioChangeEventDetail]
    }
    
    extension [Self <: RadioChangeEventDetail](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioGroupChangeEventDetail extends StObject {
    
    var value: js.Any
  }
  object RadioGroupChangeEventDetail {
    
    inline def apply(value: js.Any): RadioGroupChangeEventDetail = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupChangeEventDetail]
    }
    
    extension [Self <: RadioGroupChangeEventDetail](x: Self) {
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
