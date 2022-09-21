package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementClientidHashclientid
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaHashClientIdRequest] = js.undefined
}
object ParamsResourceManagementClientidHashclientid {
  
  inline def apply(): ParamsResourceManagementClientidHashclientid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementClientidHashclientid]
  }
  
  extension [Self <: ParamsResourceManagementClientidHashclientid](x: Self) {
    
    inline def setRequestBody(value: SchemaHashClientIdRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
