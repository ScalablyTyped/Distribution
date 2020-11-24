package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Arch
import typings.iobroker.anon.Cpus
import typings.iobroker.anon.Env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostNative extends js.Object {
  
  var hardware: Cpus = js.native
  
  var os: Arch = js.native
  
  var process: Env = js.native
}
object HostNative {
  
  @scala.inline
  def apply(hardware: Cpus, os: Arch, process: Env): HostNative = {
    val __obj = js.Dynamic.literal(hardware = hardware.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostNative]
  }
  
  @scala.inline
  implicit class HostNativeOps[Self <: HostNative] (val x: Self) extends AnyVal {
    
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
    def setHardware(value: Cpus): Self = this.set("hardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: Arch): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: Env): Self = this.set("process", value.asInstanceOf[js.Any])
  }
}
