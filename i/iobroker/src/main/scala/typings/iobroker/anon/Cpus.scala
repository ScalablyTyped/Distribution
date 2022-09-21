package typings.iobroker.anon

import typings.node.osMod.CpuInfo
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cpus extends StObject {
  
  var cpus: ReturnType[js.Function0[js.Array[CpuInfo]]]
  
  var networkInterfaces: ReturnType[
    js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.Dict<Array<NetworkInterfaceInfo>> */ Any
    ]
  ]
  
  var totalmem: ReturnType[js.Function0[Double]]
}
object Cpus {
  
  inline def apply(
    cpus: ReturnType[js.Function0[js.Array[CpuInfo]]],
    networkInterfaces: ReturnType[
      js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.Dict<Array<NetworkInterfaceInfo>> */ Any
      ]
    ],
    totalmem: ReturnType[js.Function0[Double]]
  ): Cpus = {
    val __obj = js.Dynamic.literal(cpus = cpus.asInstanceOf[js.Any], networkInterfaces = networkInterfaces.asInstanceOf[js.Any], totalmem = totalmem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpus]
  }
  
  extension [Self <: Cpus](x: Self) {
    
    inline def setCpus(value: ReturnType[js.Function0[js.Array[CpuInfo]]]): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaces(
      value: ReturnType[
          js.Function0[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.Dict<Array<NetworkInterfaceInfo>> */ Any
          ]
        ]
    ): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setTotalmem(value: ReturnType[js.Function0[Double]]): Self = StObject.set(x, "totalmem", value.asInstanceOf[js.Any])
  }
}
