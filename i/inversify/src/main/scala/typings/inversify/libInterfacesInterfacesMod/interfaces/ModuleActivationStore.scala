package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleActivationStore
  extends StObject
     with Clonable[ModuleActivationStore] {
  
  def addActivation(moduleId: Double, serviceIdentifier: ServiceIdentifier[Any], onActivation: BindingActivation[Any]): Unit
  
  def addDeactivation(
    moduleId: Double,
    serviceIdentifier: ServiceIdentifier[Any],
    onDeactivation: BindingDeactivation[Any]
  ): Unit
  
  def remove(moduleId: Double): ModuleActivationHandlers
}
object ModuleActivationStore {
  
  inline def apply(
    addActivation: (Double, ServiceIdentifier[Any], BindingActivation[Any]) => Unit,
    addDeactivation: (Double, ServiceIdentifier[Any], BindingDeactivation[Any]) => Unit,
    remove: Double => ModuleActivationHandlers
  ): ModuleActivationStore = {
    val __obj = js.Dynamic.literal(addActivation = js.Any.fromFunction3(addActivation), addDeactivation = js.Any.fromFunction3(addDeactivation), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ModuleActivationStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleActivationStore] (val x: Self) extends AnyVal {
    
    inline def setAddActivation(value: (Double, ServiceIdentifier[Any], BindingActivation[Any]) => Unit): Self = StObject.set(x, "addActivation", js.Any.fromFunction3(value))
    
    inline def setAddDeactivation(value: (Double, ServiceIdentifier[Any], BindingDeactivation[Any]) => Unit): Self = StObject.set(x, "addDeactivation", js.Any.fromFunction3(value))
    
    inline def setRemove(value: Double => ModuleActivationHandlers): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
