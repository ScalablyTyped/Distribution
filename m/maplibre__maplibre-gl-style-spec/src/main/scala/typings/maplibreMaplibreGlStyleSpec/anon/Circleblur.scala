package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ExpressionSpecification
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`geometry-type`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`heatmap-density`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`line-progress`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.accumulated
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.id
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ln2
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.map
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.pi
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.properties
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.viewport
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.zoom
import typings.maplibreMaplibreGlStyleSpec.mod.ColorSpecification
import typings.maplibreMaplibreGlStyleSpec.mod.DataDrivenPropertyValueSpecification
import typings.maplibreMaplibreGlStyleSpec.mod.PropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circleblur extends StObject {
  
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
object Circleblur {
  
  inline def apply(): Circleblur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Circleblur]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Circleblur] (val x: Self) extends AnyVal {
    
    inline def `setCircle-blur`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-blur", value.asInstanceOf[js.Any])
    
    inline def `setCircle-blurUndefined`: Self = StObject.set(x, "circle-blur", js.undefined)
    
    inline def `setCircle-blurVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-blur", js.Array(value*))
    
    inline def `setCircle-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "circle-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-colorUndefined`: Self = StObject.set(x, "circle-color", js.undefined)
    
    inline def `setCircle-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-color", js.Array(value*))
    
    inline def `setCircle-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-opacityUndefined`: Self = StObject.set(x, "circle-opacity", js.undefined)
    
    inline def `setCircle-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-opacity", js.Array(value*))
    
    inline def `setCircle-pitch-alignment`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "circle-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-alignmentUndefined`: Self = StObject.set(x, "circle-pitch-alignment", js.undefined)
    
    inline def `setCircle-pitch-scale`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "circle-pitch-scale", value.asInstanceOf[js.Any])
    
    inline def `setCircle-pitch-scaleUndefined`: Self = StObject.set(x, "circle-pitch-scale", js.undefined)
    
    inline def `setCircle-radius`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-radius", value.asInstanceOf[js.Any])
    
    inline def `setCircle-radiusUndefined`: Self = StObject.set(x, "circle-radius", js.undefined)
    
    inline def `setCircle-radiusVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-radius", js.Array(value*))
    
    inline def `setCircle-stroke-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "circle-stroke-color", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-colorUndefined`: Self = StObject.set(x, "circle-stroke-color", js.undefined)
    
    inline def `setCircle-stroke-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-stroke-color", js.Array(value*))
    
    inline def `setCircle-stroke-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-opacityUndefined`: Self = StObject.set(x, "circle-stroke-opacity", js.undefined)
    
    inline def `setCircle-stroke-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-stroke-opacity", js.Array(value*))
    
    inline def `setCircle-stroke-width`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setCircle-stroke-widthUndefined`: Self = StObject.set(x, "circle-stroke-width", js.undefined)
    
    inline def `setCircle-stroke-widthVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-stroke-width", js.Array(value*))
    
    inline def `setCircle-translate`(value: PropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "circle-translate", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "circle-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setCircle-translate-anchorUndefined`: Self = StObject.set(x, "circle-translate-anchor", js.undefined)
    
    inline def `setCircle-translateUndefined`: Self = StObject.set(x, "circle-translate", js.undefined)
  }
}
