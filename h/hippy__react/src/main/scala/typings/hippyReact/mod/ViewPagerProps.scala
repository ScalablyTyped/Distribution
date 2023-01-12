package typings.hippyReact.mod

import typings.hippyReact.hippyReactStrings.`on-drag`
import typings.hippyReact.hippyReactStrings.interactive
import typings.hippyReact.hippyReactStrings.none
import typings.hippyReact.hippyReactStrings.onDrag
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPagerProps
  extends StObject
     with LayoutableProps {
  
  var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specific initial page after rendering.
    *
    * Default: 0
    */
  var initialPage: js.UndefOr[Double] = js.undefined
  
  /**
    * iOS only
    * https://developer.apple.com/documentation/uikit/uiscrollview/keyboarddismissmode
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag` | interactive | onDrag] = js.undefined
  
  /**
    * Called when the page scroll starts.
    *
    * @param {Object} evt - Page scroll event data.
    * @param {number} evt.position - Page index that will be selected.
    * @param {number} evt.offset - Scroll offset while scrolling.
    */
  var onPageScroll: js.UndefOr[js.Function1[/* evt */ PageScrollEvent, Unit]] = js.undefined
  
  /**
    * Called when the page scroll state changed.
    *
    * @param {string} evt - Page scroll state event data
    * This can be one of the following values:
    *
    * * idle
    * * dragging
    * * settling
    */
  var onPageScrollStateChanged: js.UndefOr[js.Function1[/* evt */ PageScrollState, Unit]] = js.undefined
  
  /**
    * Fires at most once per page is selected
    *
    * @param {Object} evt - Page selected event data.
    * @param {number} evt.position - Page index of selected.
    */
  var onPageSelected: js.UndefOr[js.Function1[/* evt */ PageSelectedEvent, Unit]] = js.undefined
  
  /**
    * When `false`, the view cannot be scrolled via touch interaction.
    *
    * Default: true
    *
    * > Note that the view can always be scrolled by calling setPage.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
}
object ViewPagerProps {
  
  inline def apply(): ViewPagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPagerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewPagerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
    
    inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
    
    inline def setKeyboardDismissMode(value: none | `on-drag` | interactive | onDrag): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setOnPageScroll(value: /* evt */ PageScrollEvent => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    inline def setOnPageScrollStateChanged(value: /* evt */ PageScrollState => Unit): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1(value))
    
    inline def setOnPageScrollStateChangedUndefined: Self = StObject.set(x, "onPageScrollStateChanged", js.undefined)
    
    inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
    
    inline def setOnPageSelected(value: /* evt */ PageSelectedEvent => Unit): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1(value))
    
    inline def setOnPageSelectedUndefined: Self = StObject.set(x, "onPageSelected", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
