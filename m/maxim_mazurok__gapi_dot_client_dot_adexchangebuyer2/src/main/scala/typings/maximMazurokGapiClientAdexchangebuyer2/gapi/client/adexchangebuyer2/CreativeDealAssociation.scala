package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeDealAssociation extends StObject {
  
  /** The account the creative belongs to. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The ID of the creative associated with the deal. */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /** The externalDealId for the deal associated with the creative. */
  var dealsId: js.UndefOr[String] = js.undefined
}
object CreativeDealAssociation {
  
  inline def apply(): CreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeDealAssociation]
  }
  
  extension [Self <: CreativeDealAssociation](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setDealsId(value: String): Self = StObject.set(x, "dealsId", value.asInstanceOf[js.Any])
    
    inline def setDealsIdUndefined: Self = StObject.set(x, "dealsId", js.undefined)
  }
}
