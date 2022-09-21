package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncContainerModule
  extends StObject
     with ContainerModuleBase {
  
  var registry: AsyncContainerModuleCallBack
}
object AsyncContainerModule {
  
  inline def apply(id: Double, registry: /* args */ Any => js.Promise[Any]): AsyncContainerModule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registry = js.Any.fromFunction1(registry))
    __obj.asInstanceOf[AsyncContainerModule]
  }
  
  extension [Self <: AsyncContainerModule](x: Self) {
    
    inline def setRegistry(value: /* args */ Any => js.Promise[Any]): Self = StObject.set(x, "registry", js.Any.fromFunction1(value))
  }
}
