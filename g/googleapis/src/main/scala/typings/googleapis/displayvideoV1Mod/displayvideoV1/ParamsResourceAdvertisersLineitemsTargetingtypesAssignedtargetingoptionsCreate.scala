package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser the line item belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the line item the assigned targeting option will belong to.
    */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAssignedTargetingOption] = js.undefined
  
  /**
    * Required. Identifies the type of this assigned targeting option.
    */
  var targetingType: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate {
  
  inline def apply(): ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate]
  }
  
  extension [Self <: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setRequestBody(value: SchemaAssignedTargetingOption): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
