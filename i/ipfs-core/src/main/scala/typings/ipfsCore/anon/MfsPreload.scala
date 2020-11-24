package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MfsPreload extends js.Object {
  
  var apiManager: js.Any = js.native
  
  var bitswap: js.Any = js.native
  
  var blockService: js.Any = js.native
  
  var gcLock: js.Any = js.native
  
  var initOptions: js.Any = js.native
  
  var ipld: js.Any = js.native
  
  var ipns: js.Any = js.native
  
  var keychain: js.Any = js.native
  
  var libp2p: js.Any = js.native
  
  var mfsPreload: js.Any = js.native
  
  var options: js.Any = js.native
  
  var peerId: js.Any = js.native
  
  var pinManager: js.UndefOr[js.Object] = js.native
  
  var preload: js.Any = js.native
  
  var print: js.Any = js.native
  
  var repo: js.Any = js.native
}
object MfsPreload {
  
  @scala.inline
  def apply(
    apiManager: js.Any,
    bitswap: js.Any,
    blockService: js.Any,
    gcLock: js.Any,
    initOptions: js.Any,
    ipld: js.Any,
    ipns: js.Any,
    keychain: js.Any,
    libp2p: js.Any,
    mfsPreload: js.Any,
    options: js.Any,
    peerId: js.Any,
    preload: js.Any,
    print: js.Any,
    repo: js.Any
  ): MfsPreload = {
    val __obj = js.Dynamic.literal(apiManager = apiManager.asInstanceOf[js.Any], bitswap = bitswap.asInstanceOf[js.Any], blockService = blockService.asInstanceOf[js.Any], gcLock = gcLock.asInstanceOf[js.Any], initOptions = initOptions.asInstanceOf[js.Any], ipld = ipld.asInstanceOf[js.Any], ipns = ipns.asInstanceOf[js.Any], keychain = keychain.asInstanceOf[js.Any], libp2p = libp2p.asInstanceOf[js.Any], mfsPreload = mfsPreload.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MfsPreload]
  }
  
  @scala.inline
  implicit class MfsPreloadOps[Self <: MfsPreload] (val x: Self) extends AnyVal {
    
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
    def setApiManager(value: js.Any): Self = this.set("apiManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitswap(value: js.Any): Self = this.set("bitswap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockService(value: js.Any): Self = this.set("blockService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcLock(value: js.Any): Self = this.set("gcLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitOptions(value: js.Any): Self = this.set("initOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpld(value: js.Any): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpns(value: js.Any): Self = this.set("ipns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeychain(value: js.Any): Self = this.set("keychain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibp2p(value: js.Any): Self = this.set("libp2p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfsPreload(value: js.Any): Self = this.set("mfsPreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: js.Any): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: js.Any): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: js.Any): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: js.Any): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinManager(value: js.Object): Self = this.set("pinManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinManager: Self = this.set("pinManager", js.undefined)
  }
}
