package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.HostNative> */
@js.native
trait PartialHostNative extends js.Object {
  
  var hardware: js.UndefOr[Cpus] = js.native
  
  var os: js.UndefOr[Arch] = js.native
  
  var process: js.UndefOr[Env] = js.native
}
object PartialHostNative {
  
  @scala.inline
  def apply(): PartialHostNative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHostNative]
  }
  
  @scala.inline
  implicit class PartialHostNativeOps[Self <: PartialHostNative] (val x: Self) extends AnyVal {
    
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
    def deleteHardware: Self = this.set("hardware", js.undefined)
    
    @scala.inline
    def setOs(value: Arch): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setProcess(value: Env): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
  }
}
