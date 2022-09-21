package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersInsertionordersTargetingtypesAssignedtargetingoptionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser the insertion order belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. An identifier unique to the targeting type in this insertion order that identifies the assigned targeting option being requested.
    */
  var assignedTargetingOptionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the insertion order the assigned targeting option belongs to.
    */
  var insertionOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Identifies the type of this assigned targeting option.
    */
  var targetingType: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersInsertionordersTargetingtypesAssignedtargetingoptionsGet {
  
  inline def apply(): ParamsResourceAdvertisersInsertionordersTargetingtypesAssignedtargetingoptionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersInsertionordersTargetingtypesAssignedtargetingoptionsGet]
  }
  
  extension [Self <: ParamsResourceAdvertisersInsertionordersTargetingtypesAssignedtargetingoptionsGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAssignedTargetingOptionId(value: String): Self = StObject.set(x, "assignedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionIdUndefined: Self = StObject.set(x, "assignedTargetingOptionId", js.undefined)
    
    inline def setInsertionOrderId(value: String): Self = StObject.set(x, "insertionOrderId", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderIdUndefined: Self = StObject.set(x, "insertionOrderId", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
