package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsClaimWebsiteResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#accountsClaimWebsiteResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountsClaimWebsiteResponse {
  
  inline def apply(): SchemaAccountsClaimWebsiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsClaimWebsiteResponse]
  }
  
  extension [Self <: SchemaAccountsClaimWebsiteResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
