package typings.ionicons.distTypesStencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentWillLoad extends StObject {
  
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  def componentWillLoad(): js.Promise[Unit] | Unit
}
object ComponentWillLoad {
  
  inline def apply(componentWillLoad: () => js.Promise[Unit] | Unit): ComponentWillLoad = {
    val __obj = js.Dynamic.literal(componentWillLoad = js.Any.fromFunction0(componentWillLoad))
    __obj.asInstanceOf[ComponentWillLoad]
  }
  
  extension [Self <: ComponentWillLoad](x: Self) {
    
    inline def setComponentWillLoad(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "componentWillLoad", js.Any.fromFunction0(value))
  }
}
