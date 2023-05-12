package typings.gorillaEngine.GorillaEngine.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.ScrollViewProps because var conflicts: id. Inlined scrollbarThickness, hideVerticalScrollbar, hideHorizontalScrollbar */ trait ScrollView
  extends StObject
     with Component
     with Bounds
     with Scrollable {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var clickGrabsKeyboardFocus: Boolean
  
  var enabled: Boolean
  
  var hideHorizontalScrollbar: Boolean
  
  var hideVerticalScrollbar: Boolean
  
  var scrollbarThickness: Double
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object ScrollView {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    appendChild: Component => Unit,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    enabled: Boolean,
    height: Double,
    hideHorizontalScrollbar: Boolean,
    hideVerticalScrollbar: Boolean,
    id: String,
    insertBefore: (Component, Component) => Unit,
    on: (String, Any) => Unit,
    parent: Component,
    removeChild: Component => Unit,
    scrollbarThickness: Double,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): ScrollView = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideHorizontalScrollbar = hideHorizontalScrollbar.asInstanceOf[js.Any], hideVerticalScrollbar = hideVerticalScrollbar.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), on = js.Any.fromFunction2(on), parent = parent.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), scrollbarThickness = scrollbarThickness.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollView] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHideHorizontalScrollbar(value: Boolean): Self = StObject.set(x, "hideHorizontalScrollbar", value.asInstanceOf[js.Any])
    
    inline def setHideVerticalScrollbar(value: Boolean): Self = StObject.set(x, "hideVerticalScrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarThickness(value: Double): Self = StObject.set(x, "scrollbarThickness", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
