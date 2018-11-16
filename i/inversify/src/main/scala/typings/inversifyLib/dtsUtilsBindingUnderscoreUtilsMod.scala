package typings
package inversifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/utils/binding_utils", JSImport.Namespace)
@js.native
object dtsUtilsBindingUnderscoreUtilsMod extends js.Object {
  val multiBindToService: js.Function1[
    /* container */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, 
    js.Function1[
      /* service */ java.lang.String | js.Symbol | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Newable[js.Any] | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Abstract[js.Any], 
      js.Function1[
        /* repeated */java.lang.String | js.Symbol | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Newable[js.Any] | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Abstract[js.Any], 
        scala.Unit
      ]
    ]
  ] = js.native
}

