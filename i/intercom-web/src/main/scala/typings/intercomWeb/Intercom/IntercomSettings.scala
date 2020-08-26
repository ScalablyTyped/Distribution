package typings.intercomWeb.Intercom

import typings.intercomWeb.anon.Createdat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomSettings extends js.Object {
  var action_color: js.UndefOr[String] = js.native
  var alignment: js.UndefOr[String] = js.native
  // Messenger attributes
  var app_id: js.UndefOr[String] = js.native
  var background_color: js.UndefOr[String] = js.native
  var company: js.UndefOr[Createdat] = js.native
  var created_at: js.UndefOr[Double] = js.native
  var custom_launcher_selector: js.UndefOr[String] = js.native
  // Data attributes
  var email: js.UndefOr[String] = js.native
  var hide_default_launcher: js.UndefOr[Boolean] = js.native
  var horizontal_padding: js.UndefOr[Double] = js.native
  var language_override: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var phone: js.UndefOr[String] = js.native
  var session_duration: js.UndefOr[Double] = js.native
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.native
  var user_hash: js.UndefOr[String] = js.native
  var user_id: js.UndefOr[String] = js.native
  var utm_campaign: js.UndefOr[String] = js.native
  var utm_content: js.UndefOr[String] = js.native
  var utm_medium: js.UndefOr[String] = js.native
  var utm_source: js.UndefOr[String] = js.native
  var utm_term: js.UndefOr[String] = js.native
  var vertical_padding: js.UndefOr[Double] = js.native
}

object IntercomSettings {
  @scala.inline
  def apply(): IntercomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntercomSettings]
  }
  @scala.inline
  implicit class IntercomSettingsOps[Self <: IntercomSettings] (val x: Self) extends AnyVal {
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
    def setAction_color(value: String): Self = this.set("action_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction_color: Self = this.set("action_color", js.undefined)
    @scala.inline
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setApp_id(value: String): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_id: Self = this.set("app_id", js.undefined)
    @scala.inline
    def setBackground_color(value: String): Self = this.set("background_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground_color: Self = this.set("background_color", js.undefined)
    @scala.inline
    def setCompany(value: Createdat): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCustom_launcher_selector(value: String): Self = this.set("custom_launcher_selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_launcher_selector: Self = this.set("custom_launcher_selector", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setHide_default_launcher(value: Boolean): Self = this.set("hide_default_launcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide_default_launcher: Self = this.set("hide_default_launcher", js.undefined)
    @scala.inline
    def setHorizontal_padding(value: Double): Self = this.set("horizontal_padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal_padding: Self = this.set("horizontal_padding", js.undefined)
    @scala.inline
    def setLanguage_override(value: String): Self = this.set("language_override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage_override: Self = this.set("language_override", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setSession_duration(value: Double): Self = this.set("session_duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_duration: Self = this.set("session_duration", js.undefined)
    @scala.inline
    def setUnsubscribed_from_emails(value: Boolean): Self = this.set("unsubscribed_from_emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsubscribed_from_emails: Self = this.set("unsubscribed_from_emails", js.undefined)
    @scala.inline
    def setUser_hash(value: String): Self = this.set("user_hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_hash: Self = this.set("user_hash", js.undefined)
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
    @scala.inline
    def setUtm_campaign(value: String): Self = this.set("utm_campaign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtm_campaign: Self = this.set("utm_campaign", js.undefined)
    @scala.inline
    def setUtm_content(value: String): Self = this.set("utm_content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtm_content: Self = this.set("utm_content", js.undefined)
    @scala.inline
    def setUtm_medium(value: String): Self = this.set("utm_medium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtm_medium: Self = this.set("utm_medium", js.undefined)
    @scala.inline
    def setUtm_source(value: String): Self = this.set("utm_source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtm_source: Self = this.set("utm_source", js.undefined)
    @scala.inline
    def setUtm_term(value: String): Self = this.set("utm_term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtm_term: Self = this.set("utm_term", js.undefined)
    @scala.inline
    def setVertical_padding(value: Double): Self = this.set("vertical_padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical_padding: Self = this.set("vertical_padding", js.undefined)
  }
  
}

