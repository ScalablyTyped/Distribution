package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def componentWillLoad(): js.Promise[Unit] | Unit = js.native
}
object ComponentWillLoad {
  
  @scala.inline
  def apply(componentWillLoad: () => js.Promise[Unit] | Unit): ComponentWillLoad = {
    val __obj = js.Dynamic.literal(componentWillLoad = js.Any.fromFunction0(componentWillLoad))
    __obj.asInstanceOf[ComponentWillLoad]
  }
  
  @scala.inline
  implicit class ComponentWillLoadMutableBuilder[Self <: ComponentWillLoad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentWillLoad(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "componentWillLoad", js.Any.fromFunction0(value))
  }
}
