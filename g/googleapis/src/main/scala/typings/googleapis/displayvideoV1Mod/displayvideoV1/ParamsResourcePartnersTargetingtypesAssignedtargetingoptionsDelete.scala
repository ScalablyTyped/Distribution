package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the assigned targeting option to delete.
    */
  var assignedTargetingOptionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the partner.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Identifies the type of this assigned targeting option. Supported targeting types: * `TARGETING_TYPE_CHANNEL`
    */
  var targetingType: js.UndefOr[String] = js.undefined
}
object ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsDelete {
  
  inline def apply(): ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsDelete]
  }
  
  extension [Self <: ParamsResourcePartnersTargetingtypesAssignedtargetingoptionsDelete](x: Self) {
    
    inline def setAssignedTargetingOptionId(value: String): Self = StObject.set(x, "assignedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionIdUndefined: Self = StObject.set(x, "assignedTargetingOptionId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
