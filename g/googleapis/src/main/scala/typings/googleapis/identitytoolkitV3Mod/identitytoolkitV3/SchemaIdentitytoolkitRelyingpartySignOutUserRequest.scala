package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to sign out user.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySignOutUserRequest extends js.Object {
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartySignOutUserRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySignOutUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignOutUserRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySignOutUserRequestOps[Self <: SchemaIdentitytoolkitRelyingpartySignOutUserRequest] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
  }
  
}

