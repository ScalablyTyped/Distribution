package typings
package inversifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/constraint_helpers", JSImport.Namespace)
@js.native
object dtsSyntaxConstraintUnderscoreHelpersMod extends js.Object {
  def namedConstraint(value: js.Any): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction = js.native
  def taggedConstraint(key: stdLib.PropertyKey): js.Function1[
    /* value */ js.Any, 
    inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction
  ] = js.native
  def traverseAncerstors(
    request: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request,
    constraint: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction
  ): scala.Boolean = js.native
  def typeConstraint(`type`: java.lang.String): js.Function1[
    /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request | scala.Null, 
    scala.Boolean
  ] = js.native
  def typeConstraint(`type`: js.Function): js.Function1[
    /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request | scala.Null, 
    scala.Boolean
  ] = js.native
}

