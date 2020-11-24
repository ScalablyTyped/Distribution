package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCertificateConfig extends js.Object {
  
  /** Issue a client certificate. */
  var issueClientCertificate: js.UndefOr[Boolean] = js.native
}
object ClientCertificateConfig {
  
  @scala.inline
  def apply(): ClientCertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificateConfig]
  }
  
  @scala.inline
  implicit class ClientCertificateConfigOps[Self <: ClientCertificateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIssueClientCertificate(value: Boolean): Self = this.set("issueClientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueClientCertificate: Self = this.set("issueClientCertificate", js.undefined)
  }
}
