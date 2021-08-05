package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificateConfig extends StObject {
  
  /** Issue a client certificate. */
  var issueClientCertificate: js.UndefOr[Boolean] = js.undefined
}
object ClientCertificateConfig {
  
  inline def apply(): ClientCertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificateConfig]
  }
  
  extension [Self <: ClientCertificateConfig](x: Self) {
    
    inline def setIssueClientCertificate(value: Boolean): Self = StObject.set(x, "issueClientCertificate", value.asInstanceOf[js.Any])
    
    inline def setIssueClientCertificateUndefined: Self = StObject.set(x, "issueClientCertificate", js.undefined)
  }
}
