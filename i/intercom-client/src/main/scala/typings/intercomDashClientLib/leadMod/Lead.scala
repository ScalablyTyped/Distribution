package typings
package intercomDashClientLib.leadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Lead extends js.Object {
  var avatar: intercomDashClientLib.userMod.Avatar
  var companies: intercomDashClientLib.Anon_Type
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
  var segments: intercomDashClientLib.Anon_TypeSegmentlist
  var social_profiles: intercomDashClientLib.Anon_TypeSocialprofilelist
  var tags: intercomDashClientLib.Anon_TypeTaglist
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.contact
  var unsubscribed_from_emails: scala.Boolean
  val updated_at: scala.Double
  var user_agent_data: java.lang.String | scala.Null
  var user_id: java.lang.String | scala.Null
}

