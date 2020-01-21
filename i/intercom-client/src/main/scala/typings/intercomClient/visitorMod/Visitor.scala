package typings.intercomClient.visitorMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.visitor
import typings.intercomClient.tagMod.Tag
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import typings.intercomClient.userMod.Segment
import typings.intercomClient.userMod.SocialProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
   // The name of the Visitor
  var avatar: Avatar
   // The time the Lead last recorded making a request
  val created_at: Double
   // A list of segments the Visitor
  var custom_attributes: StringDictionary[js.Any]
   // value is 'visitor'
  val id: String
   // A Location Object relating to the Visitor
  var last_request_at: Double | Null
   // An avatar object for the Visitor
  var location_data: LocationData | js.Object
   // Automatically generated identifier for the Visitor
  var name: String | Null
   // A list of tags associated with the Visitor
  var segments: js.Array[Segment]
   // The last time the Visitor was updated
  var social_profiles: js.Array[SocialProfile]
   // Whether the Visitor is unsubscribed from emails
  var tags: js.Array[Tag]
  var `type`: visitor
   // A list of social profiles associated with the Visitor
  var unsubscribed_from_emails: Boolean
   // The time the Visitor was added to Intercom
  val updated_at: Double
   // The Intercom defined id representing the Visitor
  var user_id: String | Null
}

object Visitor {
  @scala.inline
  def apply(
    avatar: Avatar,
    created_at: Double,
    custom_attributes: StringDictionary[js.Any],
    id: String,
    location_data: LocationData | js.Object,
    segments: js.Array[Segment],
    social_profiles: js.Array[SocialProfile],
    tags: js.Array[Tag],
    `type`: visitor,
    unsubscribed_from_emails: Boolean,
    updated_at: Double,
    last_request_at: Int | Double = null,
    name: String = null,
    user_id: String = null
  ): Visitor = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (last_request_at != null) __obj.updateDynamic("last_request_at")(last_request_at.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visitor]
  }
}

