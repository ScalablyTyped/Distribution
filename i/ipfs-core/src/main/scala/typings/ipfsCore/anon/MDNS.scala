package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDNS extends js.Object {
  
  var MDNS: Interval = js.native
  
  var webRTCStar: EnabledBoolean = js.native
}
object MDNS {
  
  @scala.inline
  def apply(MDNS: Interval, webRTCStar: EnabledBoolean): MDNS = {
    val __obj = js.Dynamic.literal(MDNS = MDNS.asInstanceOf[js.Any], webRTCStar = webRTCStar.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDNS]
  }
  
  @scala.inline
  implicit class MDNSOps[Self <: MDNS] (val x: Self) extends AnyVal {
    
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
    def setMDNS(value: Interval): Self = this.set("MDNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRTCStar(value: EnabledBoolean): Self = this.set("webRTCStar", value.asInstanceOf[js.Any])
  }
}
