package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.FederatedId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Respone of setting the account information.
  */
@js.native
trait SchemaSetAccountInfoResponse extends js.Object {
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * If email has been verified.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /**
    * If idToken is STS id token, then this field will be expiration time of
    * STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.native
  /**
    * The Gitkit id token to login the newly sign up user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The fixed string &quot;identitytoolkit#SetAccountInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
  /**
    * The new email the user attempts to change to.
    */
  var newEmail: js.UndefOr[String] = js.native
  /**
    * The user&#39;s hashed password.
    */
  var passwordHash: js.UndefOr[String] = js.native
  /**
    * The photo url of the user.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * The user&#39;s profiles at the associated IdPs.
    */
  var providerUserInfo: js.UndefOr[js.Array[FederatedId]] = js.native
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.native
}

object SchemaSetAccountInfoResponse {
  @scala.inline
  def apply(): SchemaSetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetAccountInfoResponse]
  }
  @scala.inline
  implicit class SchemaSetAccountInfoResponseOps[Self <: SchemaSetAccountInfoResponse] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmailVerified(value: Boolean): Self = this.set("emailVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailVerified: Self = this.set("emailVerified", js.undefined)
    @scala.inline
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    @scala.inline
    def setNewEmail(value: String): Self = this.set("newEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewEmail: Self = this.set("newEmail", js.undefined)
    @scala.inline
    def setPasswordHash(value: String): Self = this.set("passwordHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordHash: Self = this.set("passwordHash", js.undefined)
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    @scala.inline
    def setProviderUserInfoVarargs(value: FederatedId*): Self = this.set("providerUserInfo", js.Array(value :_*))
    @scala.inline
    def setProviderUserInfo(value: js.Array[FederatedId]): Self = this.set("providerUserInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderUserInfo: Self = this.set("providerUserInfo", js.undefined)
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
  }
  
}

