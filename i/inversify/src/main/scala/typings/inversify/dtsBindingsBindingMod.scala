package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingScope
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/bindings/binding", JSImport.Namespace)
@js.native
object dtsBindingsBindingMod extends js.Object {
  @js.native
  class Binding[T] protected ()
    extends typings.inversify.dtsInterfacesInterfacesMod.interfaces.Binding[T] {
    def this(serviceIdentifier: ServiceIdentifier[T], scope: BindingScope) = this()
  }
  
}

