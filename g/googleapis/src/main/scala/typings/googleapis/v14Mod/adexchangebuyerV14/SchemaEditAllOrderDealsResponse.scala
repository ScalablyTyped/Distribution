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
  var orderRevisionNumber: js.UndefOr[String] = js.undefined
}
object SchemaEditAllOrderDealsResponse {
  
  @scala.inline
  def apply(): SchemaEditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditAllOrderDealsResponse]
  }
  
  @scala.inline
  implicit class SchemaEditAllOrderDealsResponseMutableBuilder[Self <: SchemaEditAllOrderDealsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeals(value: js.Array[SchemaMarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    @scala.inline
    def setDealsVarargs(value: SchemaMarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value :_*))
    
    @scala.inline
    def setOrderRevisionNumber(value: String): Self = StObject.set(x, "orderRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderRevisionNumberUndefined: Self = StObject.set(x, "orderRevisionNumber", js.undefined)
  }
}
