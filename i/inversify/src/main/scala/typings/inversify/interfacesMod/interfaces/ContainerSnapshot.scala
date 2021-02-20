package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerSnapshot extends StObject {
  
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
  implicit class ContainerSnapshotMutableBuilder[Self <: ContainerSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: Lookup[Binding[_]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleware(value: /* args */ NextArgs => js.Any | js.Array[js.Any]): Self = StObject.set(x, "middleware", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMiddlewareNull: Self = StObject.set(x, "middleware", null)
  }
}
