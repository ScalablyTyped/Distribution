package typings.ipfsCore.anon

import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var config: js.UndefOr[js.Any] = js.native
  
  var keychainConfig: js.UndefOr[Pass] = js.native
  
  var multiaddrs: js.UndefOr[js.Array[String]] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var peerId: js.UndefOr[^] = js.native
  
  var repo: js.Any = js.native
}
object Config {
  
  @scala.inline
  def apply(repo: js.Any): Config = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setRepo(value: js.Any): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
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
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPeerId(value: ^): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerId: Self = this.set("peerId", js.undefined)
  }
}
