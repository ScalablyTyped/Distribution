package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuyer extends StObject {
  
  /**
    * Authorized Buyers account ID of the buyer.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuyer {
  
  inline def apply(): SchemaBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuyer]
  }
  
  extension [Self <: SchemaBuyer](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
