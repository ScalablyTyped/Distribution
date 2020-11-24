package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.Block_
import typings.ipfsCore.componentsMod.GCLock
import typings.ipfsCore.componentsMod.Pin_
import typings.ipfsCore.initMod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends js.Object {
  
  var block: Block_ = js.native
  
  var gcLock: GCLock = js.native
  
  var options: ConstructorOptions[_, Boolean] = js.native
  
  var pin: Pin_ = js.native
  
  var preload: typings.ipfsCore.componentsMod.Preload = js.native
}
object Block {
  
  @scala.inline
  def apply(
    block: Block_,
    gcLock: GCLock,
    options: ConstructorOptions[_, Boolean],
    pin: Pin_,
    preload: typings.ipfsCore.componentsMod.Preload
  ): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], gcLock = gcLock.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    
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
    def setGcLock(value: GCLock): Self = this.set("gcLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ConstructorOptions[_, Boolean]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: Pin_): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: typings.ipfsCore.componentsMod.Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
