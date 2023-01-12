package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlsTrackingDomainResponse extends StObject {
  
  /** details about the domain's CNAME record */
  var cname: UrlsTrackingDomainsCname
  
  /** the date and time that the tracking domain was added as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** the tracking domain name */
  var domain: String
  
  /** when the domain's DNS settings were last tested as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var last_tested_at: String
  
  /** whether this domain can be used as a tracking domain for email. */
  var valid_tracking: Boolean
}
object UrlsTrackingDomainResponse {
  
  inline def apply(
    cname: UrlsTrackingDomainsCname,
    created_at: String,
    domain: String,
    last_tested_at: String,
    valid_tracking: Boolean
  ): UrlsTrackingDomainResponse = {
    val __obj = js.Dynamic.literal(cname = cname.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], last_tested_at = last_tested_at.asInstanceOf[js.Any], valid_tracking = valid_tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsTrackingDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlsTrackingDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setCname(value: UrlsTrackingDomainsCname): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setLast_tested_at(value: String): Self = StObject.set(x, "last_tested_at", value.asInstanceOf[js.Any])
    
    inline def setValid_tracking(value: Boolean): Self = StObject.set(x, "valid_tracking", value.asInstanceOf[js.Any])
  }
}
