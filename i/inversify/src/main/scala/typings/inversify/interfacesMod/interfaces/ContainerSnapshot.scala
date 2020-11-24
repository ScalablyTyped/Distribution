package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerSnapshot extends js.Object {
  
  var bindings: Lookup[Binding[_]] = js.native
  
  var middleware: Next | Null = js.native
}
object ContainerSnapshot {
  
  @scala.inline
  def apply(bindings: Lookup[Binding[_]]): ContainerSnapshot = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSnapshot]
  }
  
  @scala.inline
  implicit class ContainerSnapshotOps[Self <: ContainerSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindings(value: Lookup[Binding[_]]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleware(value: /* args */ NextArgs => js.Any | js.Array[js.Any]): Self = this.set("middleware", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMiddlewareNull: Self = this.set("middleware", null)
  }
}
