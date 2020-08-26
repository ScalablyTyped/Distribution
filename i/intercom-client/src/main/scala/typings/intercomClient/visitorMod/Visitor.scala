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

@js.native
trait Visitor extends js.Object {
   // The name of the Visitor
  var avatar: Avatar = js.native
   // The time the Lead last recorded making a request
  val created_at: Double = js.native
   // A list of segments the Visitor
  var custom_attributes: StringDictionary[js.Any] = js.native
   // value is 'visitor'
  val id: String = js.native
   // A Location Object relating to the Visitor
  var last_request_at: Double | Null = js.native
   // An avatar object for the Visitor
  var location_data: LocationData | js.Object = js.native
   // Automatically generated identifier for the Visitor
  var name: String | Null = js.native
   // A list of tags associated with the Visitor
  var segments: js.Array[Segment] = js.native
   // The last time the Visitor was updated
  var social_profiles: js.Array[SocialProfile] = js.native
   // Whether the Visitor is unsubscribed from emails
  var tags: js.Array[Tag] = js.native
  var `type`: visitor = js.native
   // A list of social profiles associated with the Visitor
  var unsubscribed_from_emails: Boolean = js.native
   // The time the Visitor was added to Intercom
  val updated_at: Double = js.native
   // The Intercom defined id representing the Visitor
  var user_id: String | Null = js.native
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
    updated_at: Double
  ): Visitor = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visitor]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvatar(value: Avatar): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = this.set("custom_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation_data(value: LocationData | js.Object): Self = this.set("location_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocial_profilesVarargs(value: SocialProfile*): Self = this.set("social_profiles", js.Array(value :_*))
    @scala.inline
    def setSocial_profiles(value: js.Array[SocialProfile]): Self = this.set("social_profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: visitor): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsubscribed_from_emails(value: Boolean): Self = this.set("unsubscribed_from_emails", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: Double): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_request_at(value: Double): Self = this.set("last_request_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_request_atNull: Self = this.set("last_request_at", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_idNull: Self = this.set("user_id", null)
  }
  
}

