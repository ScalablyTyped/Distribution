package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersCampaignsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The unique ID of the advertiser the campaign belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCampaign] = js.undefined
}
object ParamsResourceAdvertisersCampaignsCreate {
  
  inline def apply(): ParamsResourceAdvertisersCampaignsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersCampaignsCreate]
  }
  
  extension [Self <: ParamsResourceAdvertisersCampaignsCreate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setRequestBody(value: SchemaCampaign): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
