package typings.keycloakJs.keycloakAuthzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationRequest extends js.Object {
  /**
    * Defines whether or not this authorization request should include the current RPT. If set to true, the RPT will
    * be sent and permissions in the current RPT will be included in the new RPT. Otherwise, only the permissions referenced in this
    * authorization request will be granted in the new RPT.
    */
  var incrementalAuthorization: js.UndefOr[Boolean] = js.native
  /**
    * Defines additional information about this authorization request in order to specify how it should be processed
    * by the server.
    */
  var metadata: js.UndefOr[AuthorizationRequestMetadata] = js.native
  /**
    * An array of objects representing the resource and scopes.
    */
  var permissions: js.UndefOr[js.Array[ResourcePermission]] = js.native
  /**
    * A boolean value indicating whether the server should create permission requests to the resources
    * and scopes referenced by a permission ticket. This parameter will only take effect when used together
    * with the ticket parameter as part of a UMA authorization process.
    */
  var submitRequest: js.UndefOr[Boolean] = js.native
  /**
    * A permission ticket obtained from a resource server when using UMA authorization protocol.
    */
  var ticket: js.UndefOr[String] = js.native
}

object AuthorizationRequest {
  @scala.inline
  def apply(): AuthorizationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationRequest]
  }
  @scala.inline
  implicit class AuthorizationRequestOps[Self <: AuthorizationRequest] (val x: Self) extends AnyVal {
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
    def setIncrementalAuthorization(value: Boolean): Self = this.set("incrementalAuthorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrementalAuthorization: Self = this.set("incrementalAuthorization", js.undefined)
    @scala.inline
    def setMetadata(value: AuthorizationRequestMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[ResourcePermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setSubmitRequest(value: Boolean): Self = this.set("submitRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitRequest: Self = this.set("submitRequest", js.undefined)
    @scala.inline
    def setTicket(value: String): Self = this.set("ticket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicket: Self = this.set("ticket", js.undefined)
  }
  
}

