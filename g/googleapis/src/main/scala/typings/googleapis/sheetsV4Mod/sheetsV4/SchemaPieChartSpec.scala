package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPieChartSpec extends StObject {
  
  /**
    * The data that covers the domain of the pie chart.
    */
  var domain: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * Where the legend of the pie chart should be drawn.
    */
  var legendPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the hole in the pie chart.
    */
  var pieHole: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The data that covers the one and only series of the pie chart.
    */
  var series: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * True if the pie is three dimensional.
    */
  var threeDimensional: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPieChartSpec {
  
  inline def apply(): SchemaPieChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPieChartSpec]
  }
  
  extension [Self <: SchemaPieChartSpec](x: Self) {
    
    inline def setDomain(value: SchemaChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setLegendPositionNull: Self = StObject.set(x, "legendPosition", null)
    
    inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    inline def setPieHole(value: Double): Self = StObject.set(x, "pieHole", value.asInstanceOf[js.Any])
    
    inline def setPieHoleNull: Self = StObject.set(x, "pieHole", null)
    
    inline def setPieHoleUndefined: Self = StObject.set(x, "pieHole", js.undefined)
    
    inline def setSeries(value: SchemaChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setThreeDimensional(value: Boolean): Self = StObject.set(x, "threeDimensional", value.asInstanceOf[js.Any])
    
    inline def setThreeDimensionalNull: Self = StObject.set(x, "threeDimensional", null)
    
    inline def setThreeDimensionalUndefined: Self = StObject.set(x, "threeDimensional", js.undefined)
  }
}
