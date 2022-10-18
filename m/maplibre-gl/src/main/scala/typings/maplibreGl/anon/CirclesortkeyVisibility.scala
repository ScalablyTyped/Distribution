package typings.maplibreGl.anon

import typings.maplibreGl.distStyleSpecMod.DataDrivenPropertyValueSpecification
import typings.maplibreGl.maplibreGlStrings.ExpressionSpecification
import typings.maplibreGl.maplibreGlStrings.`geometry-type`
import typings.maplibreGl.maplibreGlStrings.`heatmap-density`
import typings.maplibreGl.maplibreGlStrings.`line-progress`
import typings.maplibreGl.maplibreGlStrings.accumulated
import typings.maplibreGl.maplibreGlStrings.id
import typings.maplibreGl.maplibreGlStrings.ln2
import typings.maplibreGl.maplibreGlStrings.none
import typings.maplibreGl.maplibreGlStrings.pi
import typings.maplibreGl.maplibreGlStrings.properties
import typings.maplibreGl.maplibreGlStrings.visible
import typings.maplibreGl.maplibreGlStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CirclesortkeyVisibility extends StObject {
  
  var `circle-sort-key`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var visibility: js.UndefOr[visible | none] = js.undefined
}
object CirclesortkeyVisibility {
  
  inline def apply(): CirclesortkeyVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CirclesortkeyVisibility]
  }
  
  extension [Self <: CirclesortkeyVisibility](x: Self) {
    
    inline def `setCircle-sort-key`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "circle-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setCircle-sort-keyUndefined`: Self = StObject.set(x, "circle-sort-key", js.undefined)
    
    inline def `setCircle-sort-keyVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "circle-sort-key", js.Array(value*))
    
    inline def setVisibility(value: visible | none): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
