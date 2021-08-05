package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A waterfall chart.
  */
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
  var firstValueIsTotal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True to hide connector lines between columns.
    */
  var hideConnectorLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The data this waterfall chart is visualizing.
    */
  var series: js.UndefOr[js.Array[SchemaWaterfallChartSeries]] = js.undefined
  
  /**
    * The stacked type.
    */
  var stackedType: js.UndefOr[String] = js.undefined
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
    
    inline def setFirstValueIsTotalUndefined: Self = StObject.set(x, "firstValueIsTotal", js.undefined)
    
    inline def setHideConnectorLines(value: Boolean): Self = StObject.set(x, "hideConnectorLines", value.asInstanceOf[js.Any])
    
    inline def setHideConnectorLinesUndefined: Self = StObject.set(x, "hideConnectorLines", js.undefined)
    
    inline def setSeries(value: js.Array[SchemaWaterfallChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: SchemaWaterfallChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    inline def setStackedType(value: String): Self = StObject.set(x, "stackedType", value.asInstanceOf[js.Any])
    
    inline def setStackedTypeUndefined: Self = StObject.set(x, "stackedType", js.undefined)
  }
}
