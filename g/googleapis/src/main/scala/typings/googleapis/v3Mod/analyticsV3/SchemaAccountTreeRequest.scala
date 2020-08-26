package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics account tree requests. The account tree
  * request is used in the provisioning api to create an account, property, and
  * view (profile). It contains the basic information required to make these
  * fields.
  */
@js.native
trait SchemaAccountTreeRequest extends js.Object {
  var accountName: js.UndefOr[String] = js.native
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String] = js.native
  var profileName: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var webpropertyName: js.UndefOr[String] = js.native
  var websiteUrl: js.UndefOr[String] = js.native
}

object SchemaAccountTreeRequest {
  @scala.inline
  def apply(): SchemaAccountTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTreeRequest]
  }
  @scala.inline
  implicit class SchemaAccountTreeRequestOps[Self <: SchemaAccountTreeRequest] (val x: Self) extends AnyVal {
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProfileName(value: String): Self = this.set("profileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileName: Self = this.set("profileName", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setWebpropertyName(value: String): Self = this.set("webpropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebpropertyName: Self = this.set("webpropertyName", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}

