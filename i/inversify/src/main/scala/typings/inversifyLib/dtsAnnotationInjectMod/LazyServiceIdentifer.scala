package typings
package inversifyLib.dtsAnnotationInjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/annotation/inject", "LazyServiceIdentifer")
@js.native
class LazyServiceIdentifer[T] protected () extends js.Object {
  def this(cb: js.Function0[inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T]]) = this()
  var _cb: js.Any = js.native
  def unwrap(): java.lang.String | js.Symbol | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Newable[T] | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Abstract[T] = js.native
}

