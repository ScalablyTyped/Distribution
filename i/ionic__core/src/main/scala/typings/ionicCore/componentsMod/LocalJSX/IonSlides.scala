package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSlides extends js.Object {
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * Emitted after the active slide has changed.
    */
  var onIonSlideDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the user double taps on the slide's container.
    */
  var onIonSlideDoubleTap: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the slider is actively being moved.
    */
  var onIonSlideDrag: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the next slide has ended.
    */
  var onIonSlideNextEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the next slide has started.
    */
  var onIonSlideNextStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the previous slide has ended.
    */
  var onIonSlidePrevEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the previous slide has started.
    */
  var onIonSlidePrevStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the slider is at the last slide.
    */
  var onIonSlideReachEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the slider is at its initial position.
    */
  var onIonSlideReachStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the user taps/clicks on the slide's container.
    */
  var onIonSlideTap: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the user releases the touch.
    */
  var onIonSlideTouchEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the user first touches the slider.
    */
  var onIonSlideTouchStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the slide transition has ended.
    */
  var onIonSlideTransitionEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the slide transition has started.
    */
  var onIonSlideTransitionStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted before the active slide has changed.
    */
  var onIonSlideWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted after Swiper initialization
    */
  var onIonSlidesDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Options to pass to the swiper instance. See http://idangero.us/swiper/api/ for valid options
    */
  var options: js.UndefOr[js.Any] = js.native
  /**
    * If `true`, show the pagination.
    */
  var pager: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, show the scrollbar.
    */
  var scrollbar: js.UndefOr[Boolean] = js.native
}

object IonSlides {
  @scala.inline
  def apply(): IonSlides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSlides]
  }
  @scala.inline
  implicit class IonSlidesOps[Self <: IonSlides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnIonSlideDidChange(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideDidChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideDidChange: Self = this.set("onIonSlideDidChange", js.undefined)
    @scala.inline
    def setOnIonSlideDoubleTap(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideDoubleTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideDoubleTap: Self = this.set("onIonSlideDoubleTap", js.undefined)
    @scala.inline
    def setOnIonSlideDrag(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideDrag: Self = this.set("onIonSlideDrag", js.undefined)
    @scala.inline
    def setOnIonSlideNextEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideNextEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideNextEnd: Self = this.set("onIonSlideNextEnd", js.undefined)
    @scala.inline
    def setOnIonSlideNextStart(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideNextStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideNextStart: Self = this.set("onIonSlideNextStart", js.undefined)
    @scala.inline
    def setOnIonSlidePrevEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlidePrevEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlidePrevEnd: Self = this.set("onIonSlidePrevEnd", js.undefined)
    @scala.inline
    def setOnIonSlidePrevStart(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlidePrevStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlidePrevStart: Self = this.set("onIonSlidePrevStart", js.undefined)
    @scala.inline
    def setOnIonSlideReachEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideReachEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideReachEnd: Self = this.set("onIonSlideReachEnd", js.undefined)
    @scala.inline
    def setOnIonSlideReachStart(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideReachStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideReachStart: Self = this.set("onIonSlideReachStart", js.undefined)
    @scala.inline
    def setOnIonSlideTap(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideTap: Self = this.set("onIonSlideTap", js.undefined)
    @scala.inline
    def setOnIonSlideTouchEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideTouchEnd: Self = this.set("onIonSlideTouchEnd", js.undefined)
    @scala.inline
    def setOnIonSlideTouchStart(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideTouchStart: Self = this.set("onIonSlideTouchStart", js.undefined)
    @scala.inline
    def setOnIonSlideTransitionEnd(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideTransitionEnd: Self = this.set("onIonSlideTransitionEnd", js.undefined)
    @scala.inline
    def setOnIonSlideTransitionStart(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideTransitionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideTransitionStart: Self = this.set("onIonSlideTransitionStart", js.undefined)
    @scala.inline
    def setOnIonSlideWillChange(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlideWillChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlideWillChange: Self = this.set("onIonSlideWillChange", js.undefined)
    @scala.inline
    def setOnIonSlidesDidLoad(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonSlidesDidLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSlidesDidLoad: Self = this.set("onIonSlidesDidLoad", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPager(value: Boolean): Self = this.set("pager", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    @scala.inline
    def setScrollbar(value: Boolean): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
  }
  
}

