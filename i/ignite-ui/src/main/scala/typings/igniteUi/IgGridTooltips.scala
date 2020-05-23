package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridTooltips
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A list of custom column settings that specify custom tooltip settings for a specific column (whether tooltips are enabled / disabled)
    *
    */
  var columnSettings: js.UndefOr[IgGridTooltipsColumnSettings] = js.undefined
  /**
    * Sets the left position of the tooltip relative to the mouse cursor
    *
    */
  var cursorLeftOffset: js.UndefOr[Double] = js.undefined
  /**
    * Sets the top position of the tooltip relative to the mouse cursor
    *
    */
  var cursorTopOffset: js.UndefOr[Double] = js.undefined
  /**
    * Sets the time tooltip fades in and out when showing/hiding
    *
    */
  var fadeTimespan: js.UndefOr[Double] = js.undefined
  /**
    * Type="integer" The time in milliseconds after which tooltip hides when mouse
    * cursor gets outside of the cell.
    *
    */
  var hideDelay: js.UndefOr[Double] = js.undefined
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
    * The time in milliseconds after which tooltip will show when
    * mouse cursor is hovered over a cell.
    *
    */
  var showDelay: js.UndefOr[Double] = js.undefined
  /**
    * Controls the tooltip's style
    *
    *
    * Valid values:
    * "tooltip" The tooltip will be positioned according to the mouse cursor. Will render the tooltip content as plain text.
    * "popover" The tooltip will be positioned according to the target element with an arrow pointing the element. This style is more suitable for touch-supported environments. Will render the tooltip content as HTML.
    */
  var style: js.UndefOr[String] = js.undefined
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
  var visibility: js.UndefOr[String] = js.undefined
}

object IgGridTooltips {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    columnSettings: IgGridTooltipsColumnSettings = null,
    cursorLeftOffset: js.UndefOr[Double] = js.undefined,
    cursorTopOffset: js.UndefOr[Double] = js.undefined,
    fadeTimespan: js.UndefOr[Double] = js.undefined,
    hideDelay: js.UndefOr[Double] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined,
    showDelay: js.UndefOr[Double] = js.undefined,
    style: String = null,
    tooltipHidden: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit = null,
    tooltipHiding: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit = null,
    tooltipShowing: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit = null,
    tooltipShown: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit = null,
    visibility: String = null
  ): IgGridTooltips = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorLeftOffset)) __obj.updateDynamic("cursorLeftOffset")(cursorLeftOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorTopOffset)) __obj.updateDynamic("cursorTopOffset")(cursorTopOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeTimespan)) __obj.updateDynamic("fadeTimespan")(fadeTimespan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDelay)) __obj.updateDynamic("hideDelay")(hideDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDelay)) __obj.updateDynamic("showDelay")(showDelay.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltipHidden != null) __obj.updateDynamic("tooltipHidden")(js.Any.fromFunction2(tooltipHidden))
    if (tooltipHiding != null) __obj.updateDynamic("tooltipHiding")(js.Any.fromFunction2(tooltipHiding))
    if (tooltipShowing != null) __obj.updateDynamic("tooltipShowing")(js.Any.fromFunction2(tooltipShowing))
    if (tooltipShown != null) __obj.updateDynamic("tooltipShown")(js.Any.fromFunction2(tooltipShown))
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridTooltips]
  }
}

