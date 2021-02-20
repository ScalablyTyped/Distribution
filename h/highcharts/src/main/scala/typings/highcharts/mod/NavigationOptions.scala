package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions extends StObject {
  
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
  implicit class NavigationOptionsMutableBuilder[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationsOptions(value: AnnotationsOptions | NavigationAnnotationsOptions): Self = StObject.set(x, "annotationsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsOptionsUndefined: Self = StObject.set(x, "annotationsOptions", js.undefined)
    
    @scala.inline
    def setBindings(value: NavigationBindingsOptions | Dictionary[NavigationBindingsOptionsObject]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsClassName(value: String): Self = StObject.set(x, "bindingsClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsClassNameUndefined: Self = StObject.set(x, "bindingsClassName", js.undefined)
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setButtonOptions(value: NavigationButtonOptions): Self = StObject.set(x, "buttonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonOptionsUndefined: Self = StObject.set(x, "buttonOptions", js.undefined)
    
    @scala.inline
    def setEvents(value: NavigationEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setIconsURL(value: String): Self = StObject.set(x, "iconsURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsURLUndefined: Self = StObject.set(x, "iconsURL", js.undefined)
    
    @scala.inline
    def setMenuItemHoverStyle(value: CSSObject): Self = StObject.set(x, "menuItemHoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemHoverStyleUndefined: Self = StObject.set(x, "menuItemHoverStyle", js.undefined)
    
    @scala.inline
    def setMenuItemStyle(value: CSSObject): Self = StObject.set(x, "menuItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemStyleUndefined: Self = StObject.set(x, "menuItemStyle", js.undefined)
    
    @scala.inline
    def setMenuStyle(value: CSSObject): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
  }
}
