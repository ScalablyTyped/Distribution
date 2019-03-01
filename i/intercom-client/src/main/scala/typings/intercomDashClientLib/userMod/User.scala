package typings
package intercomDashClientLib.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var anonymous: scala.Boolean
  var app_id: js.UndefOr[java.lang.String] = js.undefined
  var avatar: Avatar
  var companies: intercomDashClientLib.Anon_Companies
  val created_at: scala.Double
  var custom_attributes: org.scalablytyped.runtime.StringDictionary[js.Any]
  var email: java.lang.String | scala.Null
  val id: java.lang.String
  var last_request_at: scala.Double | scala.Null
  var last_seen_ip: java.lang.String | scala.Null
  var location_data: LocationData | js.Object
  var name: java.lang.String | scala.Null
  var phone: java.lang.String | scala.Null
  var pseudonym: java.lang.String | scala.Null
  var segments: intercomDashClientLib.Anon_Segmentlist
  var session_count: scala.Double
  var signed_up_at: scala.Double | scala.Null
  var social_profiles: intercomDashClientLib.Anon_Socialprofilelist
  var tags: intercomDashClientLib.Anon_Taglist
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.user | intercomDashClientLib.intercomDashClientLibStrings.contact
  var unsubscribed_from_emails: scala.Boolean
  val updated_at: scala.Double
  var user_agent_data: java.lang.String | scala.Null
  var user_id: java.lang.String | scala.Null
}

object User {
  @scala.inline
  def apply(
    anonymous: scala.Boolean,
    avatar: Avatar,
    companies: intercomDashClientLib.Anon_Companies,
    created_at: scala.Double,
    custom_attributes: org.scalablytyped.runtime.StringDictionary[js.Any],
    id: java.lang.String,
    location_data: LocationData | js.Object,
    segments: intercomDashClientLib.Anon_Segmentlist,
    session_count: scala.Double,
    social_profiles: intercomDashClientLib.Anon_Socialprofilelist,
    tags: intercomDashClientLib.Anon_Taglist,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.user | intercomDashClientLib.intercomDashClientLibStrings.contact,
    unsubscribed_from_emails: scala.Boolean,
    updated_at: scala.Double,
    app_id: java.lang.String = null,
    email: java.lang.String = null,
    last_request_at: scala.Int | scala.Double = null,
    last_seen_ip: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    pseudonym: java.lang.String = null,
    signed_up_at: scala.Int | scala.Double = null,
    user_agent_data: java.lang.String = null,
    user_id: java.lang.String = null
  ): User = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("anonymous")(anonymous)
    __obj.updateDynamic("avatar")(avatar)
    __obj.updateDynamic("companies")(companies)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("custom_attributes")(custom_attributes)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location_data")(location_data.asInstanceOf[js.Any])
    __obj.updateDynamic("segments")(segments)
    __obj.updateDynamic("session_count")(session_count)
    __obj.updateDynamic("social_profiles")(social_profiles)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("unsubscribed_from_emails")(unsubscribed_from_emails)
    __obj.updateDynamic("updated_at")(updated_at)
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

