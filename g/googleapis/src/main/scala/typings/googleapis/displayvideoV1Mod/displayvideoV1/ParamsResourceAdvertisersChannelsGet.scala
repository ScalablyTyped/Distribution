package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersChannelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that owns the fetched channel.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the channel to fetch.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that owns the fetched channel.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersChannelsGet {
  
  inline def apply(): ParamsResourceAdvertisersChannelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersChannelsGet]
  }
  
  extension [Self <: ParamsResourceAdvertisersChannelsGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
