package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser the line item belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. An identifier unique to the targeting type in this line item that identifies the assigned targeting option being requested.
    */
  var assignedTargetingOptionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the line item the assigned targeting option belongs to.
    */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Identifies the type of this assigned targeting option.
    */
  var targetingType: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet {
  
  inline def apply(): ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet]
  }
  
  extension [Self <: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAssignedTargetingOptionId(value: String): Self = StObject.set(x, "assignedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionIdUndefined: Self = StObject.set(x, "assignedTargetingOptionId", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
