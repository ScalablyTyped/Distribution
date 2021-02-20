package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.visitor
import typings.intercomClient.tagMod.Tag
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import typings.intercomClient.userMod.Segment
import typings.intercomClient.userMod.SocialProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Visitor.Visitor> */
@js.native
trait PartialVisitor extends StObject {
  
  var avatar: js.UndefOr[Avatar] = js.native
  
  var created_at: js.UndefOr[Double] = js.native
  
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var last_request_at: js.UndefOr[Double | Null] = js.native
  
  var location_data: js.UndefOr[LocationData | js.Object] = js.native
  
  var name: js.UndefOr[String | Null] = js.native
  
  var segments: js.UndefOr[js.Array[Segment]] = js.native
  
  var social_profiles: js.UndefOr[js.Array[SocialProfile]] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  
  var `type`: js.UndefOr[visitor] = js.native
  
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.native
  
  var updated_at: js.UndefOr[Double] = js.native
  
  var user_id: js.UndefOr[String | Null] = js.native
}
object PartialVisitor {
  
  @scala.inline
  def apply(): PartialVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVisitor]
  }
  
  @scala.inline
  implicit class PartialVisitorMutableBuilder[Self <: PartialVisitor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLast_request_at(value: Double): Self = StObject.set(x, "last_request_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_request_atNull: Self = StObject.set(x, "last_request_at", null)
    
    @scala.inline
    def setLast_request_atUndefined: Self = StObject.set(x, "last_request_at", js.undefined)
    
    @scala.inline
    def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation_dataUndefined: Self = StObject.set(x, "location_data", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setSocial_profiles(value: js.Array[SocialProfile]): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocial_profilesUndefined: Self = StObject.set(x, "social_profiles", js.undefined)
    
    @scala.inline
    def setSocial_profilesVarargs(value: SocialProfile*): Self = StObject.set(x, "social_profiles", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: visitor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribed_from_emailsUndefined: Self = StObject.set(x, "unsubscribed_from_emails", js.undefined)
    
    @scala.inline
    def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idNull: Self = StObject.set(x, "user_id", null)
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
