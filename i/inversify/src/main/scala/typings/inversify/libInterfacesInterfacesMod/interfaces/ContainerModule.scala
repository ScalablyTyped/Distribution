package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerModule
  extends StObject
     with ContainerModuleBase {
  
  def registry(
    bind: Bind,
    unbind: Unbind,
    isBound: IsBound,
    rebind: Rebind,
    unbindAsync: UnbindAsync,
    onActivation: js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onActivation */ BindingActivation[Any], 
      Unit
    ],
    onDeactivation: js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onDeactivation */ BindingDeactivation[Any], 
      Unit
    ]
  ): Unit
  @JSName("registry")
  var registry_Original: ContainerModuleCallBack
}
object ContainerModule {
  
  inline def apply(
    id: Double,
    registry: (/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind, /* unbindAsync */ UnbindAsync, /* onActivation */ js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onActivation */ BindingActivation[Any], 
      Unit
    ], /* onDeactivation */ js.Function2[
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      /* onDeactivation */ BindingDeactivation[Any], 
      Unit
    ]) => Unit
  ): ContainerModule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registry = js.Any.fromFunction7(registry))
    __obj.asInstanceOf[ContainerModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerModule] (val x: Self) extends AnyVal {
    
    inline def setRegistry(
      value: (/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind, /* unbindAsync */ UnbindAsync, /* onActivation */ js.Function2[
          /* serviceIdentifier */ ServiceIdentifier[Any], 
          /* onActivation */ BindingActivation[Any], 
          Unit
        ], /* onDeactivation */ js.Function2[
          /* serviceIdentifier */ ServiceIdentifier[Any], 
          /* onDeactivation */ BindingDeactivation[Any], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "registry", js.Any.fromFunction7(value))
  }
}
