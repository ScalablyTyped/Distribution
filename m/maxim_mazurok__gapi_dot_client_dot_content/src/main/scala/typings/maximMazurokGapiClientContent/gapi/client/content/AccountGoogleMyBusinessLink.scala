package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountGoogleMyBusinessLink extends StObject {
  
  /** The ID of the Business Profile. If this is provided, then `gmbEmail` is ignored. The value of this field should match the `accountId` used by the Business Profile API. */
  var gmbAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Business Profile email address of a specific account within a Business Profile. A sample account within a Business Profile could be a business account with set of locations,
    * managed under the Business Profile.
    */
  var gmbEmail: js.UndefOr[String] = js.undefined
  
  /** Status of the link between this Merchant Center account and the Business Profile. Acceptable values are: - "`active`" - "`pending`" */
  var status: js.UndefOr[String] = js.undefined
}
object AccountGoogleMyBusinessLink {
  
  inline def apply(): AccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountGoogleMyBusinessLink]
  }
  
  extension [Self <: AccountGoogleMyBusinessLink](x: Self) {
    
    inline def setGmbAccountId(value: String): Self = StObject.set(x, "gmbAccountId", value.asInstanceOf[js.Any])
    
    inline def setGmbAccountIdUndefined: Self = StObject.set(x, "gmbAccountId", js.undefined)
    
    inline def setGmbEmail(value: String): Self = StObject.set(x, "gmbEmail", value.asInstanceOf[js.Any])
    
    inline def setGmbEmailUndefined: Self = StObject.set(x, "gmbEmail", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
