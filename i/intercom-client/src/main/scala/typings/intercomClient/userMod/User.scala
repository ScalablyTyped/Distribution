package typings.intercomClient.userMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.anon.Companies
import typings.intercomClient.anon.Segments
import typings.intercomClient.anon.Socialprofiles
import typings.intercomClient.anon.Tags
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends BaseUser {
  var companies: Companies
  var location_data: LocationData | js.Object
  var segments: Segments
  var social_profiles: Socialprofiles
  var tags: Tags
}

object User {
  @scala.inline
  def apply(
    anonymous: Boolean,
    avatar: Avatar,
    companies: Companies,
    created_at: Double,
    custom_attributes: StringDictionary[js.Any],
    id: String,
    location_data: LocationData | js.Object,
    segments: Segments,
    session_count: Double,
    social_profiles: Socialprofiles,
    tags: Tags,
    `type`: user | contact,
    unsubscribed_from_emails: Boolean,
    updated_at: Double,
    app_id: String = null,
    email: String = null,
    last_request_at: Double = null.asInstanceOf[Double],
    last_seen_ip: String = null,
    name: String = null,
    phone: String = null,
    pseudonym: String = null,
    signed_up_at: Double = null.asInstanceOf[Double],
    user_agent_data: String = null,
    user_id: String = null
  ): User = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], last_request_at = last_request_at.asInstanceOf[js.Any], last_seen_ip = last_seen_ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], pseudonym = pseudonym.asInstanceOf[js.Any], signed_up_at = signed_up_at.asInstanceOf[js.Any], user_agent_data = user_agent_data.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

