package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPermissionsResponse extends StObject {
  
  /** A subset of `TestPermissionsRequest.permissions` that the caller is allowed. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object TestPermissionsResponse {
  
  inline def apply(): TestPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPermissionsResponse]
  }
  
  extension [Self <: TestPermissionsResponse](x: Self) {
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
