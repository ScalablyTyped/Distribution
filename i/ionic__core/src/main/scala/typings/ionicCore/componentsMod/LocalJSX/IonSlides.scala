package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSlides extends StObject {
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the active slide has changed.
    */
  var onIonSlideDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user double taps on the slide's container.
    */
  var onIonSlideDoubleTap: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slider is actively being moved.
    */
  var onIonSlideDrag: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the next slide has ended.
    */
  var onIonSlideNextEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the next slide has started.
    */
  var onIonSlideNextStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the previous slide has ended.
    */
  var onIonSlidePrevEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the previous slide has started.
    */
  var onIonSlidePrevStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slider is at the last slide.
    */
  var onIonSlideReachEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slider is at its initial position.
    */
  var onIonSlideReachStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user taps/clicks on the slide's container.
    */
  var onIonSlideTap: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user releases the touch.
    */
  var onIonSlideTouchEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user first touches the slider.
    */
  var onIonSlideTouchStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slide transition has ended.
    */
  var onIonSlideTransitionEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slide transition has started.
    */
  var onIonSlideTransitionStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the active slide has changed.
    */
  var onIonSlideWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted after Swiper initialization
    */
  var onIonSlidesDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Options to pass to the swiper instance. See http://idangero.us/swiper/api/ for valid options
    */
  var options: js.UndefOr[js.Any] = js.undefined
  
  /**
    * If `true`, show the pagination.
    */
  var pager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, show the scrollbar.
    */
  var scrollbar: js.UndefOr[Boolean] = js.undefined
}
object IonSlides {
  
  @scala.inline
  def apply(): IonSlides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSlides]
  }
  
  @scala.inline
  implicit class IonSlidesMutableBuilder[Self <: IonSlides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnIonSlideDidChange(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideDidChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideDidChangeUndefined: Self = StObject.set(x, "onIonSlideDidChange", js.undefined)
    
    @scala.inline
    def setOnIonSlideDoubleTap(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideDoubleTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideDoubleTapUndefined: Self = StObject.set(x, "onIonSlideDoubleTap", js.undefined)
    
    @scala.inline
    def setOnIonSlideDrag(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideDragUndefined: Self = StObject.set(x, "onIonSlideDrag", js.undefined)
    
    @scala.inline
    def setOnIonSlideNextEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideNextEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideNextEndUndefined: Self = StObject.set(x, "onIonSlideNextEnd", js.undefined)
    
    @scala.inline
    def setOnIonSlideNextStart(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideNextStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideNextStartUndefined: Self = StObject.set(x, "onIonSlideNextStart", js.undefined)
    
    @scala.inline
    def setOnIonSlidePrevEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlidePrevEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlidePrevEndUndefined: Self = StObject.set(x, "onIonSlidePrevEnd", js.undefined)
    
    @scala.inline
    def setOnIonSlidePrevStart(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlidePrevStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlidePrevStartUndefined: Self = StObject.set(x, "onIonSlidePrevStart", js.undefined)
    
    @scala.inline
    def setOnIonSlideReachEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideReachEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideReachEndUndefined: Self = StObject.set(x, "onIonSlideReachEnd", js.undefined)
    
    @scala.inline
    def setOnIonSlideReachStart(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideReachStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideReachStartUndefined: Self = StObject.set(x, "onIonSlideReachStart", js.undefined)
    
    @scala.inline
    def setOnIonSlideTap(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideTapUndefined: Self = StObject.set(x, "onIonSlideTap", js.undefined)
    
    @scala.inline
    def setOnIonSlideTouchEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideTouchEndUndefined: Self = StObject.set(x, "onIonSlideTouchEnd", js.undefined)
    
    @scala.inline
    def setOnIonSlideTouchStart(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideTouchStartUndefined: Self = StObject.set(x, "onIonSlideTouchStart", js.undefined)
    
    @scala.inline
    def setOnIonSlideTransitionEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideTransitionEndUndefined: Self = StObject.set(x, "onIonSlideTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnIonSlideTransitionStart(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideTransitionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideTransitionStartUndefined: Self = StObject.set(x, "onIonSlideTransitionStart", js.undefined)
    
    @scala.inline
    def setOnIonSlideWillChange(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlideWillChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlideWillChangeUndefined: Self = StObject.set(x, "onIonSlideWillChange", js.undefined)
    
    @scala.inline
    def setOnIonSlidesDidLoad(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonSlidesDidLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSlidesDidLoadUndefined: Self = StObject.set(x, "onIonSlidesDidLoad", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    @scala.inline
    def setScrollbar(value: Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
  }
}
