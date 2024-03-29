package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsFilter extends StObject {
  
  var cred_def_id: js.UndefOr[String] = js.undefined
  
  var issuer_did: js.UndefOr[String] = js.undefined
  
  var schema_id: js.UndefOr[String] = js.undefined
  
  var schema_issuer_did: js.UndefOr[String] = js.undefined
  
  var schema_name: js.UndefOr[String] = js.undefined
  
  var schema_version: js.UndefOr[String] = js.undefined
}
object GetCredentialsFilter {
  
  inline def apply(): GetCredentialsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCredentialsFilter] (val x: Self) extends AnyVal {
    
    inline def setCred_def_id(value: String): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    inline def setCred_def_idUndefined: Self = StObject.set(x, "cred_def_id", js.undefined)
    
    inline def setIssuer_did(value: String): Self = StObject.set(x, "issuer_did", value.asInstanceOf[js.Any])
    
    inline def setIssuer_didUndefined: Self = StObject.set(x, "issuer_did", js.undefined)
    
    inline def setSchema_id(value: String): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
    
    inline def setSchema_idUndefined: Self = StObject.set(x, "schema_id", js.undefined)
    
    inline def setSchema_issuer_did(value: String): Self = StObject.set(x, "schema_issuer_did", value.asInstanceOf[js.Any])
    
    inline def setSchema_issuer_didUndefined: Self = StObject.set(x, "schema_issuer_did", js.undefined)
    
    inline def setSchema_name(value: String): Self = StObject.set(x, "schema_name", value.asInstanceOf[js.Any])
    
    inline def setSchema_nameUndefined: Self = StObject.set(x, "schema_name", js.undefined)
    
    inline def setSchema_version(value: String): Self = StObject.set(x, "schema_version", value.asInstanceOf[js.Any])
    
    inline def setSchema_versionUndefined: Self = StObject.set(x, "schema_version", js.undefined)
  }
}
