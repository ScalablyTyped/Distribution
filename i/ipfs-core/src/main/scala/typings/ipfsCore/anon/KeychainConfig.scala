package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.IPFSRepo
import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeychainConfig extends js.Object {
  
  var config: js.Any = js.native
  
  var keychainConfig: js.UndefOr[Pass] = js.native
  
  var multiaddrs: js.UndefOr[js.Array[String]] = js.native
  
  var options: js.Any = js.native
  
  var peerId: js.UndefOr[^] = js.native
  
  var repo: IPFSRepo = js.native
}
object KeychainConfig {
  
  @scala.inline
  def apply(config: js.Any, options: js.Any, repo: IPFSRepo): KeychainConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeychainConfig]
  }
  
  @scala.inline
  implicit class KeychainConfigOps[Self <: KeychainConfig] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: IPFSRepo): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeychainConfig(value: Pass): Self = this.set("keychainConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeychainConfig: Self = this.set("keychainConfig", js.undefined)
    
    @scala.inline
    def setMultiaddrsVarargs(value: String*): Self = this.set("multiaddrs", js.Array(value :_*))
    
    @scala.inline
    def setMultiaddrs(value: js.Array[String]): Self = this.set("multiaddrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiaddrs: Self = this.set("multiaddrs", js.undefined)
    
    @scala.inline
    def setPeerId(value: ^): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerId: Self = this.set("peerId", js.undefined)
  }
}
