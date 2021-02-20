package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Respone of uploading accounts in batch.
  */
@js.native
trait SchemaUploadAccountResponse extends StObject {
  
  /**
    * The error encountered while processing the account info.
    */
  var error: js.UndefOr[js.Array[Index]] = js.native
  
  /**
    * The fixed string &quot;identitytoolkit#UploadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaUploadAccountResponse {
  
  @scala.inline
  def apply(): SchemaUploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadAccountResponse]
  }
  
  @scala.inline
  implicit class SchemaUploadAccountResponseMutableBuilder[Self <: SchemaUploadAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Array[Index]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: Index*): Self = StObject.set(x, "error", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
