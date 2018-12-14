package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgPopover
  extends /**
	 * Option for igPopover
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Sets the time popover fades in and out when showing/hiding
  	 *
  	 */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Controls where the popover DOM should be attached to.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the element
  	 * "object" A reference to the parent jQuery object
  	 */
  var appendTo: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Controls whether the popover will close on blur or not
  	 *
  	 */
  var closeOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets the containment for the popover. Accepts a jQuery object
  	 *
  	 */
  var containment: js.UndefOr[js.Any] = js.undefined
  /**
  	 * sets the content for the popover container. If left null the content will be get from the target.
  	 *
  	 *
  	 * Valid values:
  	 * "string" String content of the popover container
  	 * "function" Function which is a callback that should return the content. Use the 'this' value to access the target DOM element.
  	 */
  var contentTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
  	 * controls the direction in which the control shows relative to the target element
  	 *
  	 *
  	 * Valid values:
  	 * "auto" lets the control show on the side where enough space is available with the priority specified by the [directionPriority](ui.%%WidgetNameLowered%%#options:directionPriority) property
  	 * "left" shows popover on the left side of the target element
  	 * "right" shows popover on the right side of the target element
  	 * "top" shows popover on the top of the target element
  	 * "bottom" shows popover on the bottom of the target element
  	 */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Controls the priority in which the control searches for space to show relative to the target element.
  	 * This property has effect only if the [direction](ui.%%WidgetNameLowered%%#options:direction) property value is "auto" or unset.
  	 *
  	 */
  var directionPriority: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Sets the content for the popover header
  	 *
  	 */
  var headerTemplate: js.UndefOr[IgPopoverHeaderTemplate] = js.undefined
  /**
  	 * defines height for the popover. leave null for auto
  	 *
  	 */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Event fired after popover is hidden.
  	 */
  var hidden: js.UndefOr[HiddenEvent] = js.undefined
  /**
  	 * Event fired before popover is hidden.
  	 */
  var hiding: js.UndefOr[HidingEvent] = js.undefined
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
  	 * defines height the popover won't exceed even if no specific one is set.
  	 *
  	 */
  var maxHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * defines width the popover won't exceed even if no specific one is set.
  	 *
  	 */
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * defines width the popover won't go under the value even if no specific one is set.
  	 *
  	 */
  var minWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * controls the position of the popover according to the target element in case the popover is larger than the target on the side we want to position, if the popover is smaller it should always be in the middle of the visible area
  	 *
  	 *
  	 * Valid values:
  	 * "auto" lets the control choose a position depending on available space with the following priority balanced > end > start
  	 * "balanced" the popover is positioned at the middle of the target element
  	 * "start" the popover is positioned at the beginning of the target element
  	 * "end" the popover is positioned at the end of the target element
  	 */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Selectors indicating which items should show popovers. The predefined value is [title]. Customize if you're using something other then the title attribute for the popover content, or if you need a different selector for event delegation. When changing this option, you likely need to also change the contentTemplate option
  	 *
  	 */
  var selectors: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * sets the event on which the popover will be shown. Predefined values are "mouseenter", "click" and "focus"
  	 *
  	 *
  	 * Valid values:
  	 * "mouseenter" the popover is shown on mouse enter in the target element
  	 * "click" the popover is shown on click on the target element
  	 * "focus" the popover is shown on focusing the target element
  	 */
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired before popover is shown.
  	 */
  var showing: js.UndefOr[ShowingEvent] = js.undefined
  /**
  	 * Event fired after popover is shown.
  	 */
  var shown: js.UndefOr[ShownEvent] = js.undefined
  /**
  	 * defines width for the popover. leave null for auto.
  	 *
  	 */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

