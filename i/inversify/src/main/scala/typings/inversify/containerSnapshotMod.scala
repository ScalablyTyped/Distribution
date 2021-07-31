package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Lookup
import typings.inversify.interfacesMod.interfaces.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerSnapshotMod {
  
  @JSImport("inversify/dts/container/container_snapshot", "ContainerSnapshot")
  @js.native
  class ContainerSnapshot ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.ContainerSnapshot {
    
    /* CompleteClass */
    var bindings: Lookup[Binding[js.Any]] = js.native
    
    /* CompleteClass */
    var middleware: Next | Null = js.native
  }
  object ContainerSnapshot {
    
    @JSImport("inversify/dts/container/container_snapshot", "ContainerSnapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def of(bindings: Lookup[Binding[js.Any]]): ContainerSnapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(bindings.asInstanceOf[js.Any]).asInstanceOf[ContainerSnapshot]
    @scala.inline
    def of(bindings: Lookup[Binding[js.Any]], middleware: Next): ContainerSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(bindings.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[ContainerSnapshot]
  }
}
