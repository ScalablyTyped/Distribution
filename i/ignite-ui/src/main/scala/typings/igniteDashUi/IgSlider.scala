package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSlider
  extends /**
	 * Option for igSlider
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get or set whether the slide handle will animate when it is moved.
  	 */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Defines the slider bookmark click event. Fired when a bookmark is clicked.
  	 */
  var bookmarkClick: js.UndefOr[BookmarkClickEvent] = js.undefined
  /**
  	 * Defines the slider bookmark hit event. Fired when the slider handle passes after the bookmark value.
  	 */
  var bookmarkHit: js.UndefOr[BookmarkHitEvent] = js.undefined
  /**
  	 * Get or set the bookmarks array.
  	 */
  var bookmarks: js.UndefOr[IgSliderBookmarks] = js.undefined
  /**
  	 * Defines the slider value change event. Fired when the value of the slider changes. It fires after the slide event.
  	 */
  var change: js.UndefOr[ChangeEvent] = js.undefined
  /**
  	 * Get or set the slider range maximum value.
  	 */
  var max: js.UndefOr[Double] = js.undefined
  /**
  	 * Get or set the slider range minimum value.
  	 */
  var min: js.UndefOr[Double] = js.undefined
  /**
  	 * Get or set the slider orientation.
  	 */
  var orientation: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get or set the whether to show bookmarks title on bookmark hover or not.
  	 */
  var showBookmarkTitle: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Defines the slide event. Fired when the user is sliding with mouse.
  	 */
  var slide: js.UndefOr[SlideEvent] = js.undefined
  /**
  	 * Defines the slide start event.
  	 */
  var start: js.UndefOr[StartEvent] = js.undefined
  /**
  	 * Get or set the step with which the value is increased.
  	 */
  var step: js.UndefOr[Double] = js.undefined
  /**
  	 * Defines the slide stop event. Fired to mark the end of a sliding action.
  	 */
  var stop: js.UndefOr[StopEvent] = js.undefined
  /**
  	 * Get or set whether the handle will be moved to the bookmark position when a bookmark is clicked.
  	 */
  var syncHandleWithBookmark: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Get or set the slider value.
  	 */
  var value: js.UndefOr[Double] = js.undefined
}

object IgSlider {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igSlider
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    bookmarkClick: (/* event */ Event, /* ui */ BookmarkClickEventUIParam) => Unit = null,
    bookmarkHit: (/* event */ Event, /* ui */ BookmarkHitEventUIParam) => Unit = null,
    bookmarks: IgSliderBookmarks = null,
    change: (/* event */ Event, /* ui */ ChangeEventUIParam) => Unit = null,
    max: Int | Double = null,
    min: Int | Double = null,
    orientation: js.Any = null,
    showBookmarkTitle: js.UndefOr[Boolean] = js.undefined,
    slide: (/* event */ Event, /* ui */ SlideEventUIParam) => Unit = null,
    start: (/* event */ Event, /* ui */ StartEventUIParam) => Unit = null,
    step: Int | Double = null,
    stop: (/* event */ Event, /* ui */ StopEventUIParam) => Unit = null,
    syncHandleWithBookmark: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null
  ): IgSlider = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (bookmarkClick != null) __obj.updateDynamic("bookmarkClick")(js.Any.fromFunction2(bookmarkClick))
    if (bookmarkHit != null) __obj.updateDynamic("bookmarkHit")(js.Any.fromFunction2(bookmarkHit))
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(showBookmarkTitle)) __obj.updateDynamic("showBookmarkTitle")(showBookmarkTitle.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2(slide))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (!js.isUndefined(syncHandleWithBookmark)) __obj.updateDynamic("syncHandleWithBookmark")(syncHandleWithBookmark.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSlider]
  }
}

