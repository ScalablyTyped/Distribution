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

