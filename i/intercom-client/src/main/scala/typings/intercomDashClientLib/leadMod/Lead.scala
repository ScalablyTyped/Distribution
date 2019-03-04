package typings
package intercomDashClientLib.leadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lead extends js.Object {
  var avatar: intercomDashClientLib.userMod.Avatar
  var companies: intercomDashClientLib.Anon_Companies
  val created_at: scala.Double
  var custom_attributes: org.scalablytyped.runtime.StringDictionary[js.Any]
  var email: java.lang.String | scala.Null
  val id: java.lang.String
  var last_request_at: scala.Double | scala.Null
  var last_seen_ip: java.lang.String | scala.Null
  var location_data: intercomDashClientLib.userMod.LocationData | js.Object
  var name: java.lang.String | scala.Null
  var phone: java.lang.String | scala.Null
  var referrer: java.lang.String | scala.Null
  var segments: intercomDashClientLib.Anon_Segmentlist
  var social_profiles: intercomDashClientLib.Anon_Socialprofilelist
  var tags: intercomDashClientLib.Anon_Taglist
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.contact
  var unsubscribed_from_emails: scala.Boolean
  val updated_at: scala.Double
  var user_agent_data: java.lang.String | scala.Null
  var user_id: java.lang.String | scala.Null
}

object Lead {
  @scala.inline
  def apply(
    avatar: intercomDashClientLib.userMod.Avatar,
    companies: intercomDashClientLib.Anon_Companies,
    created_at: scala.Double,
    custom_attributes: org.scalablytyped.runtime.StringDictionary[js.Any],
    id: java.lang.String,
    location_data: intercomDashClientLib.userMod.LocationData | js.Object,
    segments: intercomDashClientLib.Anon_Segmentlist,
    social_profiles: intercomDashClientLib.Anon_Socialprofilelist,
    tags: intercomDashClientLib.Anon_Taglist,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.contact,
    unsubscribed_from_emails: scala.Boolean,
    updated_at: scala.Double,
    email: java.lang.String = null,
    last_request_at: scala.Int | scala.Double = null,
    last_seen_ip: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    referrer: java.lang.String = null,
    user_agent_data: java.lang.String = null,
    user_id: java.lang.String = null
  ): Lead = {
    val __obj = js.Dynamic.literal(avatar = avatar, companies = companies, created_at = created_at, custom_attributes = custom_attributes, id = id, location_data = location_data.asInstanceOf[js.Any], segments = segments, social_profiles = social_profiles, tags = tags, unsubscribed_from_emails = unsubscribed_from_emails, updated_at = updated_at)
    __obj.updateDynamic("type")(`type`)
    if (email != null) __obj.updateDynamic("email")(email)
    if (last_request_at != null) __obj.updateDynamic("last_request_at")(last_request_at.asInstanceOf[js.Any])
    if (last_seen_ip != null) __obj.updateDynamic("last_seen_ip")(last_seen_ip)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (user_agent_data != null) __obj.updateDynamic("user_agent_data")(user_agent_data)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[Lead]
  }
}

