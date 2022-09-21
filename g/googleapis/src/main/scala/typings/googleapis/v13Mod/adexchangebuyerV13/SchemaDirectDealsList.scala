package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDirectDealsList extends StObject {
  
  /**
    * A list of direct deals relevant for your account.
    */
  var directDeals: js.UndefOr[js.Array[SchemaDirectDeal]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDirectDealsList {
  
  inline def apply(): SchemaDirectDealsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectDealsList]
  }
  
  extension [Self <: SchemaDirectDealsList](x: Self) {
    
    inline def setDirectDeals(value: js.Array[SchemaDirectDeal]): Self = StObject.set(x, "directDeals", value.asInstanceOf[js.Any])
    
    inline def setDirectDealsUndefined: Self = StObject.set(x, "directDeals", js.undefined)
    
    inline def setDirectDealsVarargs(value: SchemaDirectDeal*): Self = StObject.set(x, "directDeals", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
