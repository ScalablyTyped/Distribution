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
import typings.maplibreGl.mod.ColorSpecification
import typings.maplibreGl.mod.DataDrivenPropertyValueSpecification
import typings.maplibreGl.mod.PropertyValueSpecification
import typings.maplibreGl.mod.ResolvedImageSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fillantialias extends StObject {
  
  var `fill-antialias`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `fill-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `fill-opacity`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `fill-outline-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `fill-pattern`: js.UndefOr[DataDrivenPropertyValueSpecification[ResolvedImageSpecification]] = js.undefined
  
  var `fill-translate`: js.UndefOr[PropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `fill-translate-anchor`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
}
object Fillantialias {
  
  inline def apply(): Fillantialias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fillantialias]
  }
  
  extension [Self <: Fillantialias](x: Self) {
    
    inline def `setFill-antialias`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "fill-antialias", value.asInstanceOf[js.Any])
    
    inline def `setFill-antialiasUndefined`: Self = StObject.set(x, "fill-antialias", js.undefined)
    
    inline def `setFill-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "fill-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-colorUndefined`: Self = StObject.set(x, "fill-color", js.undefined)
    
    inline def `setFill-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-color", js.Array(value*))
    
    inline def `setFill-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def `setFill-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-opacity", js.Array(value*))
    
    inline def `setFill-outline-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "fill-outline-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-outline-colorUndefined`: Self = StObject.set(x, "fill-outline-color", js.undefined)
    
    inline def `setFill-outline-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-outline-color", js.Array(value*))
    
    inline def `setFill-pattern`(value: DataDrivenPropertyValueSpecification[ResolvedImageSpecification]): Self = StObject.set(x, "fill-pattern", value.asInstanceOf[js.Any])
    
    inline def `setFill-patternUndefined`: Self = StObject.set(x, "fill-pattern", js.undefined)
    
    inline def `setFill-patternVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-pattern", js.Array(value*))
    
    inline def `setFill-translate`(value: PropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "fill-translate", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "fill-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-anchorUndefined`: Self = StObject.set(x, "fill-translate-anchor", js.undefined)
    
    inline def `setFill-translateUndefined`: Self = StObject.set(x, "fill-translate", js.undefined)
  }
}
