package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ExpressionSpecification
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`geometry-type`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`heatmap-density`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`line-progress`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.accumulated
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.bevel
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.butt
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.id
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ln2
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.miter
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.none
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.pi
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.properties
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.round
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.square
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.visible
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.zoom
import typings.maplibreMaplibreGlStyleSpec.mod.DataDrivenPropertyValueSpecification
import typings.maplibreMaplibreGlStyleSpec.mod.PropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linecap extends StObject {
  
  var `line-cap`: js.UndefOr[PropertyValueSpecification[butt | round | square]] = js.undefined
  
  var `line-join`: js.UndefOr[DataDrivenPropertyValueSpecification[bevel | round | miter]] = js.undefined
  
  var `line-miter-limit`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `line-round-limit`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `line-sort-key`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var visibility: js.UndefOr[visible | none] = js.undefined
}
object Linecap {
  
  inline def apply(): Linecap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Linecap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Linecap] (val x: Self) extends AnyVal {
    
    inline def `setLine-cap`(value: PropertyValueSpecification[butt | round | square]): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    inline def `setLine-capUndefined`: Self = StObject.set(x, "line-cap", js.undefined)
    
    inline def `setLine-join`(value: DataDrivenPropertyValueSpecification[bevel | round | miter]): Self = StObject.set(x, "line-join", value.asInstanceOf[js.Any])
    
    inline def `setLine-joinUndefined`: Self = StObject.set(x, "line-join", js.undefined)
    
    inline def `setLine-joinVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-join", js.Array(value*))
    
    inline def `setLine-miter-limit`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "line-miter-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-miter-limitUndefined`: Self = StObject.set(x, "line-miter-limit", js.undefined)
    
    inline def `setLine-round-limit`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "line-round-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-round-limitUndefined`: Self = StObject.set(x, "line-round-limit", js.undefined)
    
    inline def `setLine-sort-key`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "line-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setLine-sort-keyUndefined`: Self = StObject.set(x, "line-sort-key", js.undefined)
    
    inline def `setLine-sort-keyVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-sort-key", js.Array(value*))
    
    inline def setVisibility(value: visible | none): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
