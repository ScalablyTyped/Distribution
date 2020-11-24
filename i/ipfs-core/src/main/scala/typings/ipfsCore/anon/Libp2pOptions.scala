package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Libp2pOptions extends js.Object {
  
  var libp2p: js.Any = js.native
  
  var options: js.Any = js.native
  
  var peerId: js.Any = js.native
  
  var repo: js.Any = js.native
}
object Libp2pOptions {
  
  @scala.inline
  def apply(libp2p: js.Any, options: js.Any, peerId: js.Any, repo: js.Any): Libp2pOptions = {
    val __obj = js.Dynamic.literal(libp2p = libp2p.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Libp2pOptions]
  }
  
  @scala.inline
  implicit class Libp2pOptionsOps[Self <: Libp2pOptions] (val x: Self) extends AnyVal {
    
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
    def setLibp2p(value: js.Any): Self = this.set("libp2p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: js.Any): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: js.Any): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
