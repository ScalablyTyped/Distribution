package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableDataSet extends StObject {
  
  /**
    * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
    */
  var minAlignmentPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Table display options for configuring how the table is rendered.
    */
  var tableDisplayOptions: js.UndefOr[SchemaTableDisplayOptions] = js.undefined
  
  /**
    * Optional. A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name\}, which will resolve to the label's value i.e. "${resource.labels.project_id\}."
    */
  var tableTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Fields for querying time series data from the Stackdriver metrics API.
    */
  var timeSeriesQuery: js.UndefOr[SchemaTimeSeriesQuery] = js.undefined
}
object SchemaTableDataSet {
  
  inline def apply(): SchemaTableDataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDataSet]
  }
  
  extension [Self <: SchemaTableDataSet](x: Self) {
    
    inline def setMinAlignmentPeriod(value: String): Self = StObject.set(x, "minAlignmentPeriod", value.asInstanceOf[js.Any])
    
    inline def setMinAlignmentPeriodNull: Self = StObject.set(x, "minAlignmentPeriod", null)
    
    inline def setMinAlignmentPeriodUndefined: Self = StObject.set(x, "minAlignmentPeriod", js.undefined)
    
    inline def setTableDisplayOptions(value: SchemaTableDisplayOptions): Self = StObject.set(x, "tableDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setTableDisplayOptionsUndefined: Self = StObject.set(x, "tableDisplayOptions", js.undefined)
    
    inline def setTableTemplate(value: String): Self = StObject.set(x, "tableTemplate", value.asInstanceOf[js.Any])
    
    inline def setTableTemplateNull: Self = StObject.set(x, "tableTemplate", null)
    
    inline def setTableTemplateUndefined: Self = StObject.set(x, "tableTemplate", js.undefined)
    
    inline def setTimeSeriesQuery(value: SchemaTimeSeriesQuery): Self = StObject.set(x, "timeSeriesQuery", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesQueryUndefined: Self = StObject.set(x, "timeSeriesQuery", js.undefined)
  }
}
