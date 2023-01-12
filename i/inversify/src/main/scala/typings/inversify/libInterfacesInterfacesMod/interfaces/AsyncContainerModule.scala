package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncContainerModule
  extends StObject
     with ContainerModuleBase {
  
  var registry: AsyncContainerModuleCallBack
}
object AsyncContainerModule {
  
  inline def apply(id: Double, registry: AsyncContainerModuleCallBack): AsyncContainerModule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncContainerModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncContainerModule] (val x: Self) extends AnyVal {
    
    inline def setRegistry(value: AsyncContainerModuleCallBack): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
  }
}
