package typings
package jscrollpaneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JScrollPaneSettings extends js.Object {
  /**
  	 * The number of milliseconds taken to animate to a new position
  	*/
  var animateDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The type of easing to use when animating to a new position
  	*/
  var animateEase: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Whether to use animation when calling scrollTo or scrollBy. You can control the animation speed and easing by using
  	 * the animateDuration and animateEase settings or if you want to exercise more complete control then you can override
  	 * the animate API method. Demo. 
  	*/
  var animateScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * A multiplier which is used to control the amount that the scrollpane scrolls each time on of the arrow buttons is pressed.
  	*/
  var arrowButtonSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The number of milliseconds between each repeated scroll event when the mouse is held down over one of the arrow keys.
  	*/
  var arrowRepeatFreq: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether the arrow buttons should cause the jScrollPane to scroll while you are hovering over them. 
  	*/
  var arrowScrollOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Whether jScrollPane should automatically reinitialise itself periodically after you have initially initialised it.
  	 * This can help with instances when the size of the content of the scrollpane (or the surrounding element) changes.
  	 * However, it does involve an overhead of running a javascript function on a timer so it is recommended only to activate
  	 * where necessary.
  	*/
  var autoReinitialise: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The number of milliseconds between each reinitialisation (if autoReinitialise is true). 
  	*/
  var autoReinitialiseDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether clicking on the track (e.g. the area behind the drag) should scroll towards the point clicked on.
  	 * Defaults to true as this is the native behaviour in these situations. 
  	*/
  var clickOnTrack: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The width of the content of the scroll pane. The default value of undefined will allow jScrollPane to calculate the
  	 * width of it's content. However, in some cases you will want to disable this (e.g. to prevent horizontal scrolling or
  	 * where the calculation of the size of the content doesn't return reliable results)
  	*/
  var contentWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether keyboard navigation should be enabled (e.g. whether the user can focus the scrollpane and then use
  	 * the arrow (and other) keys to navigate around. 
  	*/
  var enableKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Whether the focus outline should be hidden in all browsers. For best accessibility you should not change
  	 * this option. You can style the outline with the CSS property outline and outline-offset. 
  	*/
  var hideFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Whether internal links on the page should be hijacked so that if they point so content within a jScrollPane then
  	 * they automatically scroll the jScrollPane to the correct place.
  	*/
  var hijackInternalLinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Where the horizontal arrows should appear relative to the horizontal track.
  	*/
  var horizontalArrowPositions: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The largest width that the horizontal drag can have. The size of the drag elements is based on the proportion of the
  	 * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
  	*/
  var horizontalDragMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The smallest width that the horizontal drag can have. The size of the drag elements is based on the proportion of the
  	 * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
  	*/
  var horizontalDragMinWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The amount of space between the bottom of the content and the horizontal scrollbar. 
  	*/
  var horizontalGutter: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether the scrollpane should attempt to maintain it's position whenever it is reinitialised.
  	 * If true then the viewport of the scrollpane will remain the same when it is reinitialised, if false
  		then the viewport will jump back up to the top when the scrollpane is reinitialised. See also stickToBottom and stickToRight. 
  	 */
  var maintainPosition: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * A multiplier which is used to control the amount that the scrollpane scrolls each time the mouse wheel is turned. 
  	*/
  var mouseWheelSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether arrows should be shown on the generated scroll pane. When set to false only the scrollbar
  	 * track and drag will be shown, if set to true then arrows buttons will also be shown.
  	 */
  var showArrows: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If maintainPosition is true and the scrollpane is scrolled to the bottom then the scrollpane then the scrollpane will
  	 * remain scrolled to the bottom even if new content is added to the pane which makes it taller. 
  	*/
  var stickToBottom: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If maintainPosition is true and the scrollpane is scrolled to its right edge then the scrollpane then the scrollpane
  	 * will remain scrolled to the right edge even if new content is added to the pane which makes it wider. 
  	*/
  var stickToRight: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The number of milliseconds between each repeated scroll event when the mouse is held down over the track. 
  	*/
  var trackClickRepeatFreq: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A multiplier which is used to control the amount that the scrollpane scrolls each trackClickRepeatFreq
  	 * while the mouse button is held down over the track. 
  	*/
  var trackClickSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Where the vertical arrows should appear relative to the vertical track.
  	*/
  var verticalArrowPositions: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The largest height that the vertical drag can have. The size of the drag elements is based on the proportion of the
  	 * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
  	*/
  var verticalDragMaxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The smallest height that the vertical drag can have. The size of the drag elements is based on the proportion of the
  	 * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
  	*/
  var verticalDragMinHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The amount of space between the side of the content and the vertical scrollbar. 
  	*/
  var verticalGutter: js.UndefOr[scala.Double] = js.undefined
}

object JScrollPaneSettings {
  @scala.inline
  def apply(
    animateDuration: scala.Int | scala.Double = null,
    animateEase: java.lang.String = null,
    animateScroll: js.UndefOr[scala.Boolean] = js.undefined,
    arrowButtonSpeed: scala.Int | scala.Double = null,
    arrowRepeatFreq: scala.Int | scala.Double = null,
    arrowScrollOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    autoReinitialise: js.UndefOr[scala.Boolean] = js.undefined,
    autoReinitialiseDelay: scala.Int | scala.Double = null,
    clickOnTrack: js.UndefOr[scala.Boolean] = js.undefined,
    contentWidth: scala.Int | scala.Double = null,
    enableKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    hideFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hijackInternalLinks: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalArrowPositions: java.lang.String = null,
    horizontalDragMaxWidth: scala.Int | scala.Double = null,
    horizontalDragMinWidth: scala.Int | scala.Double = null,
    horizontalGutter: scala.Int | scala.Double = null,
    maintainPosition: js.UndefOr[scala.Boolean] = js.undefined,
    mouseWheelSpeed: scala.Int | scala.Double = null,
    showArrows: js.UndefOr[scala.Boolean] = js.undefined,
    stickToBottom: js.UndefOr[scala.Boolean] = js.undefined,
    stickToRight: js.UndefOr[scala.Boolean] = js.undefined,
    trackClickRepeatFreq: scala.Int | scala.Double = null,
    trackClickSpeed: scala.Int | scala.Double = null,
    verticalArrowPositions: java.lang.String = null,
    verticalDragMaxHeight: scala.Int | scala.Double = null,
    verticalDragMinHeight: scala.Int | scala.Double = null,
    verticalGutter: scala.Int | scala.Double = null
  ): JScrollPaneSettings = {
    val __obj = js.Dynamic.literal()
    if (animateDuration != null) __obj.updateDynamic("animateDuration")(animateDuration.asInstanceOf[js.Any])
    if (animateEase != null) __obj.updateDynamic("animateEase")(animateEase)
    if (!js.isUndefined(animateScroll)) __obj.updateDynamic("animateScroll")(animateScroll)
    if (arrowButtonSpeed != null) __obj.updateDynamic("arrowButtonSpeed")(arrowButtonSpeed.asInstanceOf[js.Any])
    if (arrowRepeatFreq != null) __obj.updateDynamic("arrowRepeatFreq")(arrowRepeatFreq.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowScrollOnHover)) __obj.updateDynamic("arrowScrollOnHover")(arrowScrollOnHover)
    if (!js.isUndefined(autoReinitialise)) __obj.updateDynamic("autoReinitialise")(autoReinitialise)
    if (autoReinitialiseDelay != null) __obj.updateDynamic("autoReinitialiseDelay")(autoReinitialiseDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(clickOnTrack)) __obj.updateDynamic("clickOnTrack")(clickOnTrack)
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardNavigation)) __obj.updateDynamic("enableKeyboardNavigation")(enableKeyboardNavigation)
    if (!js.isUndefined(hideFocus)) __obj.updateDynamic("hideFocus")(hideFocus)
    if (!js.isUndefined(hijackInternalLinks)) __obj.updateDynamic("hijackInternalLinks")(hijackInternalLinks)
    if (horizontalArrowPositions != null) __obj.updateDynamic("horizontalArrowPositions")(horizontalArrowPositions)
    if (horizontalDragMaxWidth != null) __obj.updateDynamic("horizontalDragMaxWidth")(horizontalDragMaxWidth.asInstanceOf[js.Any])
    if (horizontalDragMinWidth != null) __obj.updateDynamic("horizontalDragMinWidth")(horizontalDragMinWidth.asInstanceOf[js.Any])
    if (horizontalGutter != null) __obj.updateDynamic("horizontalGutter")(horizontalGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainPosition)) __obj.updateDynamic("maintainPosition")(maintainPosition)
    if (mouseWheelSpeed != null) __obj.updateDynamic("mouseWheelSpeed")(mouseWheelSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrows)) __obj.updateDynamic("showArrows")(showArrows)
    if (!js.isUndefined(stickToBottom)) __obj.updateDynamic("stickToBottom")(stickToBottom)
    if (!js.isUndefined(stickToRight)) __obj.updateDynamic("stickToRight")(stickToRight)
    if (trackClickRepeatFreq != null) __obj.updateDynamic("trackClickRepeatFreq")(trackClickRepeatFreq.asInstanceOf[js.Any])
    if (trackClickSpeed != null) __obj.updateDynamic("trackClickSpeed")(trackClickSpeed.asInstanceOf[js.Any])
    if (verticalArrowPositions != null) __obj.updateDynamic("verticalArrowPositions")(verticalArrowPositions)
    if (verticalDragMaxHeight != null) __obj.updateDynamic("verticalDragMaxHeight")(verticalDragMaxHeight.asInstanceOf[js.Any])
    if (verticalDragMinHeight != null) __obj.updateDynamic("verticalDragMinHeight")(verticalDragMinHeight.asInstanceOf[js.Any])
    if (verticalGutter != null) __obj.updateDynamic("verticalGutter")(verticalGutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[JScrollPaneSettings]
  }
}

