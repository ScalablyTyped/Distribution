package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsLocationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the account in which to create this location.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * Optional. A unique request ID for the server to detect duplicated requests. We recommend using UUIDs. Max length is 50 characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If true, the request is validated without actually creating the location.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceAccountsLocationsCreate {
  
  inline def apply(): ParamsResourceAccountsLocationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsLocationsCreate]
  }
  
  extension [Self <: ParamsResourceAccountsLocationsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaLocation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
