package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendersDomainResponse extends StObject {
  
  /** the date and time that the sending domain was first seen as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** details about the domain's DKIM record */
  var dkim: js.UndefOr[SendersDomainsDkim | Null] = js.undefined
  
  /** the sender domain name */
  var domain: String
  
  /** when the domain's DNS settings were last tested as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var last_tested_at: js.UndefOr[String | Null] = js.undefined
  
  /** details about the domain's SPF record */
  var spf: js.UndefOr[SendersDomainsSpf | Null] = js.undefined
  
  /**
    * whether this domain can be used to authenticate mail, either for itself or as a custom signing
    * domain. If this is false but spf and dkim are both valid, you will need to verify the domain
    * before using it to authenticate mail
    */
  var valid_signing: Boolean
  
  /**
    * if the domain has been verified, this indicates when that verification occurred as a UTC string
    * in YYYY-MM-DD HH:MM:SS format
    */
  var verified_at: js.UndefOr[String | Null] = js.undefined
  
  /**
    * a unique key used to verify a domain by adding a TXT record. Append this key to 'mandrill_verify.'
    * and add it to your domain's TXT records to verify
    */
  var verify_txt_key: String
}
object SendersDomainResponse {
  
  inline def apply(created_at: String, domain: String, valid_signing: Boolean, verify_txt_key: String): SendersDomainResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], valid_signing = valid_signing.asInstanceOf[js.Any], verify_txt_key = verify_txt_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendersDomainResponse]
  }
  
  extension [Self <: SendersDomainResponse](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDkim(value: SendersDomainsDkim): Self = StObject.set(x, "dkim", value.asInstanceOf[js.Any])
    
    inline def setDkimNull: Self = StObject.set(x, "dkim", null)
    
    inline def setDkimUndefined: Self = StObject.set(x, "dkim", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setLast_tested_at(value: String): Self = StObject.set(x, "last_tested_at", value.asInstanceOf[js.Any])
    
    inline def setLast_tested_atNull: Self = StObject.set(x, "last_tested_at", null)
    
    inline def setLast_tested_atUndefined: Self = StObject.set(x, "last_tested_at", js.undefined)
    
    inline def setSpf(value: SendersDomainsSpf): Self = StObject.set(x, "spf", value.asInstanceOf[js.Any])
    
    inline def setSpfNull: Self = StObject.set(x, "spf", null)
    
    inline def setSpfUndefined: Self = StObject.set(x, "spf", js.undefined)
    
    inline def setValid_signing(value: Boolean): Self = StObject.set(x, "valid_signing", value.asInstanceOf[js.Any])
    
    inline def setVerified_at(value: String): Self = StObject.set(x, "verified_at", value.asInstanceOf[js.Any])
    
    inline def setVerified_atNull: Self = StObject.set(x, "verified_at", null)
    
    inline def setVerified_atUndefined: Self = StObject.set(x, "verified_at", js.undefined)
    
    inline def setVerify_txt_key(value: String): Self = StObject.set(x, "verify_txt_key", value.asInstanceOf[js.Any])
  }
}
