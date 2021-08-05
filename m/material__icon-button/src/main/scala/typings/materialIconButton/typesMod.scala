package typings.materialIconButton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCIconButtonToggleEventDetail extends StObject {
    
    var isOn: Boolean
  }
  object MDCIconButtonToggleEventDetail {
    
    inline def apply(isOn: Boolean): MDCIconButtonToggleEventDetail = {
      val __obj = js.Dynamic.literal(isOn = isOn.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCIconButtonToggleEventDetail]
    }
    
    extension [Self <: MDCIconButtonToggleEventDetail](x: Self) {
      
      inline def setIsOn(value: Boolean): Self = StObject.set(x, "isOn", value.asInstanceOf[js.Any])
    }
  }
}
