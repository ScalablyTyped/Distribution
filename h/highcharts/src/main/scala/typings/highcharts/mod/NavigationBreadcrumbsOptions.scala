package typings.highcharts.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBreadcrumbsOptions extends StObject {
  
  /**
    * (Highcharts) The default padding for each button and separator in each
    * direction.
    */
  var buttonSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) A collection of attributes for the buttons. The object takes
    * SVG attributes like `fill`, `stroke`, `stroke-width`, as well as `style`,
    * a collection of CSS properties for the text.
    *
    * The object can also be extended with states, so you can set
    * presentational options for `hover`, `select` or `disabled` button states.
    */
  var buttonTheme: js.UndefOr[NavigationBreadcrumbsButtonThemeOptions | SVGAttributes] = js.undefined
  
  var events: js.UndefOr[NavigationBreadcrumbsEventsOptions] = js.undefined
  
  /**
    * (Highcharts) When the breadcrumbs are floating, the plot area will not
    * move to make space for it. By default, the chart will not make space for
    * the buttons. This property won't work when positioned in the middle.
    */
  var floating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) A format string for the breadcrumbs button. Variables are
    * enclosed by curly brackets. Available values are passed in the declared
    * point options.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Callback function to format the breadcrumb text from
    * scratch.
    */
  var formatter: js.UndefOr[BreadcrumbsFormatterCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Positioning for the button row. The breadcrumbs
    * buttons will be aligned properly for the default chart layout (title,
    * subtitle, legend, range selector) for the custom chart layout set the
    * position properties.
    */
  var position: js.UndefOr[BreadcrumbsAlignOptions | NavigationBreadcrumbsPositionOptions] = js.undefined
  
  /**
    * (Highcharts, Highmaps) What box to align the button to. Can be either
    * `plotBox` or `spacingBox`.
    */
  var relativeTo: js.UndefOr[ButtonRelativeToValue] = js.undefined
  
  /**
    * (Highcharts) Whether to reverse the order of buttons. This is common in
    * Arabic and Hebrew.
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Options object for Breadcrumbs separator.
    */
  var separator: js.UndefOr[NavigationBreadcrumbsSeparatorOptions] = js.undefined
  
  /**
    * (Highcharts) Show full path or only a single button.
    */
  var showFullPath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) CSS styles for all breadcrumbs.
    *
    * In styled mode, the breadcrumbs buttons are styled by the
    * `.highcharts-breadcrumbs-buttons .highcharts-button` rule with its
    * different states.
    */
  var style: js.UndefOr[SVGAttributes] = js.undefined
  
  /**
    * (Highcharts) Whether to use HTML to render the breadcrumbs items texts.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) The z index of the breadcrumbs group.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object NavigationBreadcrumbsOptions {
  
  inline def apply(): NavigationBreadcrumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBreadcrumbsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationBreadcrumbsOptions] (val x: Self) extends AnyVal {
    
    inline def setButtonSpacing(value: Double): Self = StObject.set(x, "buttonSpacing", value.asInstanceOf[js.Any])
    
    inline def setButtonSpacingUndefined: Self = StObject.set(x, "buttonSpacing", js.undefined)
    
    inline def setButtonTheme(value: NavigationBreadcrumbsButtonThemeOptions | SVGAttributes): Self = StObject.set(x, "buttonTheme", value.asInstanceOf[js.Any])
    
    inline def setButtonThemeUndefined: Self = StObject.set(x, "buttonTheme", js.undefined)
    
    inline def setEvents(value: NavigationBreadcrumbsEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatter(value: (/* event */ Event, /* options */ BreadcrumbOptions) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setPosition(value: BreadcrumbsAlignOptions | NavigationBreadcrumbsPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRelativeTo(value: ButtonRelativeToValue): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setSeparator(value: NavigationBreadcrumbsSeparatorOptions): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setShowFullPath(value: Boolean): Self = StObject.set(x, "showFullPath", value.asInstanceOf[js.Any])
    
    inline def setShowFullPathUndefined: Self = StObject.set(x, "showFullPath", js.undefined)
    
    inline def setStyle(value: SVGAttributes): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    inline def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
