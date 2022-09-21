package typings.jqueryScrollto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToOptions extends StObject {
  
  /**
    * Which axis must be scrolled, use 'x', 'y', 'xy' or 'yx'.
    */
  var axis: js.UndefOr[String] = js.undefined
  
  /**
    * The OVERALL length of the animation.
    */
  var duration: js.UndefOr[Any] = js.undefined
  
  /**
    * The easing method for the animation.
    */
  var easing: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the margin of the target element will be deducted from the final position.
    */
  var margin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add/deduct from the end position. 
    * One number for both axes or { top:x, left:y }.
    */
  var offset: js.UndefOr[Any] = js.undefined
  
  /**
    * Function to be called after the scrolling ends. 
    */
  var onAfter: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    *  If queuing is activated, this function will be called after the first scrolling ends.
    */
  var onAfterFirst: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Add/deduct the height/width multiplied by 'over'.
    * Can be { top:x, left:y } when using both axes.
    */
  var over: js.UndefOr[Any] = js.undefined
  
  /**
    * If true, and both axis are given.
    * The 2nd axis will only be animated after the first one ends.
    */
  var queue: js.UndefOr[Boolean] = js.undefined
}
object ScrollToOptions {
  
  inline def apply(): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToOptions]
  }
  
  extension [Self <: ScrollToOptions](x: Self) {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setDuration(value: Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setMargin(value: Boolean): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnAfter(value: () => Unit): Self = StObject.set(x, "onAfter", js.Any.fromFunction0(value))
    
    inline def setOnAfterFirst(value: () => Unit): Self = StObject.set(x, "onAfterFirst", js.Any.fromFunction0(value))
    
    inline def setOnAfterFirstUndefined: Self = StObject.set(x, "onAfterFirst", js.undefined)
    
    inline def setOnAfterUndefined: Self = StObject.set(x, "onAfter", js.undefined)
    
    inline def setOver(value: Any): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
    
    inline def setOverUndefined: Self = StObject.set(x, "over", js.undefined)
    
    inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
  }
}
