package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// type Type = string;
// type Props = any;
// type Container = number;
// type UpdatePayload = any;
// type Context = {};
// type TextInstance = number;
//
// Hippy Event
// ----------------------------------------------------------------------
trait LayoutableProps extends StObject {
  
  var onAttachedToWindow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on mount and layout changes with:
    *
    * `{nativeEvent: { layout: {x, y, width, height}}}`
    *
    * This event is fired immediately once the layout has been calculated,
    * but the new layout may not yet be reflected on the screen
    * at the time the event is received, especially if a layout animation is in progress.
    *
    * @param {Object} evt - Layout event data
    * @param {number} evt.nativeEvent.x - The position X of component
    * @param {number} evt.nativeEvent.y - The position Y of component
    * @param {number} evt.nativeEvent.width - The width of component
    * @param {number} evt.nativeEvent.hegiht - The height of component
    */
  var onLayout: js.UndefOr[js.Function1[/* evt */ LayoutEvent, Unit]] = js.undefined
}
object LayoutableProps {
  
  inline def apply(): LayoutableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutableProps] (val x: Self) extends AnyVal {
    
    inline def setOnAttachedToWindow(value: () => Unit): Self = StObject.set(x, "onAttachedToWindow", js.Any.fromFunction0(value))
    
    inline def setOnAttachedToWindowUndefined: Self = StObject.set(x, "onAttachedToWindow", js.undefined)
    
    inline def setOnLayout(value: /* evt */ LayoutEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
  }
}
