package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendersDomainsDkim extends StObject {
  
  /** an error describing the DKIM record, or null if the record is correct */
  var error: js.UndefOr[String | Null] = js.undefined
  
  /** whether the domain's DKIM record is valid for use with Mandrill */
  var valid: Boolean
  
  /**
    * when the domain's DKIM record will be considered valid for use with Mandrill as a UTC string in
    * YYYY-MM-DD HH:MM:SS format. If set, this indicates that the record is valid now, but was previously
    * invalid, and Mandrill will wait until the record's TTL elapses to start using
    */
  var valid_after: Boolean
}
object SendersDomainsDkim {
  
  inline def apply(valid: Boolean, valid_after: Boolean): SendersDomainsDkim = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], valid_after = valid_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendersDomainsDkim]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendersDomainsDkim] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValid_after(value: Boolean): Self = StObject.set(x, "valid_after", value.asInstanceOf[js.Any])
  }
}
