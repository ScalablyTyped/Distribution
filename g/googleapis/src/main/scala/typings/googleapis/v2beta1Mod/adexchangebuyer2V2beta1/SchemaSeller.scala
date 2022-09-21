package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeller extends StObject {
  
  /**
    * The unique ID for the seller. The seller fills in this field. The seller account ID is then available to buyer in the product.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Ad manager network code for the seller.
    */
  var subAccountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSeller {
  
  inline def apply(): SchemaSeller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeller]
  }
  
  extension [Self <: SchemaSeller](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setSubAccountId(value: String): Self = StObject.set(x, "subAccountId", value.asInstanceOf[js.Any])
    
    inline def setSubAccountIdNull: Self = StObject.set(x, "subAccountId", null)
    
    inline def setSubAccountIdUndefined: Self = StObject.set(x, "subAccountId", js.undefined)
  }
}
