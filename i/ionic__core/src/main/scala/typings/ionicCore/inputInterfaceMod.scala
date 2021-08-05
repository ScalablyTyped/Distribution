package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInterfaceMod {
  
  trait InputChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object InputChangeEventDetail {
    
    inline def apply(): InputChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputChangeEventDetail]
    }
    
    extension [Self <: InputChangeEventDetail](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
