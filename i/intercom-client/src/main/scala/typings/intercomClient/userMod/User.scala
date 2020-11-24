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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends BaseUser {
  
  var companies: Companies = js.native
  
  var location_data: LocationData | js.Object = js.native
  
  var segments: Segments = js.native
  
  var social_profiles: Socialprofiles = js.native
  
  var tags: Tags = js.native
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
    updated_at: Double
  ): User = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setCompanies(value: Companies): Self = this.set("companies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation_data(value: LocationData | js.Object): Self = this.set("location_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: Segments): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocial_profiles(value: Socialprofiles): Self = this.set("social_profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
