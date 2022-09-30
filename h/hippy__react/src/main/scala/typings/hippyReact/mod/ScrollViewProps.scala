package typings.hippyReact.mod

import typings.hippyReact.anon.Bottom
import typings.hippyReact.anon.ContentInset
import typings.hippyReact.hippyReactStrings.`on-drag`
import typings.hippyReact.hippyReactStrings.interactive
import typings.hippyReact.hippyReactStrings.none
import typings.hippyReact.hippyReactStrings.onDrag
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollViewProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  /**
    * iOS only
    */
  var bounces: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * These styles will be applied to the scroll view content container which wraps all
    * of the child views.
    */
  var contentContainerStyle: js.UndefOr[ViewStyleProp] = js.undefined
  
  /**
    * When true, the scroll view's children are arranged horizontally in a row
    * instead of vertically in a column.
    * The default value is `false`.
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * iOS only
    * https://developer.apple.com/documentation/uikit/uiscrollview/keyboarddismissmode
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag` | interactive | onDrag] = js.undefined
  
  /**
    * Called when the momentum scroll starts (scroll which occurs as the ScrollView starts gliding).
    */
  var onMomentumScrollBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the momentum scroll ends (scroll which occurs as the ScrollView glides to a stop).
    */
  var onMomentumScrollEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Fires at most once per frame during scrolling.
    * The frequency of the events can be controlled using the `scrollEventThrottle` prop.
    *
    * @param {Object} evt - Scroll event data.
    * @param {number} evt.contentOffset.x - Offset X of scrolling.
    * @param {number} evt.contentOffset.y - Offset Y of scrolling.
    */
  var onScroll: js.UndefOr[js.Function1[/* evt */ ContentInset, Unit]] = js.undefined
  
  /**
    * Called when the user begins to drag the scroll view.
    */
  var onScrollBeginDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the user stops dragging the scroll view and it either stops or begins to glide.
    */
  var onScrollEndDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * When `true`, the scroll view stops on multiples of the scroll view's size when scrolling.
    * This can be used for horizontal pagination.
    * Default: false
    */
  var pagingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `false`, the view cannot be scrolled via touch interaction.
    * Default: true
    *
    * > Note that the view can always be scrolled by calling scrollTo.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This controls how often the scroll event will be fired while scrolling
    * (as a time interval in ms). A lower number yields better accuracy for code
    * that is tracking the scroll position, but can lead to scroll performance
    * problems due to the volume of information being send over the bridge.
    * You will not notice a difference between values set between 1-16 as the JS run loop
    * is synced to the screen refresh rate. If you do not need precise scroll position tracking,
    * set this value higher to limit the information being sent across the bridge.
    *
    * The default value is zero, which results in the scroll event being sent only once
    * each time the view is scrolled.
    */
  var scrollEventThrottle: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount by which the scroll view indicators are inset from the edges of the scroll view.
    * This should normally be set to the same value as the `contentInset`.
    *
    * Default: {top: 0, right: 0, bottom: 0, left: 0}.
    */
  var scrollIndicatorInsets: js.UndefOr[Bottom] = js.undefined
  
  /**
    * When `true`, shows a horizontal scroll indicator.
    * Default: true
    */
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, shows a vertical scroll indicator.
    * Default: true
    */
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
}
object ScrollViewProps {
  
  inline def apply(): ScrollViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewProps]
  }
  
  extension [Self <: ScrollViewProps](x: Self) {
    
    inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContentContainerStyle(value: ViewStyleProp): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    inline def setContentContainerStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "contentContainerStyle", js.Array(value*))
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setKeyboardDismissMode(value: none | `on-drag` | interactive | onDrag): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setOnMomentumScrollBegin(value: () => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction0(value))
    
    inline def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
    
    inline def setOnMomentumScrollEnd(value: () => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction0(value))
    
    inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    inline def setOnScroll(value: /* evt */ ContentInset => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollBeginDrag(value: () => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction0(value))
    
    inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    inline def setOnScrollEndDrag(value: () => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction0(value))
    
    inline def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
    
    inline def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
    
    inline def setScrollIndicatorInsets(value: Bottom): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
    
    inline def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
    
    inline def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
