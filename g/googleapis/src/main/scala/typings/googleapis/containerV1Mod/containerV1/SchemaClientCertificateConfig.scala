package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientCertificateConfig extends StObject {
  
  /**
    * Issue a client certificate.
    */
  var issueClientCertificate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaClientCertificateConfig {
  
  inline def apply(): SchemaClientCertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientCertificateConfig]
  }
  
  extension [Self <: SchemaClientCertificateConfig](x: Self) {
    
    inline def setIssueClientCertificate(value: Boolean): Self = StObject.set(x, "issueClientCertificate", value.asInstanceOf[js.Any])
    
    inline def setIssueClientCertificateNull: Self = StObject.set(x, "issueClientCertificate", null)
    
    inline def setIssueClientCertificateUndefined: Self = StObject.set(x, "issueClientCertificate", js.undefined)
  }
}
