package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesListServerCasResponse extends StObject {
  
  var activeVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of server CA certificates for the instance.
    */
  var certs: js.UndefOr[js.Array[SchemaSslCert]] = js.undefined
  
  /**
    * This is always *sql#instancesListServerCas*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstancesListServerCasResponse {
  
  inline def apply(): SchemaInstancesListServerCasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesListServerCasResponse]
  }
  
  extension [Self <: SchemaInstancesListServerCasResponse](x: Self) {
    
    inline def setActiveVersion(value: String): Self = StObject.set(x, "activeVersion", value.asInstanceOf[js.Any])
    
    inline def setActiveVersionNull: Self = StObject.set(x, "activeVersion", null)
    
    inline def setActiveVersionUndefined: Self = StObject.set(x, "activeVersion", js.undefined)
    
    inline def setCerts(value: js.Array[SchemaSslCert]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCertsVarargs(value: SchemaSslCert*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
