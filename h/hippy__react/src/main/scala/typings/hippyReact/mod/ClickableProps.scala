package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickableProps extends StObject {
  
  /**
    * Called when the touch is released.
    */
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the touch with longer than about 1s is released.
    */
  var onLongClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ClickableProps {
  
  inline def apply(): ClickableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickableProps]
  }
  
  extension [Self <: ClickableProps](x: Self) {
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnLongClick(value: () => Unit): Self = StObject.set(x, "onLongClick", js.Any.fromFunction0(value))
    
    inline def setOnLongClickUndefined: Self = StObject.set(x, "onLongClick", js.undefined)
    
    inline def setOnPressIn(value: () => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction0(value))
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressOut(value: () => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction0(value))
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
  }
}
