package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined k6.k6/experimental/browser.MouseClickOptions & {  clickCount :number | undefined} */
trait MouseMultiClickOptions extends StObject {
  
  /**
    * The mouse button to use during the action.
    * Defaults to `left`.
    */
  var button: js.UndefOr[MouseButton] = js.undefined
  
  /**
    * The number of times the action is performed.
    * Defaults to 1.
    */
  var clickCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Delay between events in milliseconds. Defaults to 0.
    */
  var delay: js.UndefOr[Double] = js.undefined
}
object MouseMultiClickOptions {
  
  inline def apply(): MouseMultiClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseMultiClickOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseMultiClickOptions] (val x: Self) extends AnyVal {
    
    inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
