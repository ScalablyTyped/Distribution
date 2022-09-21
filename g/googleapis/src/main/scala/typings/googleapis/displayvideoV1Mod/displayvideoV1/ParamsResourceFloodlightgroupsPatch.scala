package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFloodlightgroupsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The unique ID of the Floodlight group. Assigned by the system.
    */
  var floodlightGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The partner context by which the Floodlight group is being accessed.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFloodlightGroup] = js.undefined
  
  /**
    * Required. The mask to control which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceFloodlightgroupsPatch {
  
  inline def apply(): ParamsResourceFloodlightgroupsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFloodlightgroupsPatch]
  }
  
  extension [Self <: ParamsResourceFloodlightgroupsPatch](x: Self) {
    
    inline def setFloodlightGroupId(value: String): Self = StObject.set(x, "floodlightGroupId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightGroupIdUndefined: Self = StObject.set(x, "floodlightGroupId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaFloodlightGroup): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
