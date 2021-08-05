package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuyer extends StObject {
  
  /**
    * Adx account id of the buyer.
    */
  var accountId: js.UndefOr[String] = js.undefined
}
object SchemaBuyer {
  
  inline def apply(): SchemaBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuyer]
  }
  
  extension [Self <: SchemaBuyer](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
