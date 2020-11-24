package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.Block_
import typings.ipfsCore.componentsMod.IPFSBlockService
import typings.ipfsCore.componentsMod.IPFSRepo
import typings.ipfsCore.componentsMod.IPLD
import typings.ipfsCore.initMod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var block: Block_ = js.native
  
  var blockService: IPFSBlockService = js.native
  
  var ipld: IPLD = js.native
  
  var options: ConstructorOptions[_, _] = js.native
  
  var preload: typings.ipfsCore.componentsMod.Preload = js.native
  
  var repo: IPFSRepo = js.native
}
object Options {
  
  @scala.inline
  def apply(
    block: Block_,
    blockService: IPFSBlockService,
    ipld: IPLD,
    options: ConstructorOptions[_, _],
    preload: typings.ipfsCore.componentsMod.Preload,
    repo: IPFSRepo
  ): Options = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockService = blockService.asInstanceOf[js.Any], ipld = ipld.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBlockService(value: IPFSBlockService): Self = this.set("blockService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpld(value: IPLD): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ConstructorOptions[_, _]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: typings.ipfsCore.componentsMod.Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: IPFSRepo): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
