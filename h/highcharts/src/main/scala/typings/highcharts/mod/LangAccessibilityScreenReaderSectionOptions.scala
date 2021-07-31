package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityScreenReaderSectionOptions extends StObject {
  
  var afterRegionLabel: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language options for annotation
    * descriptions.
    */
  var annotations: js.UndefOr[LangAccessibilityScreenReaderSectionAnnotationsOptions] = js.undefined
  
  var beforeRegionLabel: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Label for the end of the chart.
    * Announced by screen readers.
    */
  var endOfChartMarker: js.UndefOr[String] = js.undefined
}
object LangAccessibilityScreenReaderSectionOptions {
  
  @scala.inline
  def apply(): LangAccessibilityScreenReaderSectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityScreenReaderSectionOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityScreenReaderSectionOptionsMutableBuilder[Self <: LangAccessibilityScreenReaderSectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRegionLabel(value: String): Self = StObject.set(x, "afterRegionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRegionLabelUndefined: Self = StObject.set(x, "afterRegionLabel", js.undefined)
    
    @scala.inline
    def setAnnotations(value: LangAccessibilityScreenReaderSectionAnnotationsOptions): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setBeforeRegionLabel(value: String): Self = StObject.set(x, "beforeRegionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRegionLabelUndefined: Self = StObject.set(x, "beforeRegionLabel", js.undefined)
    
    @scala.inline
    def setEndOfChartMarker(value: String): Self = StObject.set(x, "endOfChartMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfChartMarkerUndefined: Self = StObject.set(x, "endOfChartMarker", js.undefined)
  }
}
