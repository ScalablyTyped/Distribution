package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A color scale for a treemap chart.
  */
trait SchemaTreemapChartColorScale extends StObject {
  
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not specified.
    */
  var maxValueColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and maxValue. Defaults to #efe6dc if not specified.
    */
  var midValueColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not specified.
    */
  var minValueColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    */
  var noDataColor: js.UndefOr[SchemaColor] = js.undefined
}
object SchemaTreemapChartColorScale {
  
  inline def apply(): SchemaTreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTreemapChartColorScale]
  }
  
  extension [Self <: SchemaTreemapChartColorScale](x: Self) {
    
    inline def setMaxValueColor(value: SchemaColor): Self = StObject.set(x, "maxValueColor", value.asInstanceOf[js.Any])
    
    inline def setMaxValueColorUndefined: Self = StObject.set(x, "maxValueColor", js.undefined)
    
    inline def setMidValueColor(value: SchemaColor): Self = StObject.set(x, "midValueColor", value.asInstanceOf[js.Any])
    
    inline def setMidValueColorUndefined: Self = StObject.set(x, "midValueColor", js.undefined)
    
    inline def setMinValueColor(value: SchemaColor): Self = StObject.set(x, "minValueColor", value.asInstanceOf[js.Any])
    
    inline def setMinValueColorUndefined: Self = StObject.set(x, "minValueColor", js.undefined)
    
    inline def setNoDataColor(value: SchemaColor): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    inline def setNoDataColorUndefined: Self = StObject.set(x, "noDataColor", js.undefined)
  }
}
