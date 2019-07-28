package typings.inversify.dtsAnnotationInjectMod

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Abstract
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Newable
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/annotation/inject", "LazyServiceIdentifer")
@js.native
class LazyServiceIdentifer[T] protected () extends js.Object {
  def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
  var _cb: js.Any = js.native
  def unwrap(): String | js.Symbol | Newable[T] | Abstract[T] = js.native
}

