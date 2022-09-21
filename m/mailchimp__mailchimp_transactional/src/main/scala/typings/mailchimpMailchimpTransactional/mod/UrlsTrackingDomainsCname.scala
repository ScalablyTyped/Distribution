package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlsTrackingDomainsCname extends StObject {
  
  /** an error describing the CNAME record, or null if the record is correct */
  var error: js.UndefOr[String | Null] = js.undefined
  
  /** whether the domain's CNAME record is valid for use with Mandrill */
  var valid: Boolean
  
  /**
    * when the domain's CNAME record will be considered valid for use with Mandrill as a UTC
    * string in YYYY-MM-DD HH:MM:SS format. If set, this indicates that the record is valid now,
    * but was previously invalid, and Mandrill will wait until the record's TTL elapses to start
    * using it.
    */
  var valid_after: String
}
object UrlsTrackingDomainsCname {
  
  inline def apply(valid: Boolean, valid_after: String): UrlsTrackingDomainsCname = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], valid_after = valid_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsTrackingDomainsCname]
  }
  
  extension [Self <: UrlsTrackingDomainsCname](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValid_after(value: String): Self = StObject.set(x, "valid_after", value.asInstanceOf[js.Any])
  }
}
