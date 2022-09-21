package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchCertificateAuthorityCsrResponse extends StObject {
  
  /**
    * Output only. The PEM-encoded signed certificate signing request (CSR).
    */
  var pemCsr: js.UndefOr[String | Null] = js.undefined
}
object SchemaFetchCertificateAuthorityCsrResponse {
  
  inline def apply(): SchemaFetchCertificateAuthorityCsrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchCertificateAuthorityCsrResponse]
  }
  
  extension [Self <: SchemaFetchCertificateAuthorityCsrResponse](x: Self) {
    
    inline def setPemCsr(value: String): Self = StObject.set(x, "pemCsr", value.asInstanceOf[js.Any])
    
    inline def setPemCsrNull: Self = StObject.set(x, "pemCsr", null)
    
    inline def setPemCsrUndefined: Self = StObject.set(x, "pemCsr", js.undefined)
  }
}
