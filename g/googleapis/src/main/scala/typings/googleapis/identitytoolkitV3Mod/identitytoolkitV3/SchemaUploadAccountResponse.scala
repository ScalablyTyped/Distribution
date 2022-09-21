package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUploadAccountResponse extends StObject {
  
  /**
    * The error encountered while processing the account info.
    */
  var error: js.UndefOr[js.Array[Index] | Null] = js.undefined
  
  /**
    * The fixed string "identitytoolkit#UploadAccountResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaUploadAccountResponse {
  
  inline def apply(): SchemaUploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadAccountResponse]
  }
  
  extension [Self <: SchemaUploadAccountResponse](x: Self) {
    
    inline def setError(value: js.Array[Index]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: Index*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
