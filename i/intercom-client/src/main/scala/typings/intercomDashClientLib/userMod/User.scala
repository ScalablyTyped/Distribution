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

