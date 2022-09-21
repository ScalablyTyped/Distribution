package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslCertsListResponse extends StObject {
  
  /**
    * List of client certificates for the instance.
    */
  var items: js.UndefOr[js.Array[SchemaSslCert]] = js.undefined
  
  /**
    * This is always *sql#sslCertsList*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaSslCertsListResponse {
  
  inline def apply(): SchemaSslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsListResponse]
  }
  
  extension [Self <: SchemaSslCertsListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaSslCert]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaSslCert*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
