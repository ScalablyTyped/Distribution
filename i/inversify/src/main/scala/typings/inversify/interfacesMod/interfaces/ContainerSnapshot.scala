package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerSnapshot extends js.Object {
  var bindings: Lookup[Binding[_]]
  var middleware: Next | Null
}

object ContainerSnapshot {
  @scala.inline
  def apply(bindings: Lookup[Binding[_]], middleware: /* args */ NextArgs => js.Any | js.Array[js.Any] = null): ContainerSnapshot = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], middleware = js.Any.fromFunction1(middleware))
    __obj.asInstanceOf[ContainerSnapshot]
  }
}

