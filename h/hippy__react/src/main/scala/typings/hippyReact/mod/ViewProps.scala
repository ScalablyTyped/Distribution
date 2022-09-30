package typings.hippyReact.mod

import typings.hippyReact.hippyReactBooleans.`false`
import typings.hippyReact.hippyReactStrings.hidden
import typings.hippyReact.hippyReactStrings.visible
import typings.react.mod.ReactNode
import typings.reactReconciler.mod.Fiber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the element.
    * By default, the label is constructed by traversing all the children and accumulating
    * all the Text nodes separated by space.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * When `true`, indicates that the view is an accessibility element.
    * By default, all the touchable elements are accessible.
    */
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Views that are only used to layout their children or otherwise don't draw anything may be
    * automatically removed from the native hierarchy as an optimization.
    * Set this property to `false` to disable this optimization
    * and ensure that this `View` exists in the native view hierarchy.
    */
  var collapsable: js.UndefOr[`false`] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var nextFocusDownId: js.UndefOr[String | Fiber] = js.undefined
  
  var nextFocusLeftId: js.UndefOr[String | Fiber] = js.undefined
  
  var nextFocusRightId: js.UndefOr[String | Fiber] = js.undefined
  
  var nextFocusUpId: js.UndefOr[String | Fiber] = js.undefined
  
  /**
    * The focus event occurs when the component is focused.
    *
    * @param {Object} evt - Focus event data
    * @param {boolean} evt.focus - Focus status
    */
  var onFocus: js.UndefOr[js.Function1[/* evt */ FocusEvent, Unit]] = js.undefined
  
  /**
    * Specifies what should happen if content overflows an container's box.
    *
    * Default: iOS is 'visible', android is 'hidden'.
    */
  var overflow: js.UndefOr[visible | hidden] = js.undefined
  
  var requestFocus: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
}
object ViewProps {
  
  inline def apply(): ViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProps]
  }
  
  extension [Self <: ViewProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCollapsable(value: `false`): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setNextFocusDownId(value: String | Fiber): Self = StObject.set(x, "nextFocusDownId", value.asInstanceOf[js.Any])
    
    inline def setNextFocusDownIdUndefined: Self = StObject.set(x, "nextFocusDownId", js.undefined)
    
    inline def setNextFocusLeftId(value: String | Fiber): Self = StObject.set(x, "nextFocusLeftId", value.asInstanceOf[js.Any])
    
    inline def setNextFocusLeftIdUndefined: Self = StObject.set(x, "nextFocusLeftId", js.undefined)
    
    inline def setNextFocusRightId(value: String | Fiber): Self = StObject.set(x, "nextFocusRightId", value.asInstanceOf[js.Any])
    
    inline def setNextFocusRightIdUndefined: Self = StObject.set(x, "nextFocusRightId", js.undefined)
    
    inline def setNextFocusUpId(value: String | Fiber): Self = StObject.set(x, "nextFocusUpId", value.asInstanceOf[js.Any])
    
    inline def setNextFocusUpIdUndefined: Self = StObject.set(x, "nextFocusUpId", js.undefined)
    
    inline def setOnFocus(value: /* evt */ FocusEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOverflow(value: visible | hidden): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setRequestFocus(value: Boolean): Self = StObject.set(x, "requestFocus", value.asInstanceOf[js.Any])
    
    inline def setRequestFocusUndefined: Self = StObject.set(x, "requestFocus", js.undefined)
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
