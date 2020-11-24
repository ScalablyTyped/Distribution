package typings.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends Envelope {
  
  var authentication: js.UndefOr[js.Any] = js.native
  
  var compression: js.UndefOr[String] = js.native
  
  var compressionOptions: js.UndefOr[js.Array[String]] = js.native
  
  var encryption: js.UndefOr[String] = js.native
  
  var encryptionOptions: js.UndefOr[js.Array[String]] = js.native
  
  var reason: js.UndefOr[Reason] = js.native
  
  var scheme: js.UndefOr[String] = js.native
  
  var state: String = js.native
}
object Session {
  
  @scala.inline
  def apply(state: String): Session = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
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
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthentication(value: js.Any): Self = this.set("authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCompressionOptionsVarargs(value: String*): Self = this.set("compressionOptions", js.Array(value :_*))
    
    @scala.inline
    def setCompressionOptions(value: js.Array[String]): Self = this.set("compressionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionOptions: Self = this.set("compressionOptions", js.undefined)
    
    @scala.inline
    def setEncryption(value: String): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setEncryptionOptionsVarargs(value: String*): Self = this.set("encryptionOptions", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionOptions(value: js.Array[String]): Self = this.set("encryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionOptions: Self = this.set("encryptionOptions", js.undefined)
    
    @scala.inline
    def setReason(value: Reason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
}
