package typings.ledgerhqHwAppBtc.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedInput extends js.Object {
  
  var trustedInput: Boolean = js.native
  
  var value: Buffer = js.native
}
object TrustedInput {
  
  @scala.inline
  def apply(trustedInput: Boolean, value: Buffer): TrustedInput = {
    val __obj = js.Dynamic.literal(trustedInput = trustedInput.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedInput]
  }
  
  @scala.inline
  implicit class TrustedInputOps[Self <: TrustedInput] (val x: Self) extends AnyVal {
    
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
    def setTrustedInput(value: Boolean): Self = this.set("trustedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
