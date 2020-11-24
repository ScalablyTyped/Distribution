package typings.ipfsCore.componentsVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends js.Object {
  
  var commit: js.UndefOr[String] = js.native
  
  var `interface-ipfs-core`: js.UndefOr[String] = js.native
  
  var `ipfs-http-client`: js.UndefOr[String] = js.native
  
  var repo: String = js.native
  
  var version: String = js.native
}
object Version {
  
  @scala.inline
  def apply(repo: String, version: String): Version = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    
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
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    
    @scala.inline
    def `setInterface-ipfs-core`(value: String): Self = this.set("interface-ipfs-core", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteInterface-ipfs-core`: Self = this.set("interface-ipfs-core", js.undefined)
    
    @scala.inline
    def `setIpfs-http-client`(value: String): Self = this.set("ipfs-http-client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIpfs-http-client`: Self = this.set("ipfs-http-client", js.undefined)
  }
}
