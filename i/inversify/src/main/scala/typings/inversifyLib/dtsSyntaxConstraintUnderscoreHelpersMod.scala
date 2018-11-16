package typings
package inversifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/constraint_helpers", JSImport.Namespace)
@js.native
object dtsSyntaxConstraintUnderscoreHelpersMod extends js.Object {
  val namedConstraint: js.Function1[
    /* value */ js.Any, 
    inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction
  ] = js.native
  val taggedConstraint: js.Function1[
    /* key */ stdLib.PropertyKey, 
    js.Function1[
      /* value */ js.Any, 
      inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction
    ]
  ] = js.native
  val traverseAncerstors: js.Function2[
    /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request, 
    /* constraint */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction, 
    scala.Boolean
  ] = js.native
  val typeConstraint: js.Function1[
    /* type */ java.lang.String | js.Function, 
    js.Function1[
      /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request | scala.Null, 
      scala.Boolean
    ]
  ] = js.native
}

