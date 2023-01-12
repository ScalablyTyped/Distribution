package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsCheckCustomDnsValidResponse
  extends StObject
     with IpsCheckCustomDnsResponse {
  
  /** whether the domain name has a correctly-configured A record pointing to the ip address */
  var valid: `true`
}
object IpsCheckCustomDnsValidResponse {
  
  inline def apply(): IpsCheckCustomDnsValidResponse = {
    val __obj = js.Dynamic.literal(valid = true)
    __obj.asInstanceOf[IpsCheckCustomDnsValidResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpsCheckCustomDnsValidResponse] (val x: Self) extends AnyVal {
    
    inline def setValid(value: `true`): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
