package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomchannelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client which contains the custom channel.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Custom channel to retrieve.
    */
  var customChannelId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomchannelsGet {
  
  inline def apply(): ParamsResourceCustomchannelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomchannelsGet]
  }
  
  extension [Self <: ParamsResourceCustomchannelsGet](x: Self) {
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setCustomChannelId(value: String): Self = StObject.set(x, "customChannelId", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelIdUndefined: Self = StObject.set(x, "customChannelId", js.undefined)
  }
}
