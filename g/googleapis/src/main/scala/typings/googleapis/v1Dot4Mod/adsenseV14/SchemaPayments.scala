package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPayments extends StObject {
  
  /**
    * The list of Payments for the account. One or both of a) the account's most recent payment; and b) the account's upcoming payment.
    */
  var items: js.UndefOr[js.Array[SchemaPayment]] = js.undefined
  
  /**
    * Kind of list this is, in this case adsense#payments.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaPayments {
  
  inline def apply(): SchemaPayments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPayments]
  }
  
  extension [Self <: SchemaPayments](x: Self) {
    
    inline def setItems(value: js.Array[SchemaPayment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaPayment*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
