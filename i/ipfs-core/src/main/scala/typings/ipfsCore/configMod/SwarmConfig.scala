package typings.ipfsCore.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwarmConfig extends js.Object {
  
  var ConnMgr: js.UndefOr[ConnMgrConfig] = js.native
}
object SwarmConfig {
  
  @scala.inline
  def apply(): SwarmConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwarmConfig]
  }
  
  @scala.inline
  implicit class SwarmConfigOps[Self <: SwarmConfig] (val x: Self) extends AnyVal {
    
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
    def setConnMgr(value: ConnMgrConfig): Self = this.set("ConnMgr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnMgr: Self = this.set("ConnMgr", js.undefined)
  }
}
