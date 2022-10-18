package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[TOptions]
  extends StObject
     with ComponentBase[TOptions] {
  
  /**
    * Destroy plugin instance and teardown
    */
  def destroy(): Unit
}
object Component {
  
  inline def apply[TOptions](destroy: () => Unit, el: Element, options: TOptions): Component[TOptions] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[TOptions]]
  }
  
  extension [Self <: Component[?], TOptions](x: Self & Component[TOptions]) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
