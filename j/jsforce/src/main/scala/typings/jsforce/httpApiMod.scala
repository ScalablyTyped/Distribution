package typings.jsforce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpApiMod {
  
  @js.native
  trait HttpApiOptions extends StObject {
    
    var noContentResponse: js.UndefOr[js.Object] = js.native
    
    var responseType: js.UndefOr[String] = js.native
    
    var transport: js.UndefOr[js.Object] = js.native
  }
  object HttpApiOptions {
    
    @scala.inline
    def apply(): HttpApiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpApiOptions]
    }
    
    @scala.inline
    implicit class HttpApiOptionsMutableBuilder[Self <: HttpApiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoContentResponse(value: js.Object): Self = StObject.set(x, "noContentResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoContentResponseUndefined: Self = StObject.set(x, "noContentResponse", js.undefined)
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setTransport(value: js.Object): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
