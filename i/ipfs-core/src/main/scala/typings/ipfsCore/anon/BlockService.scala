package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.IPFSBlockService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockService extends js.Object {
  
  var blockService: IPFSBlockService = js.native
  
  var preload: typings.ipfsCore.componentsMod.Preload = js.native
}
object BlockService {
  
  @scala.inline
  def apply(blockService: IPFSBlockService, preload: typings.ipfsCore.componentsMod.Preload): BlockService = {
    val __obj = js.Dynamic.literal(blockService = blockService.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockService]
  }
  
  @scala.inline
  implicit class BlockServiceOps[Self <: BlockService] (val x: Self) extends AnyVal {
    
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
    def setPreload(value: typings.ipfsCore.componentsMod.Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
