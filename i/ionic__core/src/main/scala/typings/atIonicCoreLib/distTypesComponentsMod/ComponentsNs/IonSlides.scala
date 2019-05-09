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
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
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
    */
  def lockSwipeToNext(lock: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Lock or unlock the ability to slide to the previous slide.
    */
  def lockSwipeToPrev(lock: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Lock or unlock the ability to slide to the next or previous slide.
    */
  def lockSwipes(lock: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Transition to the next slide.
    */
  def slideNext(): js.Promise[scala.Unit] = js.native
  def slideNext(speed: js.UndefOr[scala.Nothing], runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  def slideNext(speed: scala.Double): js.Promise[scala.Unit] = js.native
  def slideNext(speed: scala.Double, runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Transition to the previous slide.
    */
  def slidePrev(): js.Promise[scala.Unit] = js.native
  def slidePrev(speed: js.UndefOr[scala.Nothing], runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  def slidePrev(speed: scala.Double): js.Promise[scala.Unit] = js.native
  def slidePrev(speed: scala.Double, runCallbacks: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Transition to the specified slide.
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
    */
  def updateAutoHeight(): js.Promise[scala.Unit] = js.native
  def updateAutoHeight(speed: scala.Double): js.Promise[scala.Unit] = js.native
}

