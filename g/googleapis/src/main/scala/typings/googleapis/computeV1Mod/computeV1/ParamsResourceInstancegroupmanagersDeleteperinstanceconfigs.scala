package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the managed instance group. It should conform to RFC1035.
    */
  var instanceGroupManager: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstanceGroupManagersDeletePerInstanceConfigsReq] = js.undefined
  
  /**
    * The name of the zone where the managed instance group is located. It should conform to RFC1035.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs {
  
  inline def apply(): ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs]
  }
  
  extension [Self <: ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs](x: Self) {
    
    inline def setInstanceGroupManager(value: String): Self = StObject.set(x, "instanceGroupManager", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupManagerUndefined: Self = StObject.set(x, "instanceGroupManager", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaInstanceGroupManagersDeletePerInstanceConfigsReq): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
