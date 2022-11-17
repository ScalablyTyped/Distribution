package typings.jquery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete[TElement] extends StObject {
  
  /**
    * A function to call once the animation is complete.
    */
  def complete(): Unit
}
object Complete {
  
  inline def apply[TElement](complete: () => Unit): Complete[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[Complete[TElement]]
  }
  
  extension [Self <: Complete[?], TElement](x: Self & Complete[TElement]) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
