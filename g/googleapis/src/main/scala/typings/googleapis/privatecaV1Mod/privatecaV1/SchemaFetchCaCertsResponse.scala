package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchCaCertsResponse extends StObject {
  
  /**
    * The PEM encoded CA certificate chains of all ACTIVE CertificateAuthority resources in this CaPool.
    */
  var caCerts: js.UndefOr[js.Array[SchemaCertChain]] = js.undefined
}
object SchemaFetchCaCertsResponse {
  
  inline def apply(): SchemaFetchCaCertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchCaCertsResponse]
  }
  
  extension [Self <: SchemaFetchCaCertsResponse](x: Self) {
    
    inline def setCaCerts(value: js.Array[SchemaCertChain]): Self = StObject.set(x, "caCerts", value.asInstanceOf[js.Any])
    
    inline def setCaCertsUndefined: Self = StObject.set(x, "caCerts", js.undefined)
    
    inline def setCaCertsVarargs(value: SchemaCertChain*): Self = StObject.set(x, "caCerts", js.Array(value*))
  }
}
