package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Arch
import typings.iobroker.anon.Cpus
import typings.iobroker.anon.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostNative extends StObject {
  
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
  implicit class HostNativeMutableBuilder[Self <: HostNative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHardware(value: Cpus): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: Arch): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: Env): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
  }
}
