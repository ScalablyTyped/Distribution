package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertificatesScopedList extends js.Object {
  
  /** List of SslCertificates contained in this scope. */
  var sslCertificates: js.UndefOr[js.Array[SslCertificate]] = js.native
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object SslCertificatesScopedList {
  
  @scala.inline
  def apply(): SslCertificatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertificatesScopedList]
  }
  
  @scala.inline
  implicit class SslCertificatesScopedListOps[Self <: SslCertificatesScopedList] (val x: Self) extends AnyVal {
    
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
    def setSslCertificatesVarargs(value: SslCertificate*): Self = this.set("sslCertificates", js.Array(value :_*))
    
    @scala.inline
    def setSslCertificates(value: js.Array[SslCertificate]): Self = this.set("sslCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCertificates: Self = this.set("sslCertificates", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
