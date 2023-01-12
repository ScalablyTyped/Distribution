package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSslProxiesSetSslCertificatesRequest extends StObject {
  
  /**
    * New set of URLs to SslCertificate resources to associate with this TargetSslProxy. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL
    * certificates.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.undefined
}
object TargetSslProxiesSetSslCertificatesRequest {
  
  inline def apply(): TargetSslProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSslProxiesSetSslCertificatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetSslProxiesSetSslCertificatesRequest] (val x: Self) extends AnyVal {
    
    inline def setSslCertificates(value: js.Array[String]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    inline def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    inline def setSslCertificatesVarargs(value: String*): Self = StObject.set(x, "sslCertificates", js.Array(value*))
  }
}
