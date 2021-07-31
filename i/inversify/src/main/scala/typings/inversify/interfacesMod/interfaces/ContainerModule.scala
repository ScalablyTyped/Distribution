package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerModule extends StObject {
  
  var id: Double
  
  def registry(bind: Bind, unbind: Unbind, isBound: IsBound, rebind: Rebind): Unit
  @JSName("registry")
  var registry_Original: ContainerModuleCallBack
}
object ContainerModule {
  
  @scala.inline
  def apply(
    id: Double,
    registry: (/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind) => Unit
  ): ContainerModule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registry = js.Any.fromFunction4(registry))
    __obj.asInstanceOf[ContainerModule]
  }
  
  @scala.inline
  implicit class ContainerModuleMutableBuilder[Self <: ContainerModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistry(value: (/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind) => Unit): Self = StObject.set(x, "registry", js.Any.fromFunction4(value))
  }
}
