package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A histogram series containing the series color and data.
  */
trait SchemaHistogramSeries extends StObject {
  
  /**
    * The color of the column representing this series in each bucket. This
    * field is optional.
    */
  var barColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The data for this histogram series.
    */
  var data: js.UndefOr[SchemaChartData] = js.undefined
}
object SchemaHistogramSeries {
  
  inline def apply(): SchemaHistogramSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramSeries]
  }
  
  extension [Self <: SchemaHistogramSeries](x: Self) {
    
    inline def setBarColor(value: SchemaColor): Self = StObject.set(x, "barColor", value.asInstanceOf[js.Any])
    
    inline def setBarColorUndefined: Self = StObject.set(x, "barColor", js.undefined)
    
    inline def setData(value: SchemaChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
