package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
    * into all annotations.
    */
  var annotationsOptions: js.UndefOr[AnnotationsOptions | NavigationAnnotationsOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Bindings definitions for custom HTML buttons.
    * Each binding implements simple event-driven interface:
    *
    * - `className`: classname used to bind event to
    *
    * - `init`: initial event, fired on button click
    *
    * - `start`: fired on first click on a chart
    *
    * - `steps`: array of sequential events fired one after another on each of
    * users clicks
    *
    * - `end`: last event to be called after last step event
    */
  var bindings: js.UndefOr[NavigationBindingsOptions | Dictionary[StockToolsBindingsObject]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name where all
    * bindings will be attached to. Multiple charts on the same page should
    * have separate class names to prevent duplicating events.
    *
    * Default value of versions < 7.0.4 `highcharts-bindings-wrapper`
    */
  var bindingsClassName: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
    * buttons appearing in the exporting module.
    *
    * In styled mode, the buttons are styled with the
    * `.highcharts-contextbutton` and `.highcharts-button-symbol` classes.
    */
  var buttonOptions: js.UndefOr[NavigationButtonOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Events to communicate between Stock Tools and
    * custom GUI.
    */
  var events: js.UndefOr[NavigationEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the hover state
    * of the individual items within the popup menu appearing by default when
    * the export icon is clicked. The menu items are rendered in HTML.
    */
  var menuItemHoverStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the individual
    * items within the popup menu appearing by default when the export icon is
    * clicked. The menu items are rendered in HTML. Font size defaults to
    * `11px` on desktop and `14px` on touch devices.
    */
  var menuItemStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the popup menu
    * appearing by default when the export icon is clicked. This menu is
    * rendered in HTML.
    */
  var menuStyle: js.UndefOr[CSSObject] = js.undefined
}

object NavigationOptions {
  @scala.inline
  def apply(
    annotationsOptions: AnnotationsOptions | NavigationAnnotationsOptions = null,
    bindings: NavigationBindingsOptions | Dictionary[StockToolsBindingsObject] = null,
    bindingsClassName: String = null,
    buttonOptions: NavigationButtonOptions = null,
    events: NavigationEventsOptions = null,
    menuItemHoverStyle: CSSObject = null,
    menuItemStyle: CSSObject = null,
    menuStyle: CSSObject = null
  ): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (annotationsOptions != null) __obj.updateDynamic("annotationsOptions")(annotationsOptions.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (bindingsClassName != null) __obj.updateDynamic("bindingsClassName")(bindingsClassName)
    if (buttonOptions != null) __obj.updateDynamic("buttonOptions")(buttonOptions)
    if (events != null) __obj.updateDynamic("events")(events)
    if (menuItemHoverStyle != null) __obj.updateDynamic("menuItemHoverStyle")(menuItemHoverStyle)
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    __obj.asInstanceOf[NavigationOptions]
  }
}

