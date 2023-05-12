package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.mod.Link
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembersSuccessResponse extends StObject {
  
  var _links: js.Array[Link]
  
  var consents_to_one_to_one_messaging: Boolean
  
  var contact_id: String
  
  var email_address: String
  
  var email_client: String
  
  var email_type: String
  
  var full_name: String
  
  var id: String
  
  var interests: Record[String, Any]
  
  var ip_opt: String
  
  var ip_signup: String
  
  var language: String
  
  var last_changed: String
  
  var last_note: MemberLastNote
  
  var list_id: String
  
  var location: FullMemberLocation
  
  var marketing_permissions: js.Array[MemberMarketingPermissions]
  
  var member_rating: String
  
  var merge_fields: Record[String, Any]
  
  var source: String
  
  var stats: MemberStats
  
  var status: String
  
  var tags: js.Array[Tags]
  
  var tags_count: Double
  
  var timestamp_opt: String
  
  var timestamp_signup: String
  
  var unique_email_id: String
  
  var unsubscribe_reason: String
  
  var vip: Boolean
  
  var web_id: Double
}
object MembersSuccessResponse {
  
  inline def apply(
    _links: js.Array[Link],
    consents_to_one_to_one_messaging: Boolean,
    contact_id: String,
    email_address: String,
    email_client: String,
    email_type: String,
    full_name: String,
    id: String,
    interests: Record[String, Any],
    ip_opt: String,
    ip_signup: String,
    language: String,
    last_changed: String,
    last_note: MemberLastNote,
    list_id: String,
    location: FullMemberLocation,
    marketing_permissions: js.Array[MemberMarketingPermissions],
    member_rating: String,
    merge_fields: Record[String, Any],
    source: String,
    stats: MemberStats,
    status: String,
    tags: js.Array[Tags],
    tags_count: Double,
    timestamp_opt: String,
    timestamp_signup: String,
    unique_email_id: String,
    unsubscribe_reason: String,
    vip: Boolean,
    web_id: Double
  ): MembersSuccessResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], consents_to_one_to_one_messaging = consents_to_one_to_one_messaging.asInstanceOf[js.Any], contact_id = contact_id.asInstanceOf[js.Any], email_address = email_address.asInstanceOf[js.Any], email_client = email_client.asInstanceOf[js.Any], email_type = email_type.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interests = interests.asInstanceOf[js.Any], ip_opt = ip_opt.asInstanceOf[js.Any], ip_signup = ip_signup.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], last_changed = last_changed.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any], list_id = list_id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], marketing_permissions = marketing_permissions.asInstanceOf[js.Any], member_rating = member_rating.asInstanceOf[js.Any], merge_fields = merge_fields.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tags_count = tags_count.asInstanceOf[js.Any], timestamp_opt = timestamp_opt.asInstanceOf[js.Any], timestamp_signup = timestamp_signup.asInstanceOf[js.Any], unique_email_id = unique_email_id.asInstanceOf[js.Any], unsubscribe_reason = unsubscribe_reason.asInstanceOf[js.Any], vip = vip.asInstanceOf[js.Any], web_id = web_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersSuccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MembersSuccessResponse] (val x: Self) extends AnyVal {
    
    inline def setConsents_to_one_to_one_messaging(value: Boolean): Self = StObject.set(x, "consents_to_one_to_one_messaging", value.asInstanceOf[js.Any])
    
    inline def setContact_id(value: String): Self = StObject.set(x, "contact_id", value.asInstanceOf[js.Any])
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_client(value: String): Self = StObject.set(x, "email_client", value.asInstanceOf[js.Any])
    
    inline def setEmail_type(value: String): Self = StObject.set(x, "email_type", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInterests(value: Record[String, Any]): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
    
    inline def setIp_opt(value: String): Self = StObject.set(x, "ip_opt", value.asInstanceOf[js.Any])
    
    inline def setIp_signup(value: String): Self = StObject.set(x, "ip_signup", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLast_changed(value: String): Self = StObject.set(x, "last_changed", value.asInstanceOf[js.Any])
    
    inline def setLast_note(value: MemberLastNote): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
    
    inline def setList_id(value: String): Self = StObject.set(x, "list_id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: FullMemberLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMarketing_permissions(value: js.Array[MemberMarketingPermissions]): Self = StObject.set(x, "marketing_permissions", value.asInstanceOf[js.Any])
    
    inline def setMarketing_permissionsVarargs(value: MemberMarketingPermissions*): Self = StObject.set(x, "marketing_permissions", js.Array(value*))
    
    inline def setMember_rating(value: String): Self = StObject.set(x, "member_rating", value.asInstanceOf[js.Any])
    
    inline def setMerge_fields(value: Record[String, Any]): Self = StObject.set(x, "merge_fields", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStats(value: MemberStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tags]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tags*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTags_count(value: Double): Self = StObject.set(x, "tags_count", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_opt(value: String): Self = StObject.set(x, "timestamp_opt", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_signup(value: String): Self = StObject.set(x, "timestamp_signup", value.asInstanceOf[js.Any])
    
    inline def setUnique_email_id(value: String): Self = StObject.set(x, "unique_email_id", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe_reason(value: String): Self = StObject.set(x, "unsubscribe_reason", value.asInstanceOf[js.Any])
    
    inline def setVip(value: Boolean): Self = StObject.set(x, "vip", value.asInstanceOf[js.Any])
    
    inline def setWeb_id(value: Double): Self = StObject.set(x, "web_id", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Array[Link]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    
    inline def set_linksVarargs(value: Link*): Self = StObject.set(x, "_links", js.Array(value*))
  }
}
