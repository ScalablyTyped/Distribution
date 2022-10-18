package typings.ionicons.distTypesStencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDidUpdate extends StObject {
  
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  def componentDidUpdate(): Unit
}
object ComponentDidUpdate {
  
  inline def apply(componentDidUpdate: () => Unit): ComponentDidUpdate = {
    val __obj = js.Dynamic.literal(componentDidUpdate = js.Any.fromFunction0(componentDidUpdate))
    __obj.asInstanceOf[ComponentDidUpdate]
  }
  
  extension [Self <: ComponentDidUpdate](x: Self) {
    
    inline def setComponentDidUpdate(value: () => Unit): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction0(value))
  }
}
