package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSlider
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Get or set whether the slide handle will animate when it is moved.
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Defines the slider bookmark click event. Fired when a bookmark is clicked.
    */
  var bookmarkClick: js.UndefOr[BookmarkClickEvent] = js.native
  /**
    * Defines the slider bookmark hit event. Fired when the slider handle passes after the bookmark value.
    */
  var bookmarkHit: js.UndefOr[BookmarkHitEvent] = js.native
  /**
    * Get or set the bookmarks array.
    */
  var bookmarks: js.UndefOr[IgSliderBookmarks] = js.native
  /**
    * Defines the slider value change event. Fired when the value of the slider changes. It fires after the slide event.
    */
  var change: js.UndefOr[ChangeEvent] = js.native
  /**
    * Get or set the slider range maximum value.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Get or set the slider range minimum value.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Get or set the slider orientation.
    */
  var orientation: js.UndefOr[js.Any] = js.native
  /**
    * Get or set the whether to show bookmarks title on bookmark hover or not.
    */
  var showBookmarkTitle: js.UndefOr[Boolean] = js.native
  /**
    * Defines the slide event. Fired when the user is sliding with mouse.
    */
  var slide: js.UndefOr[SlideEvent] = js.native
  /**
    * Defines the slide start event.
    */
  var start: js.UndefOr[StartEvent] = js.native
  /**
    * Get or set the step with which the value is increased.
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Defines the slide stop event. Fired to mark the end of a sliding action.
    */
  var stop: js.UndefOr[StopEvent] = js.native
  /**
    * Get or set whether the handle will be moved to the bookmark position when a bookmark is clicked.
    */
  var syncHandleWithBookmark: js.UndefOr[Boolean] = js.native
  /**
    * Get or set the slider value.
    */
  var value: js.UndefOr[Double] = js.native
}

object IgSlider {
  @scala.inline
  def apply(): IgSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSlider]
  }
  @scala.inline
  implicit class IgSliderOps[Self <: IgSlider] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBookmarkClick(value: (/* event */ Event, /* ui */ BookmarkClickEventUIParam) => Unit): Self = this.set("bookmarkClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBookmarkClick: Self = this.set("bookmarkClick", js.undefined)
    @scala.inline
    def setBookmarkHit(value: (/* event */ Event, /* ui */ BookmarkHitEventUIParam) => Unit): Self = this.set("bookmarkHit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBookmarkHit: Self = this.set("bookmarkHit", js.undefined)
    @scala.inline
    def setBookmarks(value: IgSliderBookmarks): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmarks: Self = this.set("bookmarks", js.undefined)
    @scala.inline
    def setChange(value: (/* event */ Event, /* ui */ ChangeEventUIParam) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOrientation(value: js.Any): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setShowBookmarkTitle(value: Boolean): Self = this.set("showBookmarkTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBookmarkTitle: Self = this.set("showBookmarkTitle", js.undefined)
    @scala.inline
    def setSlide(value: (/* event */ Event, /* ui */ SlideEventUIParam) => Unit): Self = this.set("slide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    @scala.inline
    def setStart(value: (/* event */ Event, /* ui */ StartEventUIParam) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStop(value: (/* event */ Event, /* ui */ StopEventUIParam) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setSyncHandleWithBookmark(value: Boolean): Self = this.set("syncHandleWithBookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncHandleWithBookmark: Self = this.set("syncHandleWithBookmark", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

