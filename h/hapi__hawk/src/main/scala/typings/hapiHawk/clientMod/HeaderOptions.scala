package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderOptions extends js.Object {
  
  /** Oz application id */
  var app: js.UndefOr[String] = js.native
  
  /** Payload content-type (ignored if hash provided) */
  var contentType: js.UndefOr[String] = js.native
  
  var credentials: Credentials = js.native
  
  /** Oz delegated-by application id */
  var dlg: js.UndefOr[String] = js.native
  
  /** Application specific data sent via the ext attribute */
  var ext: js.UndefOr[String] = js.native
  
  /** Pre-calculated payload hash */
  var hash: js.UndefOr[String] = js.native
  
  /** Time offset to sync with server time (ignored if timestamp provided) */
  var localtimeOffsetMsec: js.UndefOr[Double] = js.native
  
  /** A pre-generated nonce */
  var nonce: js.UndefOr[String] = js.native
  
  /** UTF-8 encoded string for body hash generation (ignored if hash provided) */
  var payload: js.UndefOr[String] = js.native
  
  /** A pre-calculated timestamp in seconds */
  var timestamp: js.UndefOr[Double] = js.native
}
object HeaderOptions {
  
  @scala.inline
  def apply(credentials: Credentials): HeaderOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderOptions]
  }
  
  @scala.inline
  implicit class HeaderOptionsOps[Self <: HeaderOptions] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: Credentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setDlg(value: String): Self = this.set("dlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDlg: Self = this.set("dlg", js.undefined)
    
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setLocaltimeOffsetMsec(value: Double): Self = this.set("localtimeOffsetMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaltimeOffsetMsec: Self = this.set("localtimeOffsetMsec", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
