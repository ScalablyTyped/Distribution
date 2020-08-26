package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a UserProfile resource.
  */
@js.native
trait SchemaUserProfile extends js.Object {
  /**
    * The account ID to which this profile belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The account name this profile belongs to.
    */
  var accountName: js.UndefOr[String] = js.native
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#userProfile.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The unique ID of the user profile.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * The sub account ID this profile belongs to if applicable.
    */
  var subAccountId: js.UndefOr[String] = js.native
  /**
    * The sub account name this profile belongs to if applicable.
    */
  var subAccountName: js.UndefOr[String] = js.native
  /**
    * The user name.
    */
  var userName: js.UndefOr[String] = js.native
}

object SchemaUserProfile {
  @scala.inline
  def apply(): SchemaUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserProfile]
  }
  @scala.inline
  implicit class SchemaUserProfileOps[Self <: SchemaUserProfile] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setSubAccountId(value: String): Self = this.set("subAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAccountId: Self = this.set("subAccountId", js.undefined)
    @scala.inline
    def setSubAccountName(value: String): Self = this.set("subAccountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAccountName: Self = this.set("subAccountName", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

