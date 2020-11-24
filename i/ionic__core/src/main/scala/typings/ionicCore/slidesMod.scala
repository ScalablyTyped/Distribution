package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonSlidesElement
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/slides/slides", JSImport.Namespace)
@js.native
object slidesMod extends js.Object {
  
  @js.native
  class Slides () extends ComponentInterface {
    
    @JSName("connectedCallback")
    def connectedCallback_MSlides(): Unit = js.native
    
    var didInit: js.Any = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSlides(): Unit = js.native
    
    var el: HTMLIonSlidesElement = js.native
    
    /**
      * Get the index of the active slide.
      */
    def getActiveIndex(): js.Promise[Double] = js.native
    
    /**
      * Get the index of the previous slide.
      */
    def getPreviousIndex(): js.Promise[Double] = js.native
    
    /**
      * Get the Swiper instance.
      * Use this to access the full Swiper API.
      * See https://idangero.us/swiper/api/ for all API options.
      */
    def getSwiper(): js.Promise[_] = js.native
    
    var initSwiper: js.Any = js.native
    
    /**
      * Emitted after the active slide has changed.
      */
    var ionSlideDidChange: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user double taps on the slide's container.
      */
    var ionSlideDoubleTap: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slider is actively being moved.
      */
    var ionSlideDrag: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the next slide has ended.
      */
    var ionSlideNextEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the next slide has started.
      */
    var ionSlideNextStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the previous slide has ended.
      */
    var ionSlidePrevEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the previous slide has started.
      */
    var ionSlidePrevStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slider is at the last slide.
      */
    var ionSlideReachEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slider is at its initial position.
      */
    var ionSlideReachStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user taps/clicks on the slide's container.
      */
    var ionSlideTap: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user releases the touch.
      */
    var ionSlideTouchEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user first touches the slider.
      */
    var ionSlideTouchStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slide transition has ended.
      */
    var ionSlideTransitionEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slide transition has started.
      */
    var ionSlideTransitionStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted before the active slide has changed.
      */
    var ionSlideWillChange: EventEmitter[Unit] = js.native
    
    /**
      * Emitted after Swiper initialization
      */
    var ionSlidesDidLoad: EventEmitter[Unit] = js.native
    
    /**
      * Get whether or not the current slide is the first slide.
      */
    def isBeginning(): js.Promise[Boolean] = js.native
    
    /**
      * Get whether or not the current slide is the last slide.
      */
    def isEnd(): js.Promise[Boolean] = js.native
    
    /**
      * Get the total number of slides.
      */
    def length(): js.Promise[Double] = js.native
    
    /**
      * Lock or unlock the ability to slide to the next slide.
      *
      * @param lock If `true`, disable swiping to the next slide.
      */
    def lockSwipeToNext(lock: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Lock or unlock the ability to slide to the previous slide.
      *
      * @param lock If `true`, disable swiping to the previous slide.
      */
    def lockSwipeToPrev(lock: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Lock or unlock the ability to slide to the next or previous slide.
      *
      * @param lock If `true`, disable swiping to the next and previous slide.
      */
    def lockSwipes(lock: Boolean): js.Promise[Unit] = js.native
    
    var mutationO: js.Any = js.native
    
    var normalizeOptions: js.Any = js.native
    
    /**
      * Options to pass to the swiper instance.
      * See http://idangero.us/swiper/api/ for valid options
      */
    var options: js.Any = js.native
    
    def optionsChanged(): js.Promise[Unit] = js.native
    
    /**
      * If `true`, show the pagination.
      */
    var pager: Boolean = js.native
    
    var paginationEl: js.Any = js.native
    
    var readySwiper: js.Any = js.native
    
    @JSName("render")
    def render_MSlides(): js.Any = js.native
    
    /**
      * If `true`, show the scrollbar.
      */
    var scrollbar: Boolean = js.native
    
    var scrollbarEl: js.Any = js.native
    
    /**
      * Transition to the next slide.
      *
      * @param speed The transition duration (in ms).
      * @param runCallbacks If true, the transition will produce [Transition/SlideChange][Start/End] transition events.
      */
    def slideNext(): js.Promise[Unit] = js.native
    def slideNext(speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): js.Promise[Unit] = js.native
    def slideNext(speed: Double): js.Promise[Unit] = js.native
    def slideNext(speed: Double, runCallbacks: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Transition to the previous slide.
      *
      * @param speed The transition duration (in ms).
      * @param runCallbacks If true, the transition will produce the [Transition/SlideChange][Start/End] transition events.
      */
    def slidePrev(): js.Promise[Unit] = js.native
    def slidePrev(speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): js.Promise[Unit] = js.native
    def slidePrev(speed: Double): js.Promise[Unit] = js.native
    def slidePrev(speed: Double, runCallbacks: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Transition to the specified slide.
      *
      * @param index The index of the slide to transition to.
      * @param speed The transition duration (in ms).
      * @param runCallbacks If true, the transition will produce [Transition/SlideChange][Start/End] transition events.
      */
    def slideTo(index: Double): js.Promise[Unit] = js.native
    def slideTo(index: Double, speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): js.Promise[Unit] = js.native
    def slideTo(index: Double, speed: Double): js.Promise[Unit] = js.native
    def slideTo(index: Double, speed: Double, runCallbacks: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Start auto play.
      */
    def startAutoplay(): js.Promise[Unit] = js.native
    
    /**
      * Stop auto play.
      */
    def stopAutoplay(): js.Promise[Unit] = js.native
    
    var swiper: js.Any = js.native
    
    var swiperReady: js.Any = js.native
    
    var syncSwiper: js.Any = js.native
    
    /**
      * Update the underlying slider implementation. Call this if you've added or removed
      * child slides.
      */
    def update(): js.Promise[Unit] = js.native
    
    /**
      * Force swiper to update its height (when autoHeight is enabled) for the duration
      * equal to 'speed' parameter.
      *
      * @param speed The transition duration (in ms).
      */
    def updateAutoHeight(): js.Promise[Unit] = js.native
    def updateAutoHeight(speed: Double): js.Promise[Unit] = js.native
  }
}
