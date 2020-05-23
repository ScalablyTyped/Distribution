package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Lead.Lead> */
trait PartialLead extends js.Object {
  var avatar: js.UndefOr[Avatar] = js.undefined
  var companies: js.UndefOr[Companies] = js.undefined
  var created_at: js.UndefOr[Double] = js.undefined
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var last_request_at: js.UndefOr[Double] = js.undefined
  var last_seen_ip: js.UndefOr[String] = js.undefined
  var location_data: js.UndefOr[LocationData | js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var segments: js.UndefOr[Segments] = js.undefined
  var social_profiles: js.UndefOr[Socialprofiles] = js.undefined
  var tags: js.UndefOr[Tags] = js.undefined
  var `type`: js.UndefOr[contact] = js.undefined
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
  var updated_at: js.UndefOr[Double] = js.undefined
  var user_agent_data: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object PartialLead {
  @scala.inline
  def apply(
    avatar: Avatar = null,
    companies: Companies = null,
    created_at: js.UndefOr[Double] = js.undefined,
    custom_attributes: StringDictionary[js.Any] = null,
    email: String = null,
    id: String = null,
    last_request_at: js.UndefOr[Double] = js.undefined,
    last_seen_ip: String = null,
    location_data: LocationData | js.Object = null,
    name: String = null,
    phone: String = null,
    referrer: String = null,
    segments: Segments = null,
    social_profiles: Socialprofiles = null,
    tags: Tags = null,
    `type`: contact = null,
    unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined,
    updated_at: js.UndefOr[Double] = js.undefined,
    user_agent_data: String = null,
    user_id: String = null
  ): PartialLead = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (companies != null) __obj.updateDynamic("companies")(companies.asInstanceOf[js.Any])
    if (!js.isUndefined(created_at)) __obj.updateDynamic("created_at")(created_at.get.asInstanceOf[js.Any])
    if (custom_attributes != null) __obj.updateDynamic("custom_attributes")(custom_attributes.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(last_request_at)) __obj.updateDynamic("last_request_at")(last_request_at.get.asInstanceOf[js.Any])
    if (last_seen_ip != null) __obj.updateDynamic("last_seen_ip")(last_seen_ip.asInstanceOf[js.Any])
    if (location_data != null) __obj.updateDynamic("location_data")(location_data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (social_profiles != null) __obj.updateDynamic("social_profiles")(social_profiles.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unsubscribed_from_emails)) __obj.updateDynamic("unsubscribed_from_emails")(unsubscribed_from_emails.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updated_at)) __obj.updateDynamic("updated_at")(updated_at.get.asInstanceOf[js.Any])
    if (user_agent_data != null) __obj.updateDynamic("user_agent_data")(user_agent_data.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLead]
  }
}

