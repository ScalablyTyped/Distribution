package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StringDictionary
import typings.mailchimpMailchimpMarketing.anon.Longtitude
import typings.mailchimpMailchimpMarketing.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListMembersBodyMembersObject extends StObject {
  
  var email_address: String
  
  var email_type: EmailType
  
  var ip_opt: js.UndefOr[String] = js.undefined
  
  // non-documented tho still available to use
  var ip_signup: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Longtitude] = js.undefined
  
  // https://mailchimp.com/help/view-and-edit-contact-languages/
  var merge_fields: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var status: Status
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var timestamp_opt: js.UndefOr[String] = js.undefined
  
  var timestamp_signup: js.UndefOr[String] = js.undefined
  
  var vip: js.UndefOr[Boolean] = js.undefined
}
object BatchListMembersBodyMembersObject {
  
  inline def apply(email_address: String, email_type: EmailType, status: Status): BatchListMembersBodyMembersObject = {
    val __obj = js.Dynamic.literal(email_address = email_address.asInstanceOf[js.Any], email_type = email_type.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListMembersBodyMembersObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchListMembersBodyMembersObject] (val x: Self) extends AnyVal {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_type(value: EmailType): Self = StObject.set(x, "email_type", value.asInstanceOf[js.Any])
    
    inline def setIp_opt(value: String): Self = StObject.set(x, "ip_opt", value.asInstanceOf[js.Any])
    
    inline def setIp_optUndefined: Self = StObject.set(x, "ip_opt", js.undefined)
    
    inline def setIp_signup(value: String): Self = StObject.set(x, "ip_signup", value.asInstanceOf[js.Any])
    
    inline def setIp_signupUndefined: Self = StObject.set(x, "ip_signup", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocation(value: Longtitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMerge_fields(value: StringDictionary[String]): Self = StObject.set(x, "merge_fields", value.asInstanceOf[js.Any])
    
    inline def setMerge_fieldsUndefined: Self = StObject.set(x, "merge_fields", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimestamp_opt(value: String): Self = StObject.set(x, "timestamp_opt", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_optUndefined: Self = StObject.set(x, "timestamp_opt", js.undefined)
    
    inline def setTimestamp_signup(value: String): Self = StObject.set(x, "timestamp_signup", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_signupUndefined: Self = StObject.set(x, "timestamp_signup", js.undefined)
    
    inline def setVip(value: Boolean): Self = StObject.set(x, "vip", value.asInstanceOf[js.Any])
    
    inline def setVipUndefined: Self = StObject.set(x, "vip", js.undefined)
  }
}
