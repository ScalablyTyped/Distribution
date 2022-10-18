package typings.maplibreGl.anon

import typings.maplibreGl.distStyleSpecMod.ColorSpecification
import typings.maplibreGl.distStyleSpecMod.DataDrivenPropertyValueSpecification
import typings.maplibreGl.distStyleSpecMod.ExpressionSpecification
import typings.maplibreGl.distStyleSpecMod.PropertyValueSpecification
import typings.maplibreGl.distStyleSpecMod.ResolvedImageSpecification
import typings.maplibreGl.maplibreGlStrings.`geometry-type`
import typings.maplibreGl.maplibreGlStrings.`heatmap-density`
import typings.maplibreGl.maplibreGlStrings.`line-progress`
import typings.maplibreGl.maplibreGlStrings.accumulated
import typings.maplibreGl.maplibreGlStrings.id
import typings.maplibreGl.maplibreGlStrings.ln2
import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.pi
import typings.maplibreGl.maplibreGlStrings.properties
import typings.maplibreGl.maplibreGlStrings.viewport
import typings.maplibreGl.maplibreGlStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linecolor extends StObject {
  
  var `line-blur`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `line-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `line-dasharray`: js.UndefOr[PropertyValueSpecification[js.Array[Double]]] = js.undefined
  
  var `line-gap-width`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `line-gradient`: js.UndefOr[ExpressionSpecification] = js.undefined
  
  var `line-offset`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `line-opacity`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `line-pattern`: js.UndefOr[DataDrivenPropertyValueSpecification[ResolvedImageSpecification]] = js.undefined
  
  var `line-translate`: js.UndefOr[PropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `line-translate-anchor`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
  
  var `line-width`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
}
object Linecolor {
  
  inline def apply(): Linecolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Linecolor]
  }
  
  extension [Self <: Linecolor](x: Self) {
    
    inline def `setLine-blur`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "line-blur", value.asInstanceOf[js.Any])
    
    inline def `setLine-blurUndefined`: Self = StObject.set(x, "line-blur", js.undefined)
    
    inline def `setLine-blurVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-blur", js.Array(value*))
    
    inline def `setLine-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    inline def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    inline def `setLine-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-color", js.Array(value*))
    
    inline def `setLine-dasharray`(value: PropertyValueSpecification[js.Array[Double]]): Self = StObject.set(x, "line-dasharray", value.asInstanceOf[js.Any])
    
    inline def `setLine-dasharrayUndefined`: Self = StObject.set(x, "line-dasharray", js.undefined)
    
    inline def `setLine-dasharrayVarargs`(value: Double*): Self = StObject.set(x, "line-dasharray", js.Array(value*))
    
    inline def `setLine-gap-width`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "line-gap-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-gap-widthUndefined`: Self = StObject.set(x, "line-gap-width", js.undefined)
    
    inline def `setLine-gap-widthVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-gap-width", js.Array(value*))
    
    inline def `setLine-gradient`(value: ExpressionSpecification): Self = StObject.set(x, "line-gradient", value.asInstanceOf[js.Any])
    
    inline def `setLine-gradientUndefined`: Self = StObject.set(x, "line-gradient", js.undefined)
    
    inline def `setLine-gradientVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-gradient", js.Array(value*))
    
    inline def `setLine-offset`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "line-offset", value.asInstanceOf[js.Any])
    
    inline def `setLine-offsetUndefined`: Self = StObject.set(x, "line-offset", js.undefined)
    
    inline def `setLine-offsetVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-offset", js.Array(value*))
    
    inline def `setLine-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "line-opacity", value.asInstanceOf[js.Any])
    
    inline def `setLine-opacityUndefined`: Self = StObject.set(x, "line-opacity", js.undefined)
    
    inline def `setLine-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-opacity", js.Array(value*))
    
    inline def `setLine-pattern`(value: DataDrivenPropertyValueSpecification[ResolvedImageSpecification]): Self = StObject.set(x, "line-pattern", value.asInstanceOf[js.Any])
    
    inline def `setLine-patternUndefined`: Self = StObject.set(x, "line-pattern", js.undefined)
    
    inline def `setLine-patternVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-pattern", js.Array(value*))
    
    inline def `setLine-translate`(value: PropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "line-translate", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "line-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate-anchorUndefined`: Self = StObject.set(x, "line-translate-anchor", js.undefined)
    
    inline def `setLine-translateUndefined`: Self = StObject.set(x, "line-translate", js.undefined)
    
    inline def `setLine-width`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "line-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-widthUndefined`: Self = StObject.set(x, "line-width", js.undefined)
    
    inline def `setLine-widthVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-width", js.Array(value*))
  }
}
