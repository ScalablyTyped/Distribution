package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirstandthirdpartyaudiencesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that has access to the fetched first and third party audience.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the first and third party audience to fetch.
    */
  var firstAndThirdPartyAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that has access to the fetched first and third party audience.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFirstandthirdpartyaudiencesGet {
  
  inline def apply(): ParamsResourceFirstandthirdpartyaudiencesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirstandthirdpartyaudiencesGet]
  }
  
  extension [Self <: ParamsResourceFirstandthirdpartyaudiencesGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
