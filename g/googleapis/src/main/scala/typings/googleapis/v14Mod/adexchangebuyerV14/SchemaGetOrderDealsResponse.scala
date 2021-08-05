package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetOrderDealsResponse extends StObject {
  
  /**
    * List of deals for the proposal
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.undefined
}
object SchemaGetOrderDealsResponse {
  
  inline def apply(): SchemaGetOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrderDealsResponse]
  }
  
  extension [Self <: SchemaGetOrderDealsResponse](x: Self) {
    
    inline def setDeals(value: js.Array[SchemaMarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: SchemaMarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value :_*))
  }
}
