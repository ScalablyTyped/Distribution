package typings.loryJs

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lory.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lory.js", "lory")
  @js.native
  def lory: LoryStatic = js.native
  @scala.inline
  def lory_=(x: LoryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lory")(x.asInstanceOf[js.Any])
  
  @js.native
  trait LoryOptions extends StObject {
    
    /**
      * executed after initialisation (end of setup function)
      */
    var afterInit: js.UndefOr[js.Function0[_]] = js.native
    
    //////////////////////////////////////////////////
    //  Callbacks
    //////////////////////////////////////////////////
    /**
      * executed before initialisation (first in setup function)
      */
    var beforeInit: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * executed on click of next controls (next function)
      */
    var beforeNext: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * executed on click of prev controls (prev function)
      */
    var beforePrev: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * executed on every resize event
      */
    var beforeResize: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * executed on touch attempt (touchstart)
      */
    var beforeTouch: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * class name for slider frame
      * default: 'js_frame'
      */
    var classNameFrame: js.UndefOr[String] = js.native
    
    /**
      * class name for slider next control
      * default: 'js_next'
      */
    var classNameNextCtrl: js.UndefOr[String] = js.native
    
    /**
      * class name for slider previous control
      * default: 'js_prev'
      */
    var classNamePrevCtrl: js.UndefOr[String] = js.native
    
    /**
      * class name for slides container
      * default: 'js_slides'
      */
    var classNameSlideContainer: js.UndefOr[String] = js.native
    
    /**
      * cubic bezier easing functions: http://easings.net/de (default: 'cubic-bezier(0.455, 0.03, 0.515, 0.955)').
      */
    var ease: js.UndefOr[String] = js.native
    
    /**
      * enabled mouse events
      * default: false
      */
    var enableMouseEvents: js.UndefOr[Boolean] = js.native
    
    /**
      * like carousel, works with multiple slides (default: false). (do not combine with rewind)
      */
    var infinite: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * the slide index to show when the slider is initialized (    default: 0 )
      */
    var initialIndex: js.UndefOr[Double] = js.native
    
    /**
      * if slider reached the last slide, with next click the slider goes back to the startindex (default: false).
      */
    var rewind: js.UndefOr[Boolean] = js.native
    
    /**
      * time in milliseconds for the animation of the rewind after the last slide (default: 600).
      */
    var rewindSpeed: js.UndefOr[Double] = js.native
    
    /**
      * time in milliseconds for the animation of a valid slide attempt (default: 300).
      */
    var slideSpeed: js.UndefOr[Double] = js.native
    
    //////////////////////////////////////////////////
    //  Options
    //////////////////////////////////////////////////
    /**
      * slides scrolled at once (default: 1).
      */
    var slidesToScroll: js.UndefOr[Double] = js.native
    
    /**
      * time for the snapBack of the slider if the slide attempt was not valid (default: 200).
      */
    var snapBackSpeed: js.UndefOr[Double] = js.native
  }
  object LoryOptions {
    
    @scala.inline
    def apply(): LoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoryOptions]
    }
    
    @scala.inline
    implicit class LoryOptionsMutableBuilder[Self <: LoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterInit(value: () => _): Self = StObject.set(x, "afterInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      @scala.inline
      def setBeforeInit(value: () => _): Self = StObject.set(x, "beforeInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
      
      @scala.inline
      def setBeforeNext(value: () => _): Self = StObject.set(x, "beforeNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeNextUndefined: Self = StObject.set(x, "beforeNext", js.undefined)
      
      @scala.inline
      def setBeforePrev(value: () => _): Self = StObject.set(x, "beforePrev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforePrevUndefined: Self = StObject.set(x, "beforePrev", js.undefined)
      
      @scala.inline
      def setBeforeResize(value: () => _): Self = StObject.set(x, "beforeResize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeResizeUndefined: Self = StObject.set(x, "beforeResize", js.undefined)
      
      @scala.inline
      def setBeforeTouch(value: () => _): Self = StObject.set(x, "beforeTouch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeTouchUndefined: Self = StObject.set(x, "beforeTouch", js.undefined)
      
      @scala.inline
      def setClassNameFrame(value: String): Self = StObject.set(x, "classNameFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameFrameUndefined: Self = StObject.set(x, "classNameFrame", js.undefined)
      
      @scala.inline
      def setClassNameNextCtrl(value: String): Self = StObject.set(x, "classNameNextCtrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameNextCtrlUndefined: Self = StObject.set(x, "classNameNextCtrl", js.undefined)
      
      @scala.inline
      def setClassNamePrevCtrl(value: String): Self = StObject.set(x, "classNamePrevCtrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamePrevCtrlUndefined: Self = StObject.set(x, "classNamePrevCtrl", js.undefined)
      
      @scala.inline
      def setClassNameSlideContainer(value: String): Self = StObject.set(x, "classNameSlideContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameSlideContainerUndefined: Self = StObject.set(x, "classNameSlideContainer", js.undefined)
      
      @scala.inline
      def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setEnableMouseEvents(value: Boolean): Self = StObject.set(x, "enableMouseEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMouseEventsUndefined: Self = StObject.set(x, "enableMouseEvents", js.undefined)
      
      @scala.inline
      def setInfinite(value: Boolean | Double): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      @scala.inline
      def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      @scala.inline
      def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindSpeed(value: Double): Self = StObject.set(x, "rewindSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindSpeedUndefined: Self = StObject.set(x, "rewindSpeed", js.undefined)
      
      @scala.inline
      def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      @scala.inline
      def setSlideSpeed(value: Double): Self = StObject.set(x, "slideSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideSpeedUndefined: Self = StObject.set(x, "slideSpeed", js.undefined)
      
      @scala.inline
      def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      @scala.inline
      def setSnapBackSpeed(value: Double): Self = StObject.set(x, "snapBackSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapBackSpeedUndefined: Self = StObject.set(x, "snapBackSpeed", js.undefined)
    }
  }
  
  @js.native
  trait LoryStatic extends StObject {
    
    def apply(element: Element): LoryStatic = js.native
    def apply(element: Element, options: LoryOptions): LoryStatic = js.native
    
    /**
      * unmount/destroy the instance of lory
      */
    def destroy(): Unit = js.native
    
    /**
      * slides to the next slide.
      */
    def next(): Unit = js.native
    
    /**
      * slides to the previous slide.
      */
    def prev(): Unit = js.native
    
    /**
      * sets the slider back to the starting position and resets the current index (called on resize event).
      */
    def reset(): Unit = js.native
    
    /**
      * returns the index of the current slide element
      */
    def returnIndex(): Double = js.native
    
    /**
      * binds eventlisteners, merging default and user options, setup the slides based on DOM (called once during initialisation). Call setup if DOM or user options have changed or eventlisteners needs to be rebinded.
      */
    def setup(): Unit = js.native
    
    /**
      * slides to the index given as an argument.
      */
    def slideTo(index: Double): Unit = js.native
  }
}
