package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Respone of deleting account.
  */
trait SchemaDeleteAccountResponse extends StObject {
  
  /**
    * The fixed string &quot;identitytoolkit#DeleteAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDeleteAccountResponse {
  
  inline def apply(): SchemaDeleteAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteAccountResponse]
  }
  
  extension [Self <: SchemaDeleteAccountResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
