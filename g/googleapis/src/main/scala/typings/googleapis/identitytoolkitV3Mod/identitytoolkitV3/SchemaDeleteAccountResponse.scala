package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteAccountResponse extends StObject {
  
  /**
    * The fixed string "identitytoolkit#DeleteAccountResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteAccountResponse {
  
  inline def apply(): SchemaDeleteAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteAccountResponse]
  }
  
  extension [Self <: SchemaDeleteAccountResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
