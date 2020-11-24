package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.Pin_
import typings.ipfsCore.componentsMod.RWLock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcLockIpld extends js.Object {
  
  var gcLock: RWLock = js.native
  
  var ipld: js.Any = js.native
  
  var pin: Pin_ = js.native
  
  var preload: (js.Function0[Unit] with Start) | Call = js.native
}
object GcLockIpld {
  
  @scala.inline
  def apply(gcLock: RWLock, ipld: js.Any, pin: Pin_, preload: (js.Function0[Unit] with Start) | Call): GcLockIpld = {
    val __obj = js.Dynamic.literal(gcLock = gcLock.asInstanceOf[js.Any], ipld = ipld.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcLockIpld]
  }
  
  @scala.inline
  implicit class GcLockIpldOps[Self <: GcLockIpld] (val x: Self) extends AnyVal {
    
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
    def setGcLock(value: RWLock): Self = this.set("gcLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpld(value: js.Any): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: Pin_): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: (js.Function0[Unit] with Start) | Call): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
