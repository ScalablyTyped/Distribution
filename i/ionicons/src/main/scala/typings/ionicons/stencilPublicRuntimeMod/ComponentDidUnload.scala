package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDidUnload extends StObject {
  
  /**
    * The component did unload and the element
    * will be destroyed.
    */
  def componentDidUnload(): Unit
}
object ComponentDidUnload {
  
  inline def apply(componentDidUnload: () => Unit): ComponentDidUnload = {
    val __obj = js.Dynamic.literal(componentDidUnload = js.Any.fromFunction0(componentDidUnload))
    __obj.asInstanceOf[ComponentDidUnload]
  }
  
  extension [Self <: ComponentDidUnload](x: Self) {
    
    inline def setComponentDidUnload(value: () => Unit): Self = StObject.set(x, "componentDidUnload", js.Any.fromFunction0(value))
  }
}
