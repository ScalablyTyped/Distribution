package typings.intercomDashClient.userMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomDashClient.Anon_Companies
import typings.intercomDashClient.Anon_Segmentlist
import typings.intercomDashClient.Anon_Socialprofilelist
import typings.intercomDashClient.Anon_Taglist
import typings.intercomDashClient.intercomDashClientStrings.contact
import typings.intercomDashClient.intercomDashClientStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends BaseUser {
  var companies: Anon_Companies
  var location_data: LocationData | js.Object
  var segments: Anon_Segmentlist
  var social_profiles: Anon_Socialprofilelist
  var tags: Anon_Taglist
}

object User {
  @scala.inline
  def apply(
    anonymous: Boolean,
    avatar: Avatar,
    companies: Anon_Companies,
    created_at: Double,
    custom_attributes: StringDictionary[js.Any],
    id: String,
    location_data: LocationData | js.Object,
    segments: Anon_Segmentlist,
    session_count: Double,
    social_profiles: Anon_Socialprofilelist,
    tags: Anon_Taglist,
    `type`: user | contact,
    unsubscribed_from_emails: Boolean,
    updated_at: Double,
    app_id: String = null,
    email: String = null,
    last_request_at: Int | Double = null,
    last_seen_ip: String = null,
    name: String = null,
    phone: String = null,
    pseudonym: String = null,
    signed_up_at: Int | Double = null,
    user_agent_data: String = null,
    user_id: String = null
  ): User = {
    val __obj = js.Dynamic.literal(anonymous = anonymous, avatar = avatar, companies = companies, created_at = created_at, custom_attributes = custom_attributes, id = id, location_data = location_data.asInstanceOf[js.Any], segments = segments, session_count = session_count, social_profiles = social_profiles, tags = tags, unsubscribed_from_emails = unsubscribed_from_emails, updated_at = updated_at)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (email != null) __obj.updateDynamic("email")(email)
    if (last_request_at != null) __obj.updateDynamic("last_request_at")(last_request_at.asInstanceOf[js.Any])
    if (last_seen_ip != null) __obj.updateDynamic("last_seen_ip")(last_seen_ip)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (pseudonym != null) __obj.updateDynamic("pseudonym")(pseudonym)
    if (signed_up_at != null) __obj.updateDynamic("signed_up_at")(signed_up_at.asInstanceOf[js.Any])
    if (user_agent_data != null) __obj.updateDynamic("user_agent_data")(user_agent_data)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[User]
  }
}

