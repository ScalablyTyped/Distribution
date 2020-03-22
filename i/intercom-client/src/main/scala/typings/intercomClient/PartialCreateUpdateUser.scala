package typings.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.user
import typings.intercomClient.userMod.Avatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/User.CreateUpdateUser> */
trait PartialCreateUpdateUser extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var app_id: js.UndefOr[String] = js.undefined
  var avatar: js.UndefOr[Avatar] = js.undefined
  var companies: js.UndefOr[js.Array[PartialCompanyremoveboole]] = js.undefined
  var created_at: js.UndefOr[Double] = js.undefined
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var last_request_at: js.UndefOr[Double] = js.undefined
  var last_seen_ip: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var pseudonym: js.UndefOr[String] = js.undefined
  var session_count: js.UndefOr[Double] = js.undefined
  var signed_up_at: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[user | contact] = js.undefined
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
  var updated_at: js.UndefOr[Double] = js.undefined
  var user_agent_data: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object PartialCreateUpdateUser {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    app_id: String = null,
    avatar: Avatar = null,
    companies: js.Array[PartialCompanyremoveboole] = null,
    created_at: Int | Double = null,
    custom_attributes: StringDictionary[js.Any] = null,
    email: String = null,
    id: String = null,
    last_request_at: Int | Double = null,
    last_seen_ip: String = null,
    name: String = null,
    phone: String = null,
    pseudonym: String = null,
    session_count: Int | Double = null,
    signed_up_at: Int | Double = null,
    `type`: user | contact = null,
    unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined,
    updated_at: Int | Double = null,
    user_agent_data: String = null,
    user_id: String = null
  ): PartialCreateUpdateUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (companies != null) __obj.updateDynamic("companies")(companies.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (custom_attributes != null) __obj.updateDynamic("custom_attributes")(custom_attributes.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (last_request_at != null) __obj.updateDynamic("last_request_at")(last_request_at.asInstanceOf[js.Any])
    if (last_seen_ip != null) __obj.updateDynamic("last_seen_ip")(last_seen_ip.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (pseudonym != null) __obj.updateDynamic("pseudonym")(pseudonym.asInstanceOf[js.Any])
    if (session_count != null) __obj.updateDynamic("session_count")(session_count.asInstanceOf[js.Any])
    if (signed_up_at != null) __obj.updateDynamic("signed_up_at")(signed_up_at.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unsubscribed_from_emails)) __obj.updateDynamic("unsubscribed_from_emails")(unsubscribed_from_emails.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (user_agent_data != null) __obj.updateDynamic("user_agent_data")(user_agent_data.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCreateUpdateUser]
  }
}

