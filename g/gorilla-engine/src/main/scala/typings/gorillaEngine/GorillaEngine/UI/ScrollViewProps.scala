package typings.gorillaEngine.GorillaEngine.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollViewProps
  extends StObject
     with Common
     with Bounds
     with Scrollable {
  
  var hideHorizontalScrollbar: Boolean
  
  var hideVerticalScrollbar: Boolean
  
  var scrollbarThickness: Double
}
object ScrollViewProps {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    clickGrabsKeyboardFocus: Boolean,
    enabled: Boolean,
    height: Double,
    hideHorizontalScrollbar: Boolean,
    hideVerticalScrollbar: Boolean,
    id: String,
    scrollbarThickness: Double,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): ScrollViewProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideHorizontalScrollbar = hideHorizontalScrollbar.asInstanceOf[js.Any], hideVerticalScrollbar = hideVerticalScrollbar.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scrollbarThickness = scrollbarThickness.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollViewProps] (val x: Self) extends AnyVal {
    
    inline def setHideHorizontalScrollbar(value: Boolean): Self = StObject.set(x, "hideHorizontalScrollbar", value.asInstanceOf[js.Any])
    
    inline def setHideVerticalScrollbar(value: Boolean): Self = StObject.set(x, "hideVerticalScrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarThickness(value: Double): Self = StObject.set(x, "scrollbarThickness", value.asInstanceOf[js.Any])
  }
}
