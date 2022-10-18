package typings.iobroker.anon

import typings.node.NodeJS.Dict
import typings.node.osMod.CpuInfo
import typings.node.osMod.NetworkInterfaceInfo
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cpus extends StObject {
  
  var cpus: ReturnType[js.Function0[js.Array[CpuInfo]]]
  
  var networkInterfaces: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]]
  
  var totalmem: ReturnType[js.Function0[Double]]
}
object Cpus {
  
  inline def apply(
    cpus: ReturnType[js.Function0[js.Array[CpuInfo]]],
    networkInterfaces: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]],
    totalmem: ReturnType[js.Function0[Double]]
  ): Cpus = {
    val __obj = js.Dynamic.literal(cpus = cpus.asInstanceOf[js.Any], networkInterfaces = networkInterfaces.asInstanceOf[js.Any], totalmem = totalmem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpus]
  }
  
  extension [Self <: Cpus](x: Self) {
    
    inline def setCpus(value: ReturnType[js.Function0[js.Array[CpuInfo]]]): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaces(value: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setTotalmem(value: ReturnType[js.Function0[Double]]): Self = StObject.set(x, "totalmem", value.asInstanceOf[js.Any])
  }
}
