package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Respone of uploading accounts in batch.
  */
trait SchemaUploadAccountResponse extends StObject {
  
  /**
    * The error encountered while processing the account info.
    */
  var error: js.UndefOr[js.Array[Index]] = js.undefined
  
  /**
    * The fixed string &quot;identitytoolkit#UploadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaUploadAccountResponse {
  
  inline def apply(): SchemaUploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadAccountResponse]
  }
  
  extension [Self <: SchemaUploadAccountResponse](x: Self) {
    
    inline def setError(value: js.Array[Index]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: Index*): Self = StObject.set(x, "error", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
