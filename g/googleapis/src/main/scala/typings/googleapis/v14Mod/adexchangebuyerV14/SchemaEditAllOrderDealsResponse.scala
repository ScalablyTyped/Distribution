package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEditAllOrderDealsResponse extends StObject {
  
  /**
    * List of all deals in the proposal after edit.
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.undefined
  
  /**
    * The latest revision number after the update has been applied.
    */
  var orderRevisionNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaEditAllOrderDealsResponse {
  
  inline def apply(): SchemaEditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditAllOrderDealsResponse]
  }
  
  extension [Self <: SchemaEditAllOrderDealsResponse](x: Self) {
    
    inline def setDeals(value: js.Array[SchemaMarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: SchemaMarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value*))
    
    inline def setOrderRevisionNumber(value: String): Self = StObject.set(x, "orderRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setOrderRevisionNumberNull: Self = StObject.set(x, "orderRevisionNumber", null)
    
    inline def setOrderRevisionNumberUndefined: Self = StObject.set(x, "orderRevisionNumber", js.undefined)
  }
}
