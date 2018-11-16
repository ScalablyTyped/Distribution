package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgScroll
  extends /**
	 * Option for igScroll
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Sets or gets if the scrollbars should be always visible (on all environments). Otherwise it will be the default behavior. Note: this option is only for the custom scrollbars set through the scrollbarType option.
  	 *
  	 */
  var alwaysVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar track areas.
  	 *
  	 */
  var bigIncrementStep: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets at least how many times the horizontal speed should be bigger so the inertia proceeds only horizontally without scrolling vertically. This is to improve interactions due to not perfectly swiping left/right with some deviation down/up
  	 *
  	 */
  var inertiaDeltaX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets at least how many times the vertical speed should be bigger so the inertia proceeds only vertically without scrolling horizontally. This is to improve interactions due to not perfectly swiping down/up with some deviation left/right
  	 *
  	 */
  var inertiaDeltaY: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets the modifier for how long the inertia last on mobile devices
  	 *
  	 */
  var inertiaDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets the modifier for how much the inertia scrolls on mobile devices
  	 *
  	 */
  var inertiaStep: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Sets or gets the minimum size of the thumb drag in pixels. For the vertical thumb it means its minimum height, for the horizontal thumb it means its minimum width. This affects only the custom scrollblar when scrollbarType is set to "custom".
  	 *
  	 */
  var minThumbSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Sets or gets if igScroll can modify the DOM when it is initialized on certain element so that the content can be scrollable.
  	 *
  	 */
  var modifyDOM: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Event which is raised after the scroller has been rendered fully
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Event which is raised after the igScroll has finished resizing.
  	 * Function takes arguments evt and args.
  	 * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
  	 * Use args.owner to obtain reference to igScroll.
  	 */
  var resized: js.UndefOr[ResizedEvent] = js.undefined
  /**
  	 * Event which is raised when the igScroll detects that the element is reizing.
  	 * Function takes arguments evt and args.
  	 * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
  	 * Use args.owner to obtain reference to igScroll.
  	 */
  var resizing: js.UndefOr[ResizingEvent] = js.undefined
  /**
  	 * Sets custom value for how high is actually the content. Useful when wanting to scroll and update the shown content manually.
  	 *
  	 */
  var scrollHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets current horizontal position of the content.
  	 *
  	 */
  var scrollLeft: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets if only the linked horizontal scrollbar should be used for horizontal scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
  	 *
  	 */
  var scrollOnlyHBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets gets if only the linked vertical scrollbar should be used for vertical scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
  	 *
  	 */
  var scrollOnlyVBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets gets current vertical position of the content.
  	 *
  	 */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets custom value for what width is actually the content. Useful when wanting to scroll and update the shown content manually.
  	 *
  	 */
  var scrollWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets html or jQuery element which is used for horizontal scrolling.
  	 *
  	 */
  var scrollbarH: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets gets html or jQuery element to which the horizontal scrollbar will be appended to.
  	 *
  	 */
  var scrollbarHParent: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets or gets what type of scrollbars should be using the igScroll (on all environments).
  	 *
  	 *
  	 * Valid values:
  	 * "custom" Custom scrollbars with custom ui and events.
  	 * "native" Native scrollbars
  	 * "none" No scrollbars should be visible
  	 */
  var scrollbarType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets gets html or jQuery element which is used for vertical scrolling.
  	 *
  	 */
  var scrollbarV: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets gets html or jQuery element to which the vertical scrollbar will be appended to.
  	 *
  	 */
  var scrollbarVParent: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event which is raised after scrolling has stopped.
  	 */
  var scrolled: js.UndefOr[ScrolledEvent] = js.undefined
  /**
  	 * Event which is raised before scrolling or before each step when having inertia.
  	 * Return false in order to cancel action.
  	 */
  var scrolling: js.UndefOr[ScrollingEvent] = js.undefined
  /**
  	 * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar arrows
  	 *
  	 */
  var smallIncrementStep: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets if smoother scrolling with small intertia should be used when using mouse wheel
  	 *
  	 */
  var smoothing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the smooth scrolling behavior.
  	 *
  	 */
  var smoothingDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the smooth scrolling behavior.
  	 *
  	 */
  var smoothingStep: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets how much pixels of toleration there will be when initially swiping horizontally. This is to improve swiping up/down without scrolling left/right when not intended due to small deviation left/right
  	 *
  	 */
  var swipeToleranceX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets gets elements that are linked to the main content horizontally. When the content is scrolled on X axis the linked elements scroll accordingly.
  	 *
  	 */
  var syncedElemsH: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Sets gets elements that are linked to the main content vertically. When the content is scrolled on Y axis the linked elements scroll accordingly.
  	 *
  	 */
  var syncedElemsV: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Event which is raised on mouse up from the scrollbar's thumb drag.
  	 */
  var thumbDragEnd: js.UndefOr[ThumbDragEndEvent] = js.undefined
  /**
  	 * Event which is raised when the thumb drag is being moved.
  	 */
  var thumbDragMove: js.UndefOr[ThumbDragMoveEvent] = js.undefined
  /**
  	 * Event which is raised when there is mouse click on the scrollbar's thumb drag.
  	 */
  var thumbDragStart: js.UndefOr[ThumbDragStartEvent] = js.undefined
  /**
  	 * Sets gets the step of the default scrolling behavior when using mouse wheel
  	 *
  	 */
  var wheelStep: js.UndefOr[scala.Double] = js.undefined
}

