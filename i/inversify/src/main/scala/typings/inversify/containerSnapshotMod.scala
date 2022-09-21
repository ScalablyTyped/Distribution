package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.BindingActivation
import typings.inversify.interfacesMod.interfaces.BindingDeactivation
import typings.inversify.interfacesMod.interfaces.Lookup
import typings.inversify.interfacesMod.interfaces.ModuleActivationStore
import typings.inversify.interfacesMod.interfaces.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerSnapshotMod {
  
  @JSImport("inversify/lib/container/container_snapshot", "ContainerSnapshot")
  @js.native
  open class ContainerSnapshot ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.ContainerSnapshot {
    
    /* CompleteClass */
    var activations: Lookup[BindingActivation[Any]] = js.native
    
    /* CompleteClass */
    var bindings: Lookup[Binding[Any]] = js.native
    
    /* CompleteClass */
    var deactivations: Lookup[BindingDeactivation[Any]] = js.native
    
    /* CompleteClass */
    var middleware: Next | Null = js.native
    
    /* CompleteClass */
    var moduleActivationStore: ModuleActivationStore = js.native
  }
  object ContainerSnapshot {
    
    @JSImport("inversify/lib/container/container_snapshot", "ContainerSnapshot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def of(
      bindings: Lookup[Binding[Any]],
      middleware: Null,
      activations: Lookup[BindingActivation[Any]],
      deactivations: Lookup[BindingDeactivation[Any]],
      moduleActivationStore: ModuleActivationStore
    ): ContainerSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(bindings.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any], activations.asInstanceOf[js.Any], deactivations.asInstanceOf[js.Any], moduleActivationStore.asInstanceOf[js.Any])).asInstanceOf[ContainerSnapshot]
    /* static member */
    inline def of(
      bindings: Lookup[Binding[Any]],
      middleware: Next,
      activations: Lookup[BindingActivation[Any]],
      deactivations: Lookup[BindingDeactivation[Any]],
      moduleActivationStore: ModuleActivationStore
    ): ContainerSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(bindings.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any], activations.asInstanceOf[js.Any], deactivations.asInstanceOf[js.Any], moduleActivationStore.asInstanceOf[js.Any])).asInstanceOf[ContainerSnapshot]
  }
}
