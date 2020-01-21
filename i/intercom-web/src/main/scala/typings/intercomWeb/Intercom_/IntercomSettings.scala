package typings.intercomWeb.Intercom_

import typings.intercomWeb.AnonCreatedat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomSettings extends js.Object {
  var action_color: js.UndefOr[String] = js.undefined
  var alignment: js.UndefOr[String] = js.undefined
  // Messenger attributes
  var app_id: js.UndefOr[String] = js.undefined
  var background_color: js.UndefOr[String] = js.undefined
  var company: js.UndefOr[AnonCreatedat] = js.undefined
  var created_at: js.UndefOr[Double] = js.undefined
  var custom_launcher_selector: js.UndefOr[String] = js.undefined
  // Data attributes
  var email: js.UndefOr[String] = js.undefined
  var hide_default_launcher: js.UndefOr[Boolean] = js.undefined
  var horizontal_padding: js.UndefOr[Double] = js.undefined
  var language_override: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var session_duration: js.UndefOr[Double] = js.undefined
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
  var user_hash: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
  var utm_campaign: js.UndefOr[String] = js.undefined
  var utm_content: js.UndefOr[String] = js.undefined
  var utm_medium: js.UndefOr[String] = js.undefined
  var utm_source: js.UndefOr[String] = js.undefined
  var utm_term: js.UndefOr[String] = js.undefined
  var vertical_padding: js.UndefOr[Double] = js.undefined
}

object IntercomSettings {
  @scala.inline
  def apply(
    action_color: String = null,
    alignment: String = null,
    app_id: String = null,
    background_color: String = null,
    company: AnonCreatedat = null,
    created_at: Int | Double = null,
    custom_launcher_selector: String = null,
    email: String = null,
    hide_default_launcher: js.UndefOr[Boolean] = js.undefined,
    horizontal_padding: Int | Double = null,
    language_override: String = null,
    name: String = null,
    phone: String = null,
    session_duration: Int | Double = null,
    unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined,
    user_hash: String = null,
    user_id: String = null,
    utm_campaign: String = null,
    utm_content: String = null,
    utm_medium: String = null,
    utm_source: String = null,
    utm_term: String = null,
    vertical_padding: Int | Double = null
  ): IntercomSettings = {
    val __obj = js.Dynamic.literal()
    if (action_color != null) __obj.updateDynamic("action_color")(action_color.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (background_color != null) __obj.updateDynamic("background_color")(background_color.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (custom_launcher_selector != null) __obj.updateDynamic("custom_launcher_selector")(custom_launcher_selector.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(hide_default_launcher)) __obj.updateDynamic("hide_default_launcher")(hide_default_launcher.asInstanceOf[js.Any])
    if (horizontal_padding != null) __obj.updateDynamic("horizontal_padding")(horizontal_padding.asInstanceOf[js.Any])
    if (language_override != null) __obj.updateDynamic("language_override")(language_override.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (session_duration != null) __obj.updateDynamic("session_duration")(session_duration.asInstanceOf[js.Any])
    if (!js.isUndefined(unsubscribed_from_emails)) __obj.updateDynamic("unsubscribed_from_emails")(unsubscribed_from_emails.asInstanceOf[js.Any])
    if (user_hash != null) __obj.updateDynamic("user_hash")(user_hash.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (utm_campaign != null) __obj.updateDynamic("utm_campaign")(utm_campaign.asInstanceOf[js.Any])
    if (utm_content != null) __obj.updateDynamic("utm_content")(utm_content.asInstanceOf[js.Any])
    if (utm_medium != null) __obj.updateDynamic("utm_medium")(utm_medium.asInstanceOf[js.Any])
    if (utm_source != null) __obj.updateDynamic("utm_source")(utm_source.asInstanceOf[js.Any])
    if (utm_term != null) __obj.updateDynamic("utm_term")(utm_term.asInstanceOf[js.Any])
    if (vertical_padding != null) __obj.updateDynamic("vertical_padding")(vertical_padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntercomSettings]
  }
}

