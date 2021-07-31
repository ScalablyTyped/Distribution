package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.HostNative> */
trait PartialHostNative extends StObject {
  
  var hardware: js.UndefOr[Cpus] = js.undefined
  
  var os: js.UndefOr[Arch] = js.undefined
  
  var process: js.UndefOr[Env] = js.undefined
}
object PartialHostNative {
  
  @scala.inline
  def apply(): PartialHostNative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHostNative]
  }
  
  @scala.inline
  implicit class PartialHostNativeMutableBuilder[Self <: PartialHostNative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHardware(value: Cpus): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareUndefined: Self = StObject.set(x, "hardware", js.undefined)
    
    @scala.inline
    def setOs(value: Arch): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    @scala.inline
    def setProcess(value: Env): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
  }
}
