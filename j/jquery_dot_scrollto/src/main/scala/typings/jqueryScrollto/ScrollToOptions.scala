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
  var duration: js.UndefOr[js.Any] = js.undefined
  
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
  var offset: js.UndefOr[js.Any] = js.undefined
  
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
  var over: js.UndefOr[js.Any] = js.undefined
  
  /**
    * If true, and both axis are given.
    * The 2nd axis will only be animated after the first one ends.
    */
  var queue: js.UndefOr[Boolean] = js.undefined
}
object ScrollToOptions {
  
  @scala.inline
  def apply(): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToOptions]
  }
  
  @scala.inline
  implicit class ScrollToOptionsMutableBuilder[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setMargin(value: Boolean): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnAfter(value: () => Unit): Self = StObject.set(x, "onAfter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAfterFirst(value: () => Unit): Self = StObject.set(x, "onAfterFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAfterFirstUndefined: Self = StObject.set(x, "onAfterFirst", js.undefined)
    
    @scala.inline
    def setOnAfterUndefined: Self = StObject.set(x, "onAfter", js.undefined)
    
    @scala.inline
    def setOver(value: js.Any): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverUndefined: Self = StObject.set(x, "over", js.undefined)
    
    @scala.inline
    def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
  }
}
