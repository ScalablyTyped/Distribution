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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Visitor.Visitor> */
trait PartialVisitor extends StObject {
  
  var avatar: js.UndefOr[Avatar] = js.undefined
  
  var created_at: js.UndefOr[Double] = js.undefined
  
  var custom_attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var last_request_at: js.UndefOr[Double | Null] = js.undefined
  
  var location_data: js.UndefOr[LocationData | js.Object] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
  
  var social_profiles: js.UndefOr[js.Array[SocialProfile]] = js.undefined
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  var `type`: js.UndefOr[visitor] = js.undefined
  
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
  
  var updated_at: js.UndefOr[Double] = js.undefined
  
  var user_id: js.UndefOr[String | Null] = js.undefined
}
object PartialVisitor {
  
  inline def apply(): PartialVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVisitor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialVisitor] (val x: Self) extends AnyVal {
    
    inline def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCustom_attributes(value: StringDictionary[Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
    
    inline def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast_request_at(value: Double): Self = StObject.set(x, "last_request_at", value.asInstanceOf[js.Any])
    
    inline def setLast_request_atNull: Self = StObject.set(x, "last_request_at", null)
    
    inline def setLast_request_atUndefined: Self = StObject.set(x, "last_request_at", js.undefined)
    
    inline def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
    
    inline def setLocation_dataUndefined: Self = StObject.set(x, "location_data", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setSocial_profiles(value: js.Array[SocialProfile]): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
    
    inline def setSocial_profilesUndefined: Self = StObject.set(x, "social_profiles", js.undefined)
    
    inline def setSocial_profilesVarargs(value: SocialProfile*): Self = StObject.set(x, "social_profiles", js.Array(value*))
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: visitor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribed_from_emailsUndefined: Self = StObject.set(x, "unsubscribed_from_emails", js.undefined)
    
    inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idNull: Self = StObject.set(x, "user_id", null)
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
