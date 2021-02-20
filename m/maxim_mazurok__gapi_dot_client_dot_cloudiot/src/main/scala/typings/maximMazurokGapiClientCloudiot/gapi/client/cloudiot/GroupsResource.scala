package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudiot.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends StObject {
  
  var devices: DevicesResource = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: Resource, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error. */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
object GroupsResource {
  
  @scala.inline
  def apply(
    devices: DevicesResource,
    getIamPolicy: (Resource, GetIamPolicyRequest) => Request[Policy],
    setIamPolicy: (Resource, SetIamPolicyRequest) => Request[Policy],
    testIamPermissions: (Resource, TestIamPermissionsRequest) => Request[TestIamPermissionsResponse]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], getIamPolicy = js.Any.fromFunction2(getIamPolicy), setIamPolicy = js.Any.fromFunction2(setIamPolicy), testIamPermissions = js.Any.fromFunction2(testIamPermissions))
    __obj.asInstanceOf[GroupsResource]
  }
  
  @scala.inline
  implicit class GroupsResourceMutableBuilder[Self <: GroupsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: DevicesResource): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIamPolicy(value: (Resource, GetIamPolicyRequest) => Request[Policy]): Self = StObject.set(x, "getIamPolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetIamPolicy(value: (Resource, SetIamPolicyRequest) => Request[Policy]): Self = StObject.set(x, "setIamPolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTestIamPermissions(value: (Resource, TestIamPermissionsRequest) => Request[TestIamPermissionsResponse]): Self = StObject.set(x, "testIamPermissions", js.Any.fromFunction2(value))
  }
}
