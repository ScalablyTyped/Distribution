package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for client certificates on the cluster.
  */
@js.native
trait SchemaClientCertificateConfig extends StObject {
  
  /**
    * Issue a client certificate.
    */
  var issueClientCertificate: js.UndefOr[Boolean] = js.native
}
object SchemaClientCertificateConfig {
  
  @scala.inline
  def apply(): SchemaClientCertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientCertificateConfig]
  }
  
  @scala.inline
  implicit class SchemaClientCertificateConfigMutableBuilder[Self <: SchemaClientCertificateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssueClientCertificate(value: Boolean): Self = StObject.set(x, "issueClientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueClientCertificateUndefined: Self = StObject.set(x, "issueClientCertificate", js.undefined)
  }
}
