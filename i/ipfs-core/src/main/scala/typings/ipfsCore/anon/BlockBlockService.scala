package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.Block_
import typings.ipfsCore.initMod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockBlockService extends js.Object {
  
  var block: Block_ = js.native
  
  var blockService: js.Any = js.native
  
  var ipld: js.Any = js.native
  
  var options: ConstructorOptions[_, _] = js.native
  
  var preload: (js.Function0[Unit] with Start) | Call = js.native
  
  var repo: js.Any = js.native
}
object BlockBlockService {
  
  @scala.inline
  def apply(
    block: Block_,
    blockService: js.Any,
    ipld: js.Any,
    options: ConstructorOptions[_, _],
    preload: (js.Function0[Unit] with Start) | Call,
    repo: js.Any
  ): BlockBlockService = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockService = blockService.asInstanceOf[js.Any], ipld = ipld.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockBlockService]
  }
  
  @scala.inline
  implicit class BlockBlockServiceOps[Self <: BlockBlockService] (val x: Self) extends AnyVal {
    
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
    def setBlockService(value: js.Any): Self = this.set("blockService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpld(value: js.Any): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ConstructorOptions[_, _]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: (js.Function0[Unit] with Start) | Call): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: js.Any): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
