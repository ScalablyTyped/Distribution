package typings.intercomClient.leadMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.anon.Companies
import typings.intercomClient.anon.Segments
import typings.intercomClient.anon.Socialprofiles
import typings.intercomClient.anon.Tags
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lead extends js.Object {
  var avatar: Avatar = js.native
  var companies: Companies = js.native
  val created_at: Double = js.native
  var custom_attributes: StringDictionary[js.Any] = js.native
  var email: String | Null = js.native
  val id: String = js.native
  var last_request_at: Double | Null = js.native
  var last_seen_ip: String | Null = js.native
  var location_data: LocationData | js.Object = js.native
  var name: String | Null = js.native
  var phone: String | Null = js.native
  var referrer: String | Null = js.native
  var segments: Segments = js.native
  var social_profiles: Socialprofiles = js.native
  var tags: Tags = js.native
  var `type`: contact = js.native
  var unsubscribed_from_emails: Boolean = js.native
  val updated_at: Double = js.native
  var user_agent_data: String | Null = js.native
  var user_id: String | Null = js.native
}

object Lead {
  @scala.inline
  def apply(
    avatar: Avatar,
    companies: Companies,
    created_at: Double,
    custom_attributes: StringDictionary[js.Any],
    id: String,
    location_data: LocationData | js.Object,
    segments: Segments,
    social_profiles: Socialprofiles,
    tags: Tags,
    `type`: contact,
    unsubscribed_from_emails: Boolean,
    updated_at: Double
  ): Lead = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lead]
  }
  @scala.inline
  implicit class LeadOps[Self <: Lead] (val x: Self) extends AnyVal {
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
    def setCompanies(value: Companies): Self = this.set("companies", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = this.set("custom_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation_data(value: LocationData | js.Object): Self = this.set("location_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegments(value: Segments): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocial_profiles(value: Socialprofiles): Self = this.set("social_profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: contact): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsubscribed_from_emails(value: Boolean): Self = this.set("unsubscribed_from_emails", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: Double): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setLast_request_at(value: Double): Self = this.set("last_request_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_request_atNull: Self = this.set("last_request_at", null)
    @scala.inline
    def setLast_seen_ip(value: String): Self = this.set("last_seen_ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_seen_ipNull: Self = this.set("last_seen_ip", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrerNull: Self = this.set("referrer", null)
    @scala.inline
    def setUser_agent_data(value: String): Self = this.set("user_agent_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_agent_dataNull: Self = this.set("user_agent_data", null)
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_idNull: Self = this.set("user_id", null)
  }
  
}

