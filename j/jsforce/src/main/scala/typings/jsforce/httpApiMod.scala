package typings.jsforce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpApiMod {
  
  trait HttpApiOptions extends StObject {
    
    var noContentResponse: js.UndefOr[js.Object] = js.undefined
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var transport: js.UndefOr[js.Object] = js.undefined
  }
  object HttpApiOptions {
    
    inline def apply(): HttpApiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpApiOptions]
    }
    
    extension [Self <: HttpApiOptions](x: Self) {
      
      inline def setNoContentResponse(value: js.Object): Self = StObject.set(x, "noContentResponse", value.asInstanceOf[js.Any])
      
      inline def setNoContentResponseUndefined: Self = StObject.set(x, "noContentResponse", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTransport(value: js.Object): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
