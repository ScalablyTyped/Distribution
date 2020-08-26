package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridTooltips
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A list of custom column settings that specify custom tooltip settings for a specific column (whether tooltips are enabled / disabled)
    *
    */
  var columnSettings: js.UndefOr[IgGridTooltipsColumnSettings] = js.native
  /**
    * Sets the left position of the tooltip relative to the mouse cursor
    *
    */
  var cursorLeftOffset: js.UndefOr[Double] = js.native
  /**
    * Sets the top position of the tooltip relative to the mouse cursor
    *
    */
  var cursorTopOffset: js.UndefOr[Double] = js.native
  /**
    * Sets the time tooltip fades in and out when showing/hiding
    *
    */
  var fadeTimespan: js.UndefOr[Double] = js.native
  /**
    * Type="integer" The time in milliseconds after which tooltip hides when mouse
    * cursor gets outside of the cell.
    *
    */
  var hideDelay: js.UndefOr[Double] = js.native
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * The time in milliseconds after which tooltip will show when
    * mouse cursor is hovered over a cell.
    *
    */
  var showDelay: js.UndefOr[Double] = js.native
  /**
    * Controls the tooltip's style
    *
    *
    * Valid values:
    * "tooltip" The tooltip will be positioned according to the mouse cursor. Will render the tooltip content as plain text.
    * "popover" The tooltip will be positioned according to the target element with an arrow pointing the element. This style is more suitable for touch-supported environments. Will render the tooltip content as HTML.
    */
  var style: js.UndefOr[String] = js.native
  /**
    * Event fired after a tooltip is hidden
    */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  /**
    * Event fired when the mouse has left an element and the tooltip is about to hide
    */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  /**
    * Event fired when the mouse has hovered on an element long enough to display a tooltip
    */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  /**
    * Event fired after a tooltip is shown
    */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  /**
    * Determines the tooltip visibility option
    *
    *
    * Valid values:
    * "always" tooltips always show for hovered elements
    * "never" tooltips do not show automatically
    * "overflow" tooltips show only when the underlying data overflows its container
    */
  var visibility: js.UndefOr[String] = js.native
}

object IgGridTooltips {
  @scala.inline
  def apply(): IgGridTooltips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridTooltips]
  }
  @scala.inline
  implicit class IgGridTooltipsOps[Self <: IgGridTooltips] (val x: Self) extends AnyVal {
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
    def setColumnSettings(value: IgGridTooltipsColumnSettings): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setCursorLeftOffset(value: Double): Self = this.set("cursorLeftOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorLeftOffset: Self = this.set("cursorLeftOffset", js.undefined)
    @scala.inline
    def setCursorTopOffset(value: Double): Self = this.set("cursorTopOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorTopOffset: Self = this.set("cursorTopOffset", js.undefined)
    @scala.inline
    def setFadeTimespan(value: Double): Self = this.set("fadeTimespan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeTimespan: Self = this.set("fadeTimespan", js.undefined)
    @scala.inline
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDelay: Self = this.set("hideDelay", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setShowDelay(value: Double): Self = this.set("showDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDelay: Self = this.set("showDelay", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = this.set("tooltipHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTooltipHidden: Self = this.set("tooltipHidden", js.undefined)
    @scala.inline
    def setTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = this.set("tooltipHiding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTooltipHiding: Self = this.set("tooltipHiding", js.undefined)
    @scala.inline
    def setTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = this.set("tooltipShowing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTooltipShowing: Self = this.set("tooltipShowing", js.undefined)
    @scala.inline
    def setTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = this.set("tooltipShown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTooltipShown: Self = this.set("tooltipShown", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

