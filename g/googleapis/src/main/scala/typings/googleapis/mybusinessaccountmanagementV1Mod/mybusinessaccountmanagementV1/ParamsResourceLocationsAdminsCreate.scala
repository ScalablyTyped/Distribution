package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsAdminsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the location this admin is created for. `locations/{location_id\}/admins`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAdmin] = js.undefined
}
object ParamsResourceLocationsAdminsCreate {
  
  inline def apply(): ParamsResourceLocationsAdminsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsAdminsCreate]
  }
  
  extension [Self <: ParamsResourceLocationsAdminsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAdmin): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
