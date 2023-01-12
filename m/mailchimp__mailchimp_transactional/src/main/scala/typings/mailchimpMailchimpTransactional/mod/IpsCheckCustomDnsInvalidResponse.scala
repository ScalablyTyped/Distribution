package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsCheckCustomDnsInvalidResponse
  extends StObject
     with IpsCheckCustomDnsResponse {
  
  /** if valid is false, this will contain details about why the domain's A record is incorrect */
  var error: String
  
  /** whether the domain name has a correctly-configured A record pointing to the ip address */
  var valid: `false`
}
object IpsCheckCustomDnsInvalidResponse {
  
  inline def apply(error: String): IpsCheckCustomDnsInvalidResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], valid = false)
    __obj.asInstanceOf[IpsCheckCustomDnsInvalidResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpsCheckCustomDnsInvalidResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setValid(value: `false`): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
