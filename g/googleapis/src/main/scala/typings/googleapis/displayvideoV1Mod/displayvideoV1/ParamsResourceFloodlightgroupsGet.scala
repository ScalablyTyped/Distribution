package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFloodlightgroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the Floodlight group to fetch.
    */
  var floodlightGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The partner context by which the Floodlight group is being accessed.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFloodlightgroupsGet {
  
  inline def apply(): ParamsResourceFloodlightgroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFloodlightgroupsGet]
  }
  
  extension [Self <: ParamsResourceFloodlightgroupsGet](x: Self) {
    
    inline def setFloodlightGroupId(value: String): Self = StObject.set(x, "floodlightGroupId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightGroupIdUndefined: Self = StObject.set(x, "floodlightGroupId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
