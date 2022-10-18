package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsAccountMod {
  
  trait IWhoAmI extends StObject {
    
    var device_id: js.UndefOr[String] = js.undefined
    
    var user_id: String
  }
  object IWhoAmI {
    
    inline def apply(user_id: String): IWhoAmI = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWhoAmI]
    }
    
    extension [Self <: IWhoAmI](x: Self) {
      
      inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      inline def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
}
