package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetSslProxiesSetSslCertificatesRequest extends StObject {
  
  /**
    * New set of URLs to SslCertificate resources to associate with this
    * TargetSslProxy. Currently exactly one ssl certificate must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTargetSslProxiesSetSslCertificatesRequest {
  
  inline def apply(): SchemaTargetSslProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetSslProxiesSetSslCertificatesRequest]
  }
  
  extension [Self <: SchemaTargetSslProxiesSetSslCertificatesRequest](x: Self) {
    
    inline def setSslCertificates(value: js.Array[String]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    inline def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    inline def setSslCertificatesVarargs(value: String*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
  }
}
