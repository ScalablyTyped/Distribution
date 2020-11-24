package typings.guacamoleClient.tunnelMod.Tunnel

import typings.guacamoleClient.guacamoleClientNumbers.`0`
import typings.guacamoleClient.guacamoleClientNumbers.`1`
import typings.guacamoleClient.guacamoleClientNumbers.`2`
import typings.guacamoleClient.guacamoleClientNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  CONNECTING :0,   OPEN :1,   CLOSED :2,   UNSTABLE :3}> */
@js.native
trait TunnelState extends js.Object {
  
  val CLOSED: `2` = js.native
  
  val CONNECTING: `0` = js.native
  
  val OPEN: `1` = js.native
  
  val UNSTABLE: `3` = js.native
}
object TunnelState {
  
  @scala.inline
  def apply(CLOSED: `2`, CONNECTING: `0`, OPEN: `1`, UNSTABLE: `3`): TunnelState = {
    val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], UNSTABLE = UNSTABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TunnelState]
  }
  
  @scala.inline
  implicit class TunnelStateOps[Self <: TunnelState] (val x: Self) extends AnyVal {
    
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
    def setCLOSED(value: `2`): Self = this.set("CLOSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONNECTING(value: `0`): Self = this.set("CONNECTING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPEN(value: `1`): Self = this.set("OPEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNSTABLE(value: `3`): Self = this.set("UNSTABLE", value.asInstanceOf[js.Any])
  }
}
