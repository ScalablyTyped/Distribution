package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
    * into all annotations.
    */
  var annotationsOptions: js.UndefOr[AnnotationsOptions | NavigationAnnotationsOptions] = js.native
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
  var bindings: js.UndefOr[NavigationBindingsOptions | Dictionary[NavigationBindingsOptionsObject]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name where all
    * bindings will be attached to. Multiple charts on the same page should
    * have separate class names to prevent duplicating events.
    *
    * Default value of versions < 7.0.4 `highcharts-bindings-wrapper`
    */
  var bindingsClassName: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
    * buttons appearing in the exporting module.
    *
    * In styled mode, the buttons are styled with the
    * `.highcharts-contextbutton` and `.highcharts-button-symbol` classes.
    */
  var buttonOptions: js.UndefOr[NavigationButtonOptions] = js.native
  /**
    * (Highcharts, Highstock) Events to communicate between Stock Tools and
    * custom GUI.
    */
  var events: js.UndefOr[NavigationEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
    * for icons. Change this to use icons from a different server.
    */
  var iconsURL: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the hover state
    * of the individual items within the popup menu appearing by default when
    * the export icon is clicked. The menu items are rendered in HTML.
    */
  var menuItemHoverStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the individual
    * items within the popup menu appearing by default when the export icon is
    * clicked. The menu items are rendered in HTML. Font size defaults to
    * `11px` on desktop and `14px` on touch devices.
    */
  var menuItemStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the popup menu
    * appearing by default when the export icon is clicked. This menu is
    * rendered in HTML.
    */
  var menuStyle: js.UndefOr[CSSObject] = js.native
}

object NavigationOptions {
  @scala.inline
  def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  @scala.inline
  implicit class NavigationOptionsOps[Self <: NavigationOptions] (val x: Self) extends AnyVal {
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
    def setAnnotationsOptions(value: AnnotationsOptions | NavigationAnnotationsOptions): Self = this.set("annotationsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationsOptions: Self = this.set("annotationsOptions", js.undefined)
    @scala.inline
    def setBindings(value: NavigationBindingsOptions | Dictionary[NavigationBindingsOptionsObject]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    @scala.inline
    def setBindingsClassName(value: String): Self = this.set("bindingsClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindingsClassName: Self = this.set("bindingsClassName", js.undefined)
    @scala.inline
    def setButtonOptions(value: NavigationButtonOptions): Self = this.set("buttonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonOptions: Self = this.set("buttonOptions", js.undefined)
    @scala.inline
    def setEvents(value: NavigationEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setIconsURL(value: String): Self = this.set("iconsURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconsURL: Self = this.set("iconsURL", js.undefined)
    @scala.inline
    def setMenuItemHoverStyle(value: CSSObject): Self = this.set("menuItemHoverStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemHoverStyle: Self = this.set("menuItemHoverStyle", js.undefined)
    @scala.inline
    def setMenuItemStyle(value: CSSObject): Self = this.set("menuItemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemStyle: Self = this.set("menuItemStyle", js.undefined)
    @scala.inline
    def setMenuStyle(value: CSSObject): Self = this.set("menuStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuStyle: Self = this.set("menuStyle", js.undefined)
  }
  
}

