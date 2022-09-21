package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the partner.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBulkEditPartnerAssignedTargetingOptionsRequest] = js.undefined
}
object ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions {
  
  inline def apply(): ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions]
  }
  
  extension [Self <: ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions](x: Self) {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaBulkEditPartnerAssignedTargetingOptionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
