package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSlider
  extends /**
	 * Option for igSlider
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Get or set whether the slide handle will animate when it is moved.
  	 */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
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
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Get or set the slider range minimum value.
  	 */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Get or set the slider orientation.
  	 */
  var orientation: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get or set the whether to show bookmarks title on bookmark hover or not.
  	 */
  var showBookmarkTitle: js.UndefOr[scala.Boolean] = js.undefined
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
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Defines the slide stop event. Fired to mark the end of a sliding action.
  	 */
  var stop: js.UndefOr[StopEvent] = js.undefined
  /**
  	 * Get or set whether the handle will be moved to the bookmark position when a bookmark is clicked.
  	 */
  var syncHandleWithBookmark: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Get or set the slider value.
  	 */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object IgSlider {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igSlider
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    bookmarkClick: BookmarkClickEvent = null,
    bookmarkHit: BookmarkHitEvent = null,
    bookmarks: IgSliderBookmarks = null,
    change: ChangeEvent = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    orientation: js.Any = null,
    showBookmarkTitle: js.UndefOr[scala.Boolean] = js.undefined,
    slide: SlideEvent = null,
    start: StartEvent = null,
    step: scala.Int | scala.Double = null,
    stop: StopEvent = null,
    syncHandleWithBookmark: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Int | scala.Double = null
  ): IgSlider = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (bookmarkClick != null) __obj.updateDynamic("bookmarkClick")(bookmarkClick)
    if (bookmarkHit != null) __obj.updateDynamic("bookmarkHit")(bookmarkHit)
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks)
    if (change != null) __obj.updateDynamic("change")(change)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(showBookmarkTitle)) __obj.updateDynamic("showBookmarkTitle")(showBookmarkTitle)
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (start != null) __obj.updateDynamic("start")(start)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (!js.isUndefined(syncHandleWithBookmark)) __obj.updateDynamic("syncHandleWithBookmark")(syncHandleWithBookmark)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSlider]
  }
}

