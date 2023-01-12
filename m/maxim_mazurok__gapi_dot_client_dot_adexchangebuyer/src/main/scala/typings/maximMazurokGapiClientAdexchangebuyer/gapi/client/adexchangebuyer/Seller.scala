package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seller extends StObject {
  
  /** The unique id for the seller. The seller fills in this field. The seller account id is then available to buyer in the product. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Optional sub-account id for the seller. */
  var subAccountId: js.UndefOr[String] = js.undefined
}
object Seller {
  
  inline def apply(): Seller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seller]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Seller] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setSubAccountId(value: String): Self = StObject.set(x, "subAccountId", value.asInstanceOf[js.Any])
    
    inline def setSubAccountIdUndefined: Self = StObject.set(x, "subAccountId", js.undefined)
  }
}
