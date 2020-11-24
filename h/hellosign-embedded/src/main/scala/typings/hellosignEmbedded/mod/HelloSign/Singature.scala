package typings.hellosignEmbedded.mod.HelloSign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Singature extends js.Object {
  
  var order: js.UndefOr[Double] = js.native
  
  var signer_email_address: String = js.native
  
  var signer_name: String = js.native
}
object Singature {
  
  @scala.inline
  def apply(signer_email_address: String, signer_name: String): Singature = {
    val __obj = js.Dynamic.literal(signer_email_address = signer_email_address.asInstanceOf[js.Any], signer_name = signer_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Singature]
  }
  
  @scala.inline
  implicit class SingatureOps[Self <: Singature] (val x: Self) extends AnyVal {
    
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
    def setSigner_email_address(value: String): Self = this.set("signer_email_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner_name(value: String): Self = this.set("signer_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
