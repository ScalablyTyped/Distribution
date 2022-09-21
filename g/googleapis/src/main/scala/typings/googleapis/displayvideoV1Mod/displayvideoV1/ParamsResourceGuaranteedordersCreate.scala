package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGuaranteedordersCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that the request is being made within.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that the request is being made within.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGuaranteedOrder] = js.undefined
}
object ParamsResourceGuaranteedordersCreate {
  
  inline def apply(): ParamsResourceGuaranteedordersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGuaranteedordersCreate]
  }
  
  extension [Self <: ParamsResourceGuaranteedordersCreate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaGuaranteedOrder): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
