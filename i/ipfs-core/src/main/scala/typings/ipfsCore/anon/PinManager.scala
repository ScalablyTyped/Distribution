package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.GCLock
import typings.ipfsCore.componentsMod.IPFSBlockService
import typings.ipfsCore.pinManagerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinManager extends js.Object {
  
  var blockService: IPFSBlockService = js.native
  
  var gcLock: GCLock = js.native
  
  var pinManager: ^ = js.native
}
object PinManager {
  
  @scala.inline
  def apply(blockService: IPFSBlockService, gcLock: GCLock, pinManager: ^): PinManager = {
    val __obj = js.Dynamic.literal(blockService = blockService.asInstanceOf[js.Any], gcLock = gcLock.asInstanceOf[js.Any], pinManager = pinManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinManager]
  }
  
  @scala.inline
  implicit class PinManagerOps[Self <: PinManager] (val x: Self) extends AnyVal {
    
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
    def setBlockService(value: IPFSBlockService): Self = this.set("blockService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcLock(value: GCLock): Self = this.set("gcLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinManager(value: ^): Self = this.set("pinManager", value.asInstanceOf[js.Any])
  }
}
