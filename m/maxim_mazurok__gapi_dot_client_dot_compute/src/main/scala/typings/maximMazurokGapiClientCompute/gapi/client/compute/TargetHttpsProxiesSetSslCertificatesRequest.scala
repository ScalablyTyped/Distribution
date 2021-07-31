package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetHttpsProxiesSetSslCertificatesRequest extends StObject {
  
  /** New set of SslCertificate resources to associate with this TargetHttpsProxy resource. Currently exactly one SslCertificate resource must be specified. */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.undefined
}
object TargetHttpsProxiesSetSslCertificatesRequest {
  
  @scala.inline
  def apply(): TargetHttpsProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpsProxiesSetSslCertificatesRequest]
  }
  
  @scala.inline
  implicit class TargetHttpsProxiesSetSslCertificatesRequestMutableBuilder[Self <: TargetHttpsProxiesSetSslCertificatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSslCertificates(value: js.Array[String]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    @scala.inline
    def setSslCertificatesVarargs(value: String*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
  }
}
