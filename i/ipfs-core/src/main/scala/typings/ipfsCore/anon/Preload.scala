package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.Block_
import typings.ipfsCore.componentsMod.Pin_
import typings.ipfsCore.componentsMod.RWLock
import typings.ipfsCore.initMod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Preload extends js.Object {
  
  var block: Block_ = js.native
  
  var gcLock: RWLock = js.native
  
  var options: ConstructorOptions[_, Boolean] = js.native
  
  var pin: Pin_ = js.native
  
  var preload: (js.Function0[Unit] with Start) | Call = js.native
}
object Preload {
  
  @scala.inline
  def apply(
    block: Block_,
    gcLock: RWLock,
    options: ConstructorOptions[_, Boolean],
    pin: Pin_,
    preload: (js.Function0[Unit] with Start) | Call
  ): Preload = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], gcLock = gcLock.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preload]
  }
  
  @scala.inline
  implicit class PreloadOps[Self <: Preload] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: Block_): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcLock(value: RWLock): Self = this.set("gcLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ConstructorOptions[_, Boolean]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: Pin_): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: (js.Function0[Unit] with Start) | Call): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
