package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslCertsInsertResponse extends StObject {
  
  /**
    * The new client certificate and private key.
    */
  var clientCert: js.UndefOr[SchemaSslCertDetail] = js.undefined
  
  /**
    * This is always `sql#sslCertsInsert`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operation to track the ssl certs insert request.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
  
  /**
    * The server Certificate Authority's certificate. If this is missing you can force a new one to be generated by calling resetSslConfig method on instances resource.
    */
  var serverCaCert: js.UndefOr[SchemaSslCert] = js.undefined
}
object SchemaSslCertsInsertResponse {
  
  inline def apply(): SchemaSslCertsInsertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsInsertResponse]
  }
  
  extension [Self <: SchemaSslCertsInsertResponse](x: Self) {
    
    inline def setClientCert(value: SchemaSslCertDetail): Self = StObject.set(x, "clientCert", value.asInstanceOf[js.Any])
    
    inline def setClientCertUndefined: Self = StObject.set(x, "clientCert", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setServerCaCert(value: SchemaSslCert): Self = StObject.set(x, "serverCaCert", value.asInstanceOf[js.Any])
    
    inline def setServerCaCertUndefined: Self = StObject.set(x, "serverCaCert", js.undefined)
  }
}
