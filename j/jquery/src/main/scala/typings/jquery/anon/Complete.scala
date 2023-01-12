package typings.jquery.anon

import typings.jquery.JQuery._SpeedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete[TElement]
  extends StObject
     with _SpeedSettings[TElement] {
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Complete[?], TElement] (val x: Self & Complete[TElement]) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
