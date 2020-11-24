package typings.keepNetworkTbtcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MAINNET extends js.Object {
  
  var MAINNET: String = js.native
  
  var SIMNET: String = js.native
  
  var TESTNET: String = js.native
}
object MAINNET {
  
  @scala.inline
  def apply(MAINNET: String, SIMNET: String, TESTNET: String): MAINNET = {
    val __obj = js.Dynamic.literal(MAINNET = MAINNET.asInstanceOf[js.Any], SIMNET = SIMNET.asInstanceOf[js.Any], TESTNET = TESTNET.asInstanceOf[js.Any])
    __obj.asInstanceOf[MAINNET]
  }
  
  @scala.inline
  implicit class MAINNETOps[Self <: MAINNET] (val x: Self) extends AnyVal {
    
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
    def setMAINNET(value: String): Self = this.set("MAINNET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIMNET(value: String): Self = this.set("SIMNET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTESTNET(value: String): Self = this.set("TESTNET", value.asInstanceOf[js.Any])
  }
}
