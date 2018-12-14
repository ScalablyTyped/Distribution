package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgTreeGridTooltips
  extends /**
	 * Option for igTreeGridTooltips
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A list of custom column settings that specify custom tooltip settings for a specific column (whether tooltips are enabled / disabled)
  	 *
  	 */
  var columnSettings: js.UndefOr[IgGridTooltipsColumnSettings] = js.undefined
  /**
  	 * Sets the left position of the tooltip relative to the mouse cursor
  	 *
  	 */
  var cursorLeftOffset: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets the top position of the tooltip relative to the mouse cursor
  	 *
  	 */
  var cursorTopOffset: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets the time tooltip fades in and out when showing/hiding
  	 *
  	 */
  var fadeTimespan: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Type="integer" The time in milliseconds after which tooltip hides when mouse
  	 * cursor gets outside of the cell.
  	 *
  	 */
  var hideDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The time in milliseconds after which tooltip will show when
  	 * mouse cursor is hovered over a cell.
  	 *
  	 */
  var showDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Controls the tooltip's style
  	 *
  	 *
  	 * Valid values:
  	 * "tooltip" The tooltip will be positioned according to the mouse cursor. Will render the tooltip content as plain text.
  	 * "popover" The tooltip will be positioned according to the target element with an arrow pointing the element. This style is more suitable for touch-supported environments. Will render the tooltip content as HTML.
  	 */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired after a tooltip is hidden
  	 */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.undefined
  /**
  	 * Event fired when the mouse has left an element and the tooltip is about to hide
  	 */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.undefined
  /**
  	 * Event fired when the mouse has hovered on an element long enough to display a tooltip
  	 */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.undefined
  /**
  	 * Event fired after a tooltip is shown
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.undefined
  /**
  	 * Determines the tooltip visibility option
  	 *
  	 *
  	 * Valid values:
  	 * "always" tooltips always show for hovered elements
  	 * "never" tooltips do not show automatically
  	 * "overflow" tooltips show only when the underlying data overflows its container
  	 */
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

