package typings.jquery.anon

import typings.jquery.JQuery._SpeedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complete[TElement] extends _SpeedSettings[TElement] {
  
  /**
    * A function to call once the animation is complete.
    */
  def complete(): Unit = js.native
}
object Complete {
  
  @scala.inline
  def apply[TElement](complete: () => Unit): Complete[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[Complete[TElement]]
  }
  
  @scala.inline
  implicit class CompleteMutableBuilder[Self <: Complete[_], TElement] (val x: Self with Complete[TElement]) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
