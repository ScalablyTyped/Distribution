package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ExpressionSpecification
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`geometry-type`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`heatmap-density`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`line-progress`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.accumulated
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.id
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ln2
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.none
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.pi
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.properties
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.visible
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.zoom
import typings.maplibreMaplibreGlStyleSpec.mod.DataDrivenPropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circlesortkey extends StObject {
  
  var `circle-sort-key`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var visibility: js.UndefOr[visible | none] = js.undefined
}
object Circlesortkey {
  
  inline def apply(): Circlesortkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Circlesortkey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Circlesortkey] (val x: Self) extends AnyVal {
    
    inline def `setCircle-sort-key`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setCircle-sort-keyUndefined`: Self = StObject.set(x, "circle-sort-key", js.undefined)
    
    inline def `setCircle-sort-keyVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-sort-key", js.Array(value*))
    
    inline def setVisibility(value: visible | none): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
