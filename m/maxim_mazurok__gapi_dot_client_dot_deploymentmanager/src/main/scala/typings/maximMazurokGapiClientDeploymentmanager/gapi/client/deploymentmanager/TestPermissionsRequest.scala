package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPermissionsRequest extends StObject {
  
  /** The set of permissions to check for the 'resource'. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object TestPermissionsRequest {
  
  @scala.inline
  def apply(): TestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPermissionsRequest]
  }
  
  @scala.inline
  implicit class TestPermissionsRequestMutableBuilder[Self <: TestPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
