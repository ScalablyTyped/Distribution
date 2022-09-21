package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeDealAssociation extends StObject {
  
  /**
    * The account the creative belongs to.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the creative associated with the deal.
    */
  var creativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The externalDealId for the deal associated with the creative.
    */
  var dealsId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeDealAssociation {
  
  inline def apply(): SchemaCreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeDealAssociation]
  }
  
  extension [Self <: SchemaCreativeDealAssociation](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdNull: Self = StObject.set(x, "creativeId", null)
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setDealsId(value: String): Self = StObject.set(x, "dealsId", value.asInstanceOf[js.Any])
    
    inline def setDealsIdNull: Self = StObject.set(x, "dealsId", null)
    
    inline def setDealsIdUndefined: Self = StObject.set(x, "dealsId", js.undefined)
  }
}
