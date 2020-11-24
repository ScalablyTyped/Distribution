package typings.iobroker.anon

import typings.node.NodeJS.Dict
import typings.node.osMod.CpuInfo
import typings.node.osMod.NetworkInterfaceInfo
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cpus extends js.Object {
  
  var cpus: ReturnType[js.Function0[js.Array[CpuInfo]]] = js.native
  
  var networkInterfaces: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]] = js.native
  
  var totalmem: ReturnType[js.Function0[Double]] = js.native
}
object Cpus {
  
  @scala.inline
  def apply(
    cpus: ReturnType[js.Function0[js.Array[CpuInfo]]],
    networkInterfaces: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]],
    totalmem: ReturnType[js.Function0[Double]]
  ): Cpus = {
    val __obj = js.Dynamic.literal(cpus = cpus.asInstanceOf[js.Any], networkInterfaces = networkInterfaces.asInstanceOf[js.Any], totalmem = totalmem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpus]
  }
  
  @scala.inline
  implicit class CpusOps[Self <: Cpus] (val x: Self) extends AnyVal {
    
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
    def setCpus(value: ReturnType[js.Function0[js.Array[CpuInfo]]]): Self = this.set("cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaces(value: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]]): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalmem(value: ReturnType[js.Function0[Double]]): Self = this.set("totalmem", value.asInstanceOf[js.Any])
  }
}
