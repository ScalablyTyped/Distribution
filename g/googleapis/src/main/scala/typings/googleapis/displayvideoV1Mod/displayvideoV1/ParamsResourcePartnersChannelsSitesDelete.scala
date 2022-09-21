package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersChannelsSitesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that owns the parent channel.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the parent channel to which the site belongs.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that owns the parent channel.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The URL or app ID of the site to delete.
    */
  var urlOrAppId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePartnersChannelsSitesDelete {
  
  inline def apply(): ParamsResourcePartnersChannelsSitesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersChannelsSitesDelete]
  }
  
  extension [Self <: ParamsResourcePartnersChannelsSitesDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setUrlOrAppId(value: String): Self = StObject.set(x, "urlOrAppId", value.asInstanceOf[js.Any])
    
    inline def setUrlOrAppIdUndefined: Self = StObject.set(x, "urlOrAppId", js.undefined)
  }
}
