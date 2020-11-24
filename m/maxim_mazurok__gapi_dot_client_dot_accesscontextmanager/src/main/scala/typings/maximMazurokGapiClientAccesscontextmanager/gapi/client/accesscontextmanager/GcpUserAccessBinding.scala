package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcpUserAccessBinding extends js.Object {
  
  /**
    * Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example:
    * "accessPolicies/9522/accessLevels/device_trusted"
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the [G Suite Directory API's Groups resource]
    * (https://developers.google.com/admin-sdk/directory/v1/reference/groups#resource). If a group's email address/alias is changed, this resource will continue to point at the changed
    * group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
    */
  var groupKey: js.UndefOr[String] = js.native
  
  /**
    * Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by [RFC 3986 Section
    * 2.3](https://tools.ietf.org/html/rfc3986#section-2.3)). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
    */
  var name: js.UndefOr[String] = js.native
}
object GcpUserAccessBinding {
  
  @scala.inline
  def apply(): GcpUserAccessBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcpUserAccessBinding]
  }
  
  @scala.inline
  implicit class GcpUserAccessBindingOps[Self <: GcpUserAccessBinding] (val x: Self) extends AnyVal {
    
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
    def setAccessLevelsVarargs(value: String*): Self = this.set("accessLevels", js.Array(value :_*))
    
    @scala.inline
    def setAccessLevels(value: js.Array[String]): Self = this.set("accessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLevels: Self = this.set("accessLevels", js.undefined)
    
    @scala.inline
    def setGroupKey(value: String): Self = this.set("groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupKey: Self = this.set("groupKey", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
