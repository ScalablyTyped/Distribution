package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data
    * to screen reader users. Useful for dynamic data applications and
    * drilldown.
    *
    * Keep in mind that frequent announcements will not be useful to users, as
    * they won't have time to explore the new data. For these applications,
    * consider making snapshots of the data accessible, and do the
    * announcements in batches.
    */
  var announceNewData: js.UndefOr[AccessibilityAnnounceNewDataOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A hook for adding custom
    * components to the accessibility module. Should be an object mapping
    * component names to instances of classes inheriting from the
    * Highcharts.AccessibilityComponent base class. Remember to add the
    * component to the keyboardNavigation.order for the keyboard navigation to
    * be usable.
    */
  var customComponents: js.UndefOr[Any] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart.
    *
    * **Note: Prefer using linkedDescription or caption instead.**
    *
    * If the Accessibility module is loaded, this option is included by default
    * as a long description of the chart in the hidden screen reader
    * information region.
    *
    * Note: Since Highcharts now supports captions and linked descriptions, it
    * is preferred to define the description using those methods, as a visible
    * caption/description benefits all users. If the
    * `accessibility.description` option is defined, the linked description is
    * ignored, and the caption is hidden from screen reader users.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility
    * functionality for the chart. For more information on how to include these
    * features, and why this is recommended, see Highcharts Accessibility.
    *
    * Highcharts will by default emit a warning to the console if the
    * accessibility module is not loaded. Setting this option to `false` will
    * override and silence the warning.
    *
    * Once the module is loaded, setting this option to `false` will disable
    * the module for this chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Theme to apply to the chart when
    * Windows High Contrast Mode is detected. By default, a high contrast theme
    * matching the high contrast system system colors is used.
    */
  var highContrastTheme: js.UndefOr[Any] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
    */
  var keyboardNavigation: js.UndefOr[KeyboardNavigationOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Amount of landmarks/regions to
    * create for screen reader users. More landmarks can make navigation with
    * screen readers easier, but can be distracting if there are lots of charts
    * on the page. Three modes are available:
    *
    * - `all`: Adds regions for all series, legend, information region.
    *
    * - `one`: Adds a single landmark per chart.
    *
    * - `disabled`: No landmarks are added.
    */
  var landmarkVerbosity: js.UndefOr[OptionsLandmarkVerbosityValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Link the chart to an HTML
    * element describing the contents of the chart.
    *
    * It is always recommended to describe charts using visible text, to
    * improve SEO as well as accessibility for users with disabilities. This
    * option lets an HTML element with a description be linked to the chart, so
    * that screen reader users can connect the two.
    *
    * By setting this option to a string, Highcharts runs the string as an HTML
    * selector query on the entire document. If there is only a single match,
    * this element is linked to the chart. The content of the linked element
    * will be included in the chart description for screen reader users.
    *
    * By default, the chart looks for an adjacent sibling element with the
    * `highcharts-description` class.
    *
    * The feature can be disabled by setting the option to an empty string, or
    * overridden by providing the accessibility.description option.
    * Alternatively, the HTML element to link can be passed in directly as an
    * HTML node.
    *
    * If you need the description to be part of the exported image, consider
    * using the caption feature.
    *
    * If you need the description to be hidden visually, use the
    * accessibility.description option.
    */
  var linkedDescription: js.UndefOr[String | HTMLDOMElement] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for descriptions of
    * individual data points.
    */
  var point: js.UndefOr[AccessibilityPointOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
    * screen reader information sections added before and after the chart.
    */
  var screenReaderSection: js.UndefOr[AccessibilityScreenReaderSectionOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options global to
    * all data series. Individual series can also have specific accessibility
    * options set.
    */
  var series: js.UndefOr[AccessibilitySeriesOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart
    * type.
    *
    * If the Accessibility module is loaded, this will be included in the
    * description of the chart in the screen reader information region.
    *
    * Highcharts will by default attempt to guess the chart type, but for more
    * complex charts it is recommended to specify this property for clarity.
    */
  var typeDescription: js.UndefOr[String] = js.undefined
}
object AccessibilityOptions {
  
  inline def apply(): AccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityOptions] (val x: Self) extends AnyVal {
    
    inline def setAnnounceNewData(value: AccessibilityAnnounceNewDataOptionsObject): Self = StObject.set(x, "announceNewData", value.asInstanceOf[js.Any])
    
    inline def setAnnounceNewDataUndefined: Self = StObject.set(x, "announceNewData", js.undefined)
    
    inline def setCustomComponents(value: Any): Self = StObject.set(x, "customComponents", value.asInstanceOf[js.Any])
    
    inline def setCustomComponentsUndefined: Self = StObject.set(x, "customComponents", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHighContrastTheme(value: Any): Self = StObject.set(x, "highContrastTheme", value.asInstanceOf[js.Any])
    
    inline def setHighContrastThemeUndefined: Self = StObject.set(x, "highContrastTheme", js.undefined)
    
    inline def setKeyboardNavigation(value: KeyboardNavigationOptionsObject): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
    
    inline def setLandmarkVerbosity(value: OptionsLandmarkVerbosityValue): Self = StObject.set(x, "landmarkVerbosity", value.asInstanceOf[js.Any])
    
    inline def setLandmarkVerbosityUndefined: Self = StObject.set(x, "landmarkVerbosity", js.undefined)
    
    inline def setLinkedDescription(value: String | HTMLDOMElement): Self = StObject.set(x, "linkedDescription", value.asInstanceOf[js.Any])
    
    inline def setLinkedDescriptionUndefined: Self = StObject.set(x, "linkedDescription", js.undefined)
    
    inline def setPoint(value: AccessibilityPointOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setScreenReaderSection(value: AccessibilityScreenReaderSectionOptions): Self = StObject.set(x, "screenReaderSection", value.asInstanceOf[js.Any])
    
    inline def setScreenReaderSectionUndefined: Self = StObject.set(x, "screenReaderSection", js.undefined)
    
    inline def setSeries(value: AccessibilitySeriesOptions): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setTypeDescription(value: String): Self = StObject.set(x, "typeDescription", value.asInstanceOf[js.Any])
    
    inline def setTypeDescriptionUndefined: Self = StObject.set(x, "typeDescription", js.undefined)
  }
}
