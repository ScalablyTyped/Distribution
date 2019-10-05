package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSlides extends js.Object {
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
  def apply(
    mode: ios | md = null,
    onIonSlideDidChange: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideDoubleTap: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideDrag: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideNextEnd: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideNextStart: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlidePrevEnd: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlidePrevStart: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideReachEnd: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideReachStart: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideTap: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideTouchEnd: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideTouchStart: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideTransitionEnd: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideTransitionStart: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlideWillChange: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSlidesDidLoad: /* event */ CustomEvent[Unit] => Unit = null,
    options: js.Any = null,
    pager: js.UndefOr[Boolean] = js.undefined,
    scrollbar: js.UndefOr[Boolean] = js.undefined
  ): IonSlides = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonSlideDidChange != null) __obj.updateDynamic("onIonSlideDidChange")(js.Any.fromFunction1(onIonSlideDidChange))
    if (onIonSlideDoubleTap != null) __obj.updateDynamic("onIonSlideDoubleTap")(js.Any.fromFunction1(onIonSlideDoubleTap))
    if (onIonSlideDrag != null) __obj.updateDynamic("onIonSlideDrag")(js.Any.fromFunction1(onIonSlideDrag))
    if (onIonSlideNextEnd != null) __obj.updateDynamic("onIonSlideNextEnd")(js.Any.fromFunction1(onIonSlideNextEnd))
    if (onIonSlideNextStart != null) __obj.updateDynamic("onIonSlideNextStart")(js.Any.fromFunction1(onIonSlideNextStart))
    if (onIonSlidePrevEnd != null) __obj.updateDynamic("onIonSlidePrevEnd")(js.Any.fromFunction1(onIonSlidePrevEnd))
    if (onIonSlidePrevStart != null) __obj.updateDynamic("onIonSlidePrevStart")(js.Any.fromFunction1(onIonSlidePrevStart))
    if (onIonSlideReachEnd != null) __obj.updateDynamic("onIonSlideReachEnd")(js.Any.fromFunction1(onIonSlideReachEnd))
    if (onIonSlideReachStart != null) __obj.updateDynamic("onIonSlideReachStart")(js.Any.fromFunction1(onIonSlideReachStart))
    if (onIonSlideTap != null) __obj.updateDynamic("onIonSlideTap")(js.Any.fromFunction1(onIonSlideTap))
    if (onIonSlideTouchEnd != null) __obj.updateDynamic("onIonSlideTouchEnd")(js.Any.fromFunction1(onIonSlideTouchEnd))
    if (onIonSlideTouchStart != null) __obj.updateDynamic("onIonSlideTouchStart")(js.Any.fromFunction1(onIonSlideTouchStart))
    if (onIonSlideTransitionEnd != null) __obj.updateDynamic("onIonSlideTransitionEnd")(js.Any.fromFunction1(onIonSlideTransitionEnd))
    if (onIonSlideTransitionStart != null) __obj.updateDynamic("onIonSlideTransitionStart")(js.Any.fromFunction1(onIonSlideTransitionStart))
    if (onIonSlideWillChange != null) __obj.updateDynamic("onIonSlideWillChange")(js.Any.fromFunction1(onIonSlideWillChange))
    if (onIonSlidesDidLoad != null) __obj.updateDynamic("onIonSlidesDidLoad")(js.Any.fromFunction1(onIonSlidesDidLoad))
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(pager)) __obj.updateDynamic("pager")(pager)
    if (!js.isUndefined(scrollbar)) __obj.updateDynamic("scrollbar")(scrollbar)
    __obj.asInstanceOf[IonSlides]
  }
}

