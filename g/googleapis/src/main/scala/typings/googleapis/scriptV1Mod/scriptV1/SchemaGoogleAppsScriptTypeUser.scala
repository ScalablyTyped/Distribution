package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple user profile resource.
  */
@js.native
trait SchemaGoogleAppsScriptTypeUser extends js.Object {
  /**
    * The user&#39;s domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The user&#39;s identifying email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The user&#39;s display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The user&#39;s photo.
    */
  var photoUrl: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeUser {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeUser]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeUserOps[Self <: SchemaGoogleAppsScriptTypeUser] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
  }
  
}

