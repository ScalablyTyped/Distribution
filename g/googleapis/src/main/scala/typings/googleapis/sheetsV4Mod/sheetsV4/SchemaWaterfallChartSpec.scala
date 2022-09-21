package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWaterfallChartSpec extends StObject {
  
  /**
    * The line style for the connector lines.
    */
  var connectorLineStyle: js.UndefOr[SchemaLineStyle] = js.undefined
  
  /**
    * The domain data (horizontal axis) for the waterfall chart.
    */
  var domain: js.UndefOr[SchemaWaterfallChartDomain] = js.undefined
  
  /**
    * True to interpret the first value as a total.
    */
  var firstValueIsTotal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True to hide connector lines between columns.
    */
  var hideConnectorLines: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The data this waterfall chart is visualizing.
    */
  var series: js.UndefOr[js.Array[SchemaWaterfallChartSeries]] = js.undefined
  
  /**
    * The stacked type.
    */
  var stackedType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls whether to display additional data labels on stacked charts which sum the total value of all stacked values at each value along the domain axis. stacked_type must be STACKED and neither CUSTOM nor placement can be set on the total_data_label.
    */
  var totalDataLabel: js.UndefOr[SchemaDataLabel] = js.undefined
}
object SchemaWaterfallChartSpec {
  
  inline def apply(): SchemaWaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartSpec]
  }
  
  extension [Self <: SchemaWaterfallChartSpec](x: Self) {
    
    inline def setConnectorLineStyle(value: SchemaLineStyle): Self = StObject.set(x, "connectorLineStyle", value.asInstanceOf[js.Any])
    
    inline def setConnectorLineStyleUndefined: Self = StObject.set(x, "connectorLineStyle", js.undefined)
    
    inline def setDomain(value: SchemaWaterfallChartDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setFirstValueIsTotal(value: Boolean): Self = StObject.set(x, "firstValueIsTotal", value.asInstanceOf[js.Any])
    
    inline def setFirstValueIsTotalNull: Self = StObject.set(x, "firstValueIsTotal", null)
    
    inline def setFirstValueIsTotalUndefined: Self = StObject.set(x, "firstValueIsTotal", js.undefined)
    
    inline def setHideConnectorLines(value: Boolean): Self = StObject.set(x, "hideConnectorLines", value.asInstanceOf[js.Any])
    
    inline def setHideConnectorLinesNull: Self = StObject.set(x, "hideConnectorLines", null)
    
    inline def setHideConnectorLinesUndefined: Self = StObject.set(x, "hideConnectorLines", js.undefined)
    
    inline def setSeries(value: js.Array[SchemaWaterfallChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: SchemaWaterfallChartSeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setStackedType(value: String): Self = StObject.set(x, "stackedType", value.asInstanceOf[js.Any])
    
    inline def setStackedTypeNull: Self = StObject.set(x, "stackedType", null)
    
    inline def setStackedTypeUndefined: Self = StObject.set(x, "stackedType", js.undefined)
    
    inline def setTotalDataLabel(value: SchemaDataLabel): Self = StObject.set(x, "totalDataLabel", value.asInstanceOf[js.Any])
    
    inline def setTotalDataLabelUndefined: Self = StObject.set(x, "totalDataLabel", js.undefined)
  }
}
