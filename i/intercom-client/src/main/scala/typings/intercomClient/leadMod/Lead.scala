package typings.intercomClient.leadMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.AnonCompanies
import typings.intercomClient.AnonSegments
import typings.intercomClient.AnonSocialprofiles
import typings.intercomClient.AnonTags
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lead extends js.Object {
  var avatar: Avatar
  var companies: AnonCompanies
  val created_at: Double
  var custom_attributes: StringDictionary[js.Any]
  var email: String | Null
  val id: String
  var last_request_at: Double | Null
  var last_seen_ip: String | Null
  var location_data: LocationData | js.Object
  var name: String | Null
  var phone: String | Null
  var referrer: String | Null
  var segments: AnonSegments
  var social_profiles: AnonSocialprofiles
  var tags: AnonTags
  var `type`: contact
  var unsubscribed_from_emails: Boolean
  val updated_at: Double
  var user_agent_data: String | Null
  var user_id: String | Null
}

object Lead {
  @scala.inline
  def apply(
    avatar: Avatar,
    companies: AnonCompanies,
    created_at: Double,
    custom_attributes: StringDictionary[js.Any],
    id: String,
    location_data: LocationData | js.Object,
    segments: AnonSegments,
    social_profiles: AnonSocialprofiles,
    tags: AnonTags,
    `type`: contact,
    unsubscribed_from_emails: Boolean,
    updated_at: Double,
    email: String = null,
    last_request_at: Int | Double = null,
    last_seen_ip: String = null,
    name: String = null,
    phone: String = null,
    referrer: String = null,
    user_agent_data: String = null,
    user_id: String = null
  ): Lead = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (last_request_at != null) __obj.updateDynamic("last_request_at")(last_request_at.asInstanceOf[js.Any])
    if (last_seen_ip != null) __obj.updateDynamic("last_seen_ip")(last_seen_ip.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (user_agent_data != null) __obj.updateDynamic("user_agent_data")(user_agent_data.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lead]
  }
}

