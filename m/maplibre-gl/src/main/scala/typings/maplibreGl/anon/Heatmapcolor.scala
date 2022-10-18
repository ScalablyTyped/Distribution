package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.`geometry-type`
import typings.maplibreGl.maplibreGlStrings.`heatmap-density`
import typings.maplibreGl.maplibreGlStrings.`line-progress`
import typings.maplibreGl.maplibreGlStrings.accumulated
import typings.maplibreGl.maplibreGlStrings.id
import typings.maplibreGl.maplibreGlStrings.ln2
import typings.maplibreGl.maplibreGlStrings.pi
import typings.maplibreGl.maplibreGlStrings.properties
import typings.maplibreGl.maplibreGlStrings.zoom
import typings.maplibreGl.mod.DataDrivenPropertyValueSpecification
import typings.maplibreGl.mod.ExpressionSpecification
import typings.maplibreGl.mod.PropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heatmapcolor extends StObject {
  
  var `heatmap-color`: js.UndefOr[ExpressionSpecification] = js.undefined
  
  var `heatmap-intensity`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `heatmap-opacity`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `heatmap-radius`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `heatmap-weight`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
}
object Heatmapcolor {
  
  inline def apply(): Heatmapcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Heatmapcolor]
  }
  
  extension [Self <: Heatmapcolor](x: Self) {
    
    inline def `setHeatmap-color`(value: ExpressionSpecification): Self = StObject.set(x, "heatmap-color", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-colorUndefined`: Self = StObject.set(x, "heatmap-color", js.undefined)
    
    inline def `setHeatmap-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "heatmap-color", js.Array(value*))
    
    inline def `setHeatmap-intensity`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "heatmap-intensity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-intensityUndefined`: Self = StObject.set(x, "heatmap-intensity", js.undefined)
    
    inline def `setHeatmap-opacity`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "heatmap-opacity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-opacityUndefined`: Self = StObject.set(x, "heatmap-opacity", js.undefined)
    
    inline def `setHeatmap-radius`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "heatmap-radius", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-radiusUndefined`: Self = StObject.set(x, "heatmap-radius", js.undefined)
    
    inline def `setHeatmap-radiusVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "heatmap-radius", js.Array(value*))
    
    inline def `setHeatmap-weight`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "heatmap-weight", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-weightUndefined`: Self = StObject.set(x, "heatmap-weight", js.undefined)
    
    inline def `setHeatmap-weightVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "heatmap-weight", js.Array(value*))
  }
}
