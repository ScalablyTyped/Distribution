package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountGoogleMyBusinessLink extends StObject {
  
  /** The ID of the GMB account. If this is provided, then `gmbEmail` is ignored. The value of this field should match the `accountId` used by the GMB API. */
  var gmbAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The GMB email address of which a specific account within a GMB account. A sample account within a GMB account could be a business account with set of locations, managed under the
    * GMB account.
    */
  var gmbEmail: js.UndefOr[String] = js.undefined
  
  /** Status of the link between this Merchant Center account and the GMB account. Acceptable values are: - "`active`" - "`pending`" */
  var status: js.UndefOr[String] = js.undefined
}
object AccountGoogleMyBusinessLink {
  
  @scala.inline
  def apply(): AccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountGoogleMyBusinessLink]
  }
  
  @scala.inline
  implicit class AccountGoogleMyBusinessLinkMutableBuilder[Self <: AccountGoogleMyBusinessLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGmbAccountId(value: String): Self = StObject.set(x, "gmbAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmbAccountIdUndefined: Self = StObject.set(x, "gmbAccountId", js.undefined)
    
    @scala.inline
    def setGmbEmail(value: String): Self = StObject.set(x, "gmbEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmbEmailUndefined: Self = StObject.set(x, "gmbEmail", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
