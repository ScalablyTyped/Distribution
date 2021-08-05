package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCertificatesScopedList extends StObject {
  
  /** List of SslCertificates contained in this scope. */
  var sslCertificates: js.UndefOr[js.Array[SslCertificate]] = js.undefined
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object SslCertificatesScopedList {
  
  inline def apply(): SslCertificatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertificatesScopedList]
  }
  
  extension [Self <: SslCertificatesScopedList](x: Self) {
    
    inline def setSslCertificates(value: js.Array[SslCertificate]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    inline def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    inline def setSslCertificatesVarargs(value: SslCertificate*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
