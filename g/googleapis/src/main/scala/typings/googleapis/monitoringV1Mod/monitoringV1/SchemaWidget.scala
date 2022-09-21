package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWidget extends StObject {
  
  /**
    * A chart of alert policy data.
    */
  var alertChart: js.UndefOr[SchemaAlertChart] = js.undefined
  
  /**
    * A blank space.
    */
  var blank: js.UndefOr[SchemaEmpty] = js.undefined
  
  /**
    * A widget that groups the other widgets. All widgets that are within the area spanned by the grouping widget are considered member widgets.
    */
  var collapsibleGroup: js.UndefOr[SchemaCollapsibleGroup] = js.undefined
  
  /**
    * A widget that shows a stream of logs.
    */
  var logsPanel: js.UndefOr[SchemaLogsPanel] = js.undefined
  
  /**
    * A scorecard summarizing time series data.
    */
  var scorecard: js.UndefOr[SchemaScorecard] = js.undefined
  
  /**
    * A raw string or markdown displaying textual content.
    */
  var text: js.UndefOr[SchemaText] = js.undefined
  
  /**
    * A widget that displays time series data in a tabular format.
    */
  var timeSeriesTable: js.UndefOr[SchemaTimeSeriesTable] = js.undefined
  
  /**
    * Optional. The title of the widget.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A chart of time series data.
    */
  var xyChart: js.UndefOr[SchemaXyChart] = js.undefined
}
object SchemaWidget {
  
  inline def apply(): SchemaWidget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWidget]
  }
  
  extension [Self <: SchemaWidget](x: Self) {
    
    inline def setAlertChart(value: SchemaAlertChart): Self = StObject.set(x, "alertChart", value.asInstanceOf[js.Any])
    
    inline def setAlertChartUndefined: Self = StObject.set(x, "alertChart", js.undefined)
    
    inline def setBlank(value: SchemaEmpty): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
    
    inline def setBlankUndefined: Self = StObject.set(x, "blank", js.undefined)
    
    inline def setCollapsibleGroup(value: SchemaCollapsibleGroup): Self = StObject.set(x, "collapsibleGroup", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleGroupUndefined: Self = StObject.set(x, "collapsibleGroup", js.undefined)
    
    inline def setLogsPanel(value: SchemaLogsPanel): Self = StObject.set(x, "logsPanel", value.asInstanceOf[js.Any])
    
    inline def setLogsPanelUndefined: Self = StObject.set(x, "logsPanel", js.undefined)
    
    inline def setScorecard(value: SchemaScorecard): Self = StObject.set(x, "scorecard", value.asInstanceOf[js.Any])
    
    inline def setScorecardUndefined: Self = StObject.set(x, "scorecard", js.undefined)
    
    inline def setText(value: SchemaText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTimeSeriesTable(value: SchemaTimeSeriesTable): Self = StObject.set(x, "timeSeriesTable", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesTableUndefined: Self = StObject.set(x, "timeSeriesTable", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setXyChart(value: SchemaXyChart): Self = StObject.set(x, "xyChart", value.asInstanceOf[js.Any])
    
    inline def setXyChartUndefined: Self = StObject.set(x, "xyChart", js.undefined)
  }
}
