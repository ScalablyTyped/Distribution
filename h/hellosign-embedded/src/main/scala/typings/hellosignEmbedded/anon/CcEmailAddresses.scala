package typings.hellosignEmbedded.anon

import typings.hellosignEmbedded.mod.HelloSign.Singature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcEmailAddresses extends js.Object {
  
  var ccEmailAddresses: js.Array[String] = js.native
  
  var message: String = js.native
  
  var signatures: js.Array[Singature] = js.native
  
  var title: String = js.native
}
object CcEmailAddresses {
  
  @scala.inline
  def apply(
    ccEmailAddresses: js.Array[String],
    message: String,
    signatures: js.Array[Singature],
    title: String
  ): CcEmailAddresses = {
    val __obj = js.Dynamic.literal(ccEmailAddresses = ccEmailAddresses.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcEmailAddresses]
  }
  
  @scala.inline
  implicit class CcEmailAddressesOps[Self <: CcEmailAddresses] (val x: Self) extends AnyVal {
    
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
    def setCcEmailAddressesVarargs(value: String*): Self = this.set("ccEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setCcEmailAddresses(value: js.Array[String]): Self = this.set("ccEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: Singature*): Self = this.set("signatures", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[Singature]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
