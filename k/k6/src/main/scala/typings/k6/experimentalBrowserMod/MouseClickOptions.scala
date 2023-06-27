package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseClickOptions
  extends StObject
     with EventSequenceOptions {
  
  /**
    * The mouse button to use during the action.
    * Defaults to `left`.
    */
  var button: js.UndefOr[MouseButton] = js.undefined
}
object MouseClickOptions {
  
  inline def apply(): MouseClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseClickOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseClickOptions] (val x: Self) extends AnyVal {
    
    inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
  }
}
