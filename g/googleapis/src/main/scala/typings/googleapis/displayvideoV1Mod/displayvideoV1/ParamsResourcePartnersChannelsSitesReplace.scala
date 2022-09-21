package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersChannelsSitesReplace
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the parent channel whose sites will be replaced.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that owns the parent channel.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReplaceSitesRequest] = js.undefined
}
object ParamsResourcePartnersChannelsSitesReplace {
  
  inline def apply(): ParamsResourcePartnersChannelsSitesReplace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersChannelsSitesReplace]
  }
  
  extension [Self <: ParamsResourcePartnersChannelsSitesReplace](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaReplaceSitesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
