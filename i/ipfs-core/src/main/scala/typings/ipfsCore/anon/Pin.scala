package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.GCLock
import typings.ipfsCore.componentsMod.IPLD
import typings.ipfsCore.componentsMod.Pin_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pin extends js.Object {
  
  var gcLock: GCLock = js.native
  
  var ipld: IPLD = js.native
  
  var pin: Pin_ = js.native
  
  var preload: typings.ipfsCore.componentsMod.Preload = js.native
}
object Pin {
  
  @scala.inline
  def apply(gcLock: GCLock, ipld: IPLD, pin: Pin_, preload: typings.ipfsCore.componentsMod.Preload): Pin = {
    val __obj = js.Dynamic.literal(gcLock = gcLock.asInstanceOf[js.Any], ipld = ipld.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pin]
  }
  
  @scala.inline
  implicit class PinOps[Self <: Pin] (val x: Self) extends AnyVal {
    
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
    def setGcLock(value: GCLock): Self = this.set("gcLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpld(value: IPLD): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: Pin_): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: typings.ipfsCore.componentsMod.Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
