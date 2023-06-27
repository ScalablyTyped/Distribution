package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseDownUpOptions extends StObject {
  
  /**
    * The mouse button to use during the action.
    * Defaults to `left`.
    */
  var button: js.UndefOr[MouseButton] = js.undefined
  
  /**
    * Defaults to 1.
    */
  var clickCount: js.UndefOr[Double] = js.undefined
}
object MouseDownUpOptions {
  
  inline def apply(): MouseDownUpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseDownUpOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseDownUpOptions] (val x: Self) extends AnyVal {
    
    inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
  }
}
