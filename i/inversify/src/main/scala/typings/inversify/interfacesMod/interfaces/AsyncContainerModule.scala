package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncContainerModule extends StObject {
  
  var id: Double
  
  def registry(bind: Bind, unbind: Unbind, isBound: IsBound, rebind: Rebind): js.Promise[Unit]
  @JSName("registry")
  var registry_Original: AsyncContainerModuleCallBack
}
object AsyncContainerModule {
  
  inline def apply(
    id: Double,
    registry: (/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind) => js.Promise[Unit]
  ): AsyncContainerModule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registry = js.Any.fromFunction4(registry))
    __obj.asInstanceOf[AsyncContainerModule]
  }
  
  extension [Self <: AsyncContainerModule](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRegistry(
      value: (/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind) => js.Promise[Unit]
    ): Self = StObject.set(x, "registry", js.Any.fromFunction4(value))
  }
}
