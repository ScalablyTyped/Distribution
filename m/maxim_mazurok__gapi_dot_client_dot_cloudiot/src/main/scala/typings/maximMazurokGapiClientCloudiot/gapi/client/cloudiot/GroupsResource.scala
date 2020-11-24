package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudiot.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends js.Object {
  
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
  implicit class GroupsResourceOps[Self <: GroupsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDevices(value: DevicesResource): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIamPolicy(value: (Resource, GetIamPolicyRequest) => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetIamPolicy(value: (Resource, SetIamPolicyRequest) => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTestIamPermissions(value: (Resource, TestIamPermissionsRequest) => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction2(value))
  }
}
