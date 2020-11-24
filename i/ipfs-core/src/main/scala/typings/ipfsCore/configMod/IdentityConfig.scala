package typings.ipfsCore.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityConfig extends js.Object {
  
  var PeerID: js.UndefOr[String] = js.native
  
  var PrivKey: js.UndefOr[String] = js.native
}
object IdentityConfig {
  
  @scala.inline
  def apply(): IdentityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityConfig]
  }
  
  @scala.inline
  implicit class IdentityConfigOps[Self <: IdentityConfig] (val x: Self) extends AnyVal {
    
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
    def setPeerID(value: String): Self = this.set("PeerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerID: Self = this.set("PeerID", js.undefined)
    
    @scala.inline
    def setPrivKey(value: String): Self = this.set("PrivKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivKey: Self = this.set("PrivKey", js.undefined)
  }
}
