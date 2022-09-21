package typings.mailchimpMailchimpMarketing.mod

import typings.mailchimpMailchimpMarketing.anon.Enabled
import typings.mailchimpMailchimpMarketing.anon.Latitude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var email_type: js.UndefOr[String] = js.undefined
  
  var interests: js.UndefOr[Record[String, Any]] = js.undefined
  
  var ip_opt: js.UndefOr[String] = js.undefined
  
  var ip_signup: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Latitude] = js.undefined
  
  var marketing_permissions: js.UndefOr[js.Array[Enabled]] = js.undefined
  
  var merge_fields: js.UndefOr[Record[String, Any]] = js.undefined
  
  var status: js.UndefOr[Status] = js.undefined
  
  var timestamp_opt: js.UndefOr[String] = js.undefined
  
  var timestamp_signup: js.UndefOr[String] = js.undefined
  
  var vip: js.UndefOr[Boolean] = js.undefined
}
object Body {
  
  inline def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setEmail_type(value: String): Self = StObject.set(x, "email_type", value.asInstanceOf[js.Any])
    
    inline def setEmail_typeUndefined: Self = StObject.set(x, "email_type", js.undefined)
    
    inline def setInterests(value: Record[String, Any]): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
    
    inline def setInterestsUndefined: Self = StObject.set(x, "interests", js.undefined)
    
    inline def setIp_opt(value: String): Self = StObject.set(x, "ip_opt", value.asInstanceOf[js.Any])
    
    inline def setIp_optUndefined: Self = StObject.set(x, "ip_opt", js.undefined)
    
    inline def setIp_signup(value: String): Self = StObject.set(x, "ip_signup", value.asInstanceOf[js.Any])
    
    inline def setIp_signupUndefined: Self = StObject.set(x, "ip_signup", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocation(value: Latitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMarketing_permissions(value: js.Array[Enabled]): Self = StObject.set(x, "marketing_permissions", value.asInstanceOf[js.Any])
    
    inline def setMarketing_permissionsUndefined: Self = StObject.set(x, "marketing_permissions", js.undefined)
    
    inline def setMarketing_permissionsVarargs(value: Enabled*): Self = StObject.set(x, "marketing_permissions", js.Array(value*))
    
    inline def setMerge_fields(value: Record[String, Any]): Self = StObject.set(x, "merge_fields", value.asInstanceOf[js.Any])
    
    inline def setMerge_fieldsUndefined: Self = StObject.set(x, "merge_fields", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimestamp_opt(value: String): Self = StObject.set(x, "timestamp_opt", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_optUndefined: Self = StObject.set(x, "timestamp_opt", js.undefined)
    
    inline def setTimestamp_signup(value: String): Self = StObject.set(x, "timestamp_signup", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_signupUndefined: Self = StObject.set(x, "timestamp_signup", js.undefined)
    
    inline def setVip(value: Boolean): Self = StObject.set(x, "vip", value.asInstanceOf[js.Any])
    
    inline def setVipUndefined: Self = StObject.set(x, "vip", js.undefined)
  }
}
