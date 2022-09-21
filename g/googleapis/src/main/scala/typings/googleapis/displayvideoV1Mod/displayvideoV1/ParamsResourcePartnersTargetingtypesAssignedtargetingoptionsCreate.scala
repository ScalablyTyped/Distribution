package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the partner.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAssignedTargetingOption] = js.undefined
  
  /**
    * Required. Identifies the type of this assigned targeting option. Supported targeting types: * `TARGETING_TYPE_CHANNEL`
    */
  var targetingType: js.UndefOr[String] = js.undefined
}
object ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsCreate {
  
  inline def apply(): ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsCreate]
  }
  
  extension [Self <: ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsCreate](x: Self) {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaAssignedTargetingOption): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
