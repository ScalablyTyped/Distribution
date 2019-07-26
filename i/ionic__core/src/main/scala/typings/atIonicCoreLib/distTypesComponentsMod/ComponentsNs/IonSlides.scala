package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSlides extends js.Object {
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.native
  /**
    * Options to pass to the swiper instance. See http://idangero.us/swiper/api/ for valid options
    */
  var options: js.Any = js.native
  /**
    * If `true`, show the pagination.
    */
  var pager: scala.Boolean = js.native
  /**
    * If `true`, show the scrollbar.
    */
  var scrollbar: scala.Boolean = js.native
  /**
    * Get the index of the active slide.
    */
  def getActiveIndex(): js.Promise[scala.Double] = js.native
  /**
    * Get the index of the previous slide.
    */
  def getPreviousIndex(): js.Promise[scala.Double] = js.native
  /**
    * Get whether or not the current slide is the first slide.
    */
  def isBeginning(): js.Promise[scala.Boolean] = js.native
  /**
    * Get whether or not the current slide is the last slide.
    */
  def isEnd(): js.Promise[scala.Boolean] = js.native
  /**
    * Get the total number of slides.
    */
  def length(): js.Promise[scala.Double] = js.native
  /**
    * Lock or unlock the ability to slide to the next slide.
    * @param lock If `true`, disable swiping to the next slide.
    */
  def lockSwipeToNext(lock: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Lock or unlock the ability to slide to the previous slide.
    * @param lock If `true`, disable swiping to the previous slide.
    */
  def lockSwipeToPrev(lock: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Lock or unlock the ability to slide to the next or previous slide.
    * @param lock If `true`, disable swiping to the next and previous slide.
    */
  def lockSwipes(lock: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Transition to the next slide.
    * @param speed The transition duration (in ms).
    * @param runCallbacks If true, the transition will produce [Transition/SlideChange][Start/End] transition events.
    */
  def slideNext(): js.Promise[scala.Unit] = js.native
  def slideNext(speed: js.UndefOr[scala.Nothing], runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  def slideNext(speed: scala.Double): js.Promise[scala.Unit] = js.native
  def slideNext(speed: scala.Double, runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Transition to the previous slide.
    * @param speed The transition duration (in ms).
    * @param runCallbacks If true, the transition will produce the [Transition/SlideChange][Start/End] transition events.
    */
  def slidePrev(): js.Promise[scala.Unit] = js.native
  def slidePrev(speed: js.UndefOr[scala.Nothing], runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  def slidePrev(speed: scala.Double): js.Promise[scala.Unit] = js.native
  def slidePrev(speed: scala.Double, runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Transition to the specified slide.
    * @param index The index of the slide to transition to.
    * @param speed The transition duration (in ms).
    * @param runCallbacks If true, the transition will produce [Transition/SlideChange][Start/End] transition events.
    */
  def slideTo(index: scala.Double): js.Promise[scala.Unit] = js.native
  def slideTo(index: scala.Double, speed: js.UndefOr[scala.Nothing], runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  def slideTo(index: scala.Double, speed: scala.Double): js.Promise[scala.Unit] = js.native
  def slideTo(index: scala.Double, speed: scala.Double, runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Start auto play.
    */
  def startAutoplay(): js.Promise[scala.Unit] = js.native
  /**
    * Stop auto play.
    */
  def stopAutoplay(): js.Promise[scala.Unit] = js.native
  /**
    * Update the underlying slider implementation. Call this if you've added or removed child slides.
    */
  def update(): js.Promise[scala.Unit] = js.native
  /**
    * Force swiper to update its height (when autoHeight is enabled) for the duration equal to 'speed' parameter.
    * @param speed The transition duration (in ms).
    */
  def updateAutoHeight(): js.Promise[scala.Unit] = js.native
  def updateAutoHeight(speed: scala.Double): js.Promise[scala.Unit] = js.native
}

