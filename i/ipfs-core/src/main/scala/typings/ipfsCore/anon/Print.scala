package typings.ipfsCore.anon

import typings.ipfsCore.apiManagerMod.^
import typings.ipfsCore.componentsMod.RWLock
import typings.ipfsCore.initMod.ConstructorOptions
import typings.ipfsCore.ipfsCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Print extends js.Object {
  
  var apiManager: ^ = js.native
  
  var blockService: js.Any = js.native
  
  var gcLock: RWLock = js.native
  
  var initOptions: typings.ipfsCore.initMod.InitOptions = js.native
  
  var ipld: TypeofimportedComponents = js.native
  
  var keychain: js.Any = js.native
  
  var options: ConstructorOptions[Boolean | typings.ipfsCore.initMod.InitOptions, `true`] = js.native
  
  var peerId: typings.peerId.mod.^ = js.native
  
  var pinManager: typings.ipfsCore.pinManagerMod.^ = js.native
  
  var preload: (js.Function0[Unit] with Start) | Call = js.native
  
  def print(args: js.Any*): Unit = js.native
  
  var repo: js.Any = js.native
}
object Print {
  
  @scala.inline
  def apply(
    apiManager: ^,
    blockService: js.Any,
    gcLock: RWLock,
    initOptions: typings.ipfsCore.initMod.InitOptions,
    ipld: TypeofimportedComponents,
    keychain: js.Any,
    options: ConstructorOptions[Boolean | typings.ipfsCore.initMod.InitOptions, `true`],
    peerId: typings.peerId.mod.^,
    pinManager: typings.ipfsCore.pinManagerMod.^,
    preload: (js.Function0[Unit] with Start) | Call,
    print: /* repeated */ js.Any => Unit,
    repo: js.Any
  ): Print = {
    val __obj = js.Dynamic.literal(apiManager = apiManager.asInstanceOf[js.Any], blockService = blockService.asInstanceOf[js.Any], gcLock = gcLock.asInstanceOf[js.Any], initOptions = initOptions.asInstanceOf[js.Any], ipld = ipld.asInstanceOf[js.Any], keychain = keychain.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], pinManager = pinManager.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], print = js.Any.fromFunction1(print), repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print]
  }
  
  @scala.inline
  implicit class PrintOps[Self <: Print] (val x: Self) extends AnyVal {
    
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
    def setApiManager(value: ^): Self = this.set("apiManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockService(value: js.Any): Self = this.set("blockService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcLock(value: RWLock): Self = this.set("gcLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitOptions(value: typings.ipfsCore.initMod.InitOptions): Self = this.set("initOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpld(value: TypeofimportedComponents): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeychain(value: js.Any): Self = this.set("keychain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ConstructorOptions[Boolean | typings.ipfsCore.initMod.InitOptions, `true`]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: typings.peerId.mod.^): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinManager(value: typings.ipfsCore.pinManagerMod.^): Self = this.set("pinManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: (js.Function0[Unit] with Start) | Call): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: /* repeated */ js.Any => Unit): Self = this.set("print", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRepo(value: js.Any): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
