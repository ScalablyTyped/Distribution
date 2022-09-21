package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsValidResponse
  - typings.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsInvalidResponse
*/
trait IpsCheckCustomDnsResponse extends StObject
object IpsCheckCustomDnsResponse {
  
  inline def IpsCheckCustomDnsInvalidResponse(error: String): typings.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsInvalidResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], valid = false)
    __obj.asInstanceOf[typings.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsInvalidResponse]
  }
  
  inline def IpsCheckCustomDnsValidResponse(): typings.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsValidResponse = {
    val __obj = js.Dynamic.literal(valid = true)
    __obj.asInstanceOf[typings.mailchimpMailchimpTransactional.mod.IpsCheckCustomDnsValidResponse]
  }
}
