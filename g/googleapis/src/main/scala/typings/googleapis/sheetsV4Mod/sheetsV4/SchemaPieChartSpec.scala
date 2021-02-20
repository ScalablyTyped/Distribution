package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A &lt;a href=&quot;/chart/interactive/docs/gallery/piechart&quot;&gt;pie
  * chart&lt;/a&gt;.
  */
@js.native
trait SchemaPieChartSpec extends StObject {
  
  /**
    * The data that covers the domain of the pie chart.
    */
  var domain: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * Where the legend of the pie chart should be drawn.
    */
  var legendPosition: js.UndefOr[String] = js.native
  
  /**
    * The size of the hole in the pie chart.
    */
  var pieHole: js.UndefOr[Double] = js.native
  
  /**
    * The data that covers the one and only series of the pie chart.
    */
  var series: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * True if the pie is three dimensional.
    */
  var threeDimensional: js.UndefOr[Boolean] = js.native
}
object SchemaPieChartSpec {
  
  @scala.inline
  def apply(): SchemaPieChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPieChartSpec]
  }
  
  @scala.inline
  implicit class SchemaPieChartSpecMutableBuilder[Self <: SchemaPieChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: SchemaChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    @scala.inline
    def setPieHole(value: Double): Self = StObject.set(x, "pieHole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieHoleUndefined: Self = StObject.set(x, "pieHole", js.undefined)
    
    @scala.inline
    def setSeries(value: SchemaChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setThreeDimensional(value: Boolean): Self = StObject.set(x, "threeDimensional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDimensionalUndefined: Self = StObject.set(x, "threeDimensional", js.undefined)
  }
}
