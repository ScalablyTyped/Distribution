package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.ExpressionSpecification
import typings.maplibreGl.maplibreGlStrings.`geometry-type`
import typings.maplibreGl.maplibreGlStrings.`heatmap-density`
import typings.maplibreGl.maplibreGlStrings.`line-progress`
import typings.maplibreGl.maplibreGlStrings.accumulated
import typings.maplibreGl.maplibreGlStrings.id
import typings.maplibreGl.maplibreGlStrings.ln2
import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.pi
import typings.maplibreGl.maplibreGlStrings.properties_
import typings.maplibreGl.maplibreGlStrings.viewport
import typings.maplibreGl.maplibreGlStrings.zoom
import typings.maplibreGl.styleSpecMod.ColorSpecification
import typings.maplibreGl.styleSpecMod.DataDrivenPropertyValueSpecification
import typings.maplibreGl.styleSpecMod.PropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circlecolor extends StObject {
  
  var `circle-blur`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `circle-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `circle-opacity`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `circle-pitch-alignment`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
  
  var `circle-pitch-scale`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
  
  var `circle-radius`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `circle-stroke-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `circle-stroke-opacity`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `circle-stroke-width`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `circle-translate`: js.UndefOr[PropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `circle-translate-anchor`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
}
object Circlecolor {
  
  inline def apply(): Circlecolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Circlecolor]
  }
  
  extension [Self <: Circlecolor](x: Self) {
    
    inline def `setCircle-blur`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-blur", value.asInstanceOf[js.Any])
    
    inline def `setCircle-blurUndefined`: Self = StObject.set(x, "circle-blur", js.undefined)
    
    inline def `setCircle-blurVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-blur", js.Array(value*))
    
    inline def `setCircle-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "circle-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-colorUndefined`: Self = StObject.set(x, "circle-color", js.undefined)
    
    inline def `setCircle-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-color", js.Array(value*))
    
    inline def `setCircle-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-opacityUndefined`: Self = StObject.set(x, "circle-opacity", js.undefined)
    
    inline def `setCircle-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-opacity", js.Array(value*))
    
    inline def `setCircle-pitch-alignment`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "circle-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-alignmentUndefined`: Self = StObject.set(x, "circle-pitch-alignment", js.undefined)
    
    inline def `setCircle-pitch-scale`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "circle-pitch-scale", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-scaleUndefined`: Self = StObject.set(x, "circle-pitch-scale", js.undefined)
    
    inline def `setCircle-radius`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-radius", value.asInstanceOf[js.Any])
    
    inline def `setCircle-radiusUndefined`: Self = StObject.set(x, "circle-radius", js.undefined)
    
    inline def `setCircle-radiusVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-radius", js.Array(value*))
    
    inline def `setCircle-stroke-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "circle-stroke-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-colorUndefined`: Self = StObject.set(x, "circle-stroke-color", js.undefined)
    
    inline def `setCircle-stroke-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-stroke-color", js.Array(value*))
    
    inline def `setCircle-stroke-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-opacityUndefined`: Self = StObject.set(x, "circle-stroke-opacity", js.undefined)
    
    inline def `setCircle-stroke-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-stroke-opacity", js.Array(value*))
    
    inline def `setCircle-stroke-width`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-widthUndefined`: Self = StObject.set(x, "circle-stroke-width", js.undefined)
    
    inline def `setCircle-stroke-widthVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-stroke-width", js.Array(value*))
    
    inline def `setCircle-translate`(value: PropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "circle-translate", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "circle-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-anchorUndefined`: Self = StObject.set(x, "circle-translate-anchor", js.undefined)
    
    inline def `setCircle-translateUndefined`: Self = StObject.set(x, "circle-translate", js.undefined)
  }
}
