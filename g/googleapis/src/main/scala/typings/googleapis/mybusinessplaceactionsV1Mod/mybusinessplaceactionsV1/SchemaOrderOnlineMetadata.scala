package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderOnlineMetadata extends StObject {
  
  /**
    * Available fulfillment options for an order online action.
    */
  var fulfillmentOption: js.UndefOr[js.Array[SchemaFulfillmentOption]] = js.undefined
}
object SchemaOrderOnlineMetadata {
  
  inline def apply(): SchemaOrderOnlineMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderOnlineMetadata]
  }
  
  extension [Self <: SchemaOrderOnlineMetadata](x: Self) {
    
    inline def setFulfillmentOption(value: js.Array[SchemaFulfillmentOption]): Self = StObject.set(x, "fulfillmentOption", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentOptionUndefined: Self = StObject.set(x, "fulfillmentOption", js.undefined)
    
    inline def setFulfillmentOptionVarargs(value: SchemaFulfillmentOption*): Self = StObject.set(x, "fulfillmentOption", js.Array(value*))
  }
}
