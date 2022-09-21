package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsLinkResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#accountsLinkResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountsLinkResponse {
  
  inline def apply(): SchemaAccountsLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsLinkResponse]
  }
  
  extension [Self <: SchemaAccountsLinkResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
