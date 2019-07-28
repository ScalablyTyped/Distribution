package typings.inversify.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerSnapshot extends js.Object {
  var bindings: Lookup[Binding[_]]
  var middleware: Next | Null
}

object ContainerSnapshot {
  @scala.inline
  def apply(bindings: Lookup[Binding[_]], middleware: Next = null): ContainerSnapshot = {
    val __obj = js.Dynamic.literal(bindings = bindings)
    if (middleware != null) __obj.updateDynamic("middleware")(middleware)
    __obj.asInstanceOf[ContainerSnapshot]
  }
}

