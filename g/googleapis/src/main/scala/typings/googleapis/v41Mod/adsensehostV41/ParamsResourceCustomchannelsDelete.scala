package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomchannelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client from which to delete the custom channel.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Custom channel to delete.
    */
  var customChannelId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomchannelsDelete {
  
  inline def apply(): ParamsResourceCustomchannelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomchannelsDelete]
  }
  
  extension [Self <: ParamsResourceCustomchannelsDelete](x: Self) {
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setCustomChannelId(value: String): Self = StObject.set(x, "customChannelId", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelIdUndefined: Self = StObject.set(x, "customChannelId", js.undefined)
  }
}
