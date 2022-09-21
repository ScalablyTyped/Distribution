package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.ExpressionSpecification
import typings.maplibreGl.maplibreGlStrings.`geometry-type`
import typings.maplibreGl.maplibreGlStrings.`heatmap-density`
import typings.maplibreGl.maplibreGlStrings.`line-progress`
import typings.maplibreGl.maplibreGlStrings.accumulated
import typings.maplibreGl.maplibreGlStrings.id
import typings.maplibreGl.maplibreGlStrings.ln2
import typings.maplibreGl.maplibreGlStrings.none
import typings.maplibreGl.maplibreGlStrings.pi
import typings.maplibreGl.maplibreGlStrings.properties_
import typings.maplibreGl.maplibreGlStrings.visible
import typings.maplibreGl.maplibreGlStrings.zoom
import typings.maplibreGl.styleSpecMod.DataDrivenPropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillsortkeyVisibility extends StObject {
  
  var `fill-sort-key`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var visibility: js.UndefOr[visible | none] = js.undefined
}
object FillsortkeyVisibility {
  
  inline def apply(): FillsortkeyVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillsortkeyVisibility]
  }
  
  extension [Self <: FillsortkeyVisibility](x: Self) {
    
    inline def `setFill-sort-key`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "fill-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setFill-sort-keyUndefined`: Self = StObject.set(x, "fill-sort-key", js.undefined)
    
    inline def `setFill-sort-keyVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-sort-key", js.Array(value*))
    
    inline def setVisibility(value: visible | none): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
