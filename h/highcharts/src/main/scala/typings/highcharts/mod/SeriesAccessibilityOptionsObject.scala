package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesAccessibilityOptionsObject extends StObject {
  
  /**
    * (Highstock) Provide a description of the series, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Enable/disable accessibility functionality for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Expose only the series element to screen readers, not its
    * points.
    */
  var exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Keyboard navigation for a series
    */
  var keyboardNavigation: js.UndefOr[SeriesAccessibilityKeyboardNavigationOptionsObject] = js.undefined
  
  /**
    * (Highstock) Formatter function to use instead of the default for point
    * descriptions. Same as `accessibility.point.descriptionFormatter`, but for
    * a single series.
    */
  var pointDescriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.undefined
}
object SeriesAccessibilityOptionsObject {
  
  @scala.inline
  def apply(): SeriesAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesAccessibilityOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesAccessibilityOptionsObjectMutableBuilder[Self <: SeriesAccessibilityOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExposeAsGroupOnly(value: Boolean): Self = StObject.set(x, "exposeAsGroupOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeAsGroupOnlyUndefined: Self = StObject.set(x, "exposeAsGroupOnly", js.undefined)
    
    @scala.inline
    def setKeyboardNavigation(value: SeriesAccessibilityKeyboardNavigationOptionsObject): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
    
    @scala.inline
    def setPointDescriptionFormatter(value: Point => String): Self = StObject.set(x, "pointDescriptionFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointDescriptionFormatterUndefined: Self = StObject.set(x, "pointDescriptionFormatter", js.undefined)
  }
}
