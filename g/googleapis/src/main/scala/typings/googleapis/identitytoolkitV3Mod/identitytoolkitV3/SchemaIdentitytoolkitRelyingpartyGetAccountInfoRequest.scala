package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to get the account information.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest extends js.Object {
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The list of emails of the users to inquiry.
    */
  var email: js.UndefOr[js.Array[String]] = js.native
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The list of local ID&#39;s of the users to inquiry.
    */
  var localId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Privileged caller can query users by specified phone number.
    */
  var phoneNumber: js.UndefOr[js.Array[String]] = js.native
}

object SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest] (val x: Self) extends AnyVal {
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
    def setDelegatedProjectNumber(value: String): Self = this.set("delegatedProjectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegatedProjectNumber: Self = this.set("delegatedProjectNumber", js.undefined)
    @scala.inline
    def setEmailVarargs(value: String*): Self = this.set("email", js.Array(value :_*))
    @scala.inline
    def setEmail(value: js.Array[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setLocalIdVarargs(value: String*): Self = this.set("localId", js.Array(value :_*))
    @scala.inline
    def setLocalId(value: js.Array[String]): Self = this.set("localId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    @scala.inline
    def setPhoneNumberVarargs(value: String*): Self = this.set("phoneNumber", js.Array(value :_*))
    @scala.inline
    def setPhoneNumber(value: js.Array[String]): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
  }
  
}

