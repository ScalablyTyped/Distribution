package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchbarInterfaceMod {
  
  trait SearchbarChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SearchbarChangeEventDetail {
    
    inline def apply(): SearchbarChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchbarChangeEventDetail]
    }
    
    extension [Self <: SearchbarChangeEventDetail](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
