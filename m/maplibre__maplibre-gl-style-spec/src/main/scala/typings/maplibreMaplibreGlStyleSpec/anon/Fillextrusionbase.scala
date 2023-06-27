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
import typings.maplibreMaplibreGlStyleSpec.mod.ResolvedImageSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fillextrusionbase extends StObject {
  
  var `fill-extrusion-base`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `fill-extrusion-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `fill-extrusion-height`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `fill-extrusion-opacity`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `fill-extrusion-pattern`: js.UndefOr[DataDrivenPropertyValueSpecification[ResolvedImageSpecification]] = js.undefined
  
  var `fill-extrusion-translate`: js.UndefOr[PropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `fill-extrusion-translate-anchor`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
  
  var `fill-extrusion-vertical-gradient`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
}
object Fillextrusionbase {
  
  inline def apply(): Fillextrusionbase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fillextrusionbase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fillextrusionbase] (val x: Self) extends AnyVal {
    
    inline def `setFill-extrusion-base`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "fill-extrusion-base", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-baseUndefined`: Self = StObject.set(x, "fill-extrusion-base", js.undefined)
    
    inline def `setFill-extrusion-baseVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-extrusion-base", js.Array(value*))
    
    inline def `setFill-extrusion-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "fill-extrusion-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-colorUndefined`: Self = StObject.set(x, "fill-extrusion-color", js.undefined)
    
    inline def `setFill-extrusion-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-extrusion-color", js.Array(value*))
    
    inline def `setFill-extrusion-height`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "fill-extrusion-height", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-heightUndefined`: Self = StObject.set(x, "fill-extrusion-height", js.undefined)
    
    inline def `setFill-extrusion-heightVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-extrusion-height", js.Array(value*))
    
    inline def `setFill-extrusion-opacity`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "fill-extrusion-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-opacityUndefined`: Self = StObject.set(x, "fill-extrusion-opacity", js.undefined)
    
    inline def `setFill-extrusion-pattern`(value: DataDrivenPropertyValueSpecification[ResolvedImageSpecification]): Self = StObject.set(x, "fill-extrusion-pattern", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-patternUndefined`: Self = StObject.set(x, "fill-extrusion-pattern", js.undefined)
    
    inline def `setFill-extrusion-patternVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-extrusion-pattern", js.Array(value*))
    
    inline def `setFill-extrusion-translate`(value: PropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "fill-extrusion-translate", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-translate-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "fill-extrusion-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-translate-anchorUndefined`: Self = StObject.set(x, "fill-extrusion-translate-anchor", js.undefined)
    
    inline def `setFill-extrusion-translateUndefined`: Self = StObject.set(x, "fill-extrusion-translate", js.undefined)
    
    inline def `setFill-extrusion-vertical-gradient`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "fill-extrusion-vertical-gradient", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-vertical-gradientUndefined`: Self = StObject.set(x, "fill-extrusion-vertical-gradient", js.undefined)
  }
}
