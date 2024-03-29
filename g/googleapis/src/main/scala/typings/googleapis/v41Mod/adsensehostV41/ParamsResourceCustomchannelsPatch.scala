package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomchannelsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client in which the custom channel will be updated.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Custom channel to get.
    */
  var customChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomChannel] = js.undefined
}
object ParamsResourceCustomchannelsPatch {
  
  inline def apply(): ParamsResourceCustomchannelsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomchannelsPatch]
  }
  
  extension [Self <: ParamsResourceCustomchannelsPatch](x: Self) {
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setCustomChannelId(value: String): Self = StObject.set(x, "customChannelId", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelIdUndefined: Self = StObject.set(x, "customChannelId", js.undefined)
    
    inline def setRequestBody(value: SchemaCustomChannel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
