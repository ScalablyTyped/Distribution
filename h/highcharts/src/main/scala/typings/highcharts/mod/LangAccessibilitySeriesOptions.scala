package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilitySeriesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) User supplied description text.
    * This is added in the point comment description by default if present.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Description for the value of
    * null points.
    */
  var nullPointValue: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Description for annotations on a
    * point, as it is made available to assistive technology.
    */
  var pointAnnotationsDescription: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the
    * series main summary. Each series type has two modes:
    *
    * 1. This series type is the only series type used in the chart
    *
    * 2. This is a combination chart with multiple series types
    *
    * If a definition does not exist for the specific series type and mode, the
    * 'default' lang definitions are used.
    */
  var summary: js.UndefOr[LangAccessibilitySeriesSummaryOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) xAxis description for series if
    * there are multiple xAxes in the chart.
    */
  var xAxisDescription: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) yAxis description for series if
    * there are multiple yAxes in the chart.
    */
  var yAxisDescription: js.UndefOr[String] = js.native
}
object LangAccessibilitySeriesOptions {
  
  @scala.inline
  def apply(): LangAccessibilitySeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySeriesOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilitySeriesOptionsMutableBuilder[Self <: LangAccessibilitySeriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setNullPointValue(value: String): Self = StObject.set(x, "nullPointValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullPointValueUndefined: Self = StObject.set(x, "nullPointValue", js.undefined)
    
    @scala.inline
    def setPointAnnotationsDescription(value: String): Self = StObject.set(x, "pointAnnotationsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointAnnotationsDescriptionUndefined: Self = StObject.set(x, "pointAnnotationsDescription", js.undefined)
    
    @scala.inline
    def setSummary(value: LangAccessibilitySeriesSummaryOptions): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setXAxisDescription(value: String): Self = StObject.set(x, "xAxisDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisDescriptionUndefined: Self = StObject.set(x, "xAxisDescription", js.undefined)
    
    @scala.inline
    def setYAxisDescription(value: String): Self = StObject.set(x, "yAxisDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisDescriptionUndefined: Self = StObject.set(x, "yAxisDescription", js.undefined)
  }
}
