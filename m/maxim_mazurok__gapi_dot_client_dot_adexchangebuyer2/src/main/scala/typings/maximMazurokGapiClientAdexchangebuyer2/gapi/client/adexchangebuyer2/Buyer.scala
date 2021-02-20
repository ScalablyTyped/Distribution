package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buyer extends StObject {
  
  /** Authorized Buyers account ID of the buyer. */
  var accountId: js.UndefOr[String] = js.native
}
object Buyer {
  
  @scala.inline
  def apply(): Buyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buyer]
  }
  
  @scala.inline
  implicit class BuyerMutableBuilder[Self <: Buyer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
