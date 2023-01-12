package typings.materializeCss.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pushpin
  extends StObject
     with Component[PushpinOptions] {
  
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double
}
object Pushpin {
  
  inline def apply(destroy: () => Unit, el: Element, options: PushpinOptions, originalOffset: Double): Pushpin = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalOffset = originalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pushpin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pushpin] (val x: Self) extends AnyVal {
    
    inline def setOriginalOffset(value: Double): Self = StObject.set(x, "originalOffset", value.asInstanceOf[js.Any])
  }
}
