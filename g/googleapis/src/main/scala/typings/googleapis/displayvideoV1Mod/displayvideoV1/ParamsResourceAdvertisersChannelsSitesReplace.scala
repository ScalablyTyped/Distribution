package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersChannelsSitesReplace
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that owns the parent channel.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the parent channel whose sites will be replaced.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReplaceSitesRequest] = js.undefined
}
object ParamsResourceAdvertisersChannelsSitesReplace {
  
  inline def apply(): ParamsResourceAdvertisersChannelsSitesReplace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersChannelsSitesReplace]
  }
  
  extension [Self <: ParamsResourceAdvertisersChannelsSitesReplace](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setRequestBody(value: SchemaReplaceSitesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
