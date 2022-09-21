package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceContactgroupsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateContactGroupRequest] = js.undefined
  
  /**
    * The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/{contact_group_id\}`.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceContactgroupsUpdate {
  
  inline def apply(): ParamsResourceContactgroupsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsUpdate]
  }
  
  extension [Self <: ParamsResourceContactgroupsUpdate](x: Self) {
    
    inline def setRequestBody(value: SchemaUpdateContactGroupRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
