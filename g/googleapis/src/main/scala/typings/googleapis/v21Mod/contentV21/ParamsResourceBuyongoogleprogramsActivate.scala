package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyongoogleprogramsActivate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The program region code [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). Currently only US is available.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaActivateBuyOnGoogleProgramRequest] = js.undefined
}
object ParamsResourceBuyongoogleprogramsActivate {
  
  inline def apply(): ParamsResourceBuyongoogleprogramsActivate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyongoogleprogramsActivate]
  }
  
  extension [Self <: ParamsResourceBuyongoogleprogramsActivate](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setRequestBody(value: SchemaActivateBuyOnGoogleProgramRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
