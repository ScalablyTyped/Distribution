package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillLayoutPropsPossiblyEvaluated extends StObject {
  
  var `fill-sort-key`: PossiblyEvaluatedPropertyValue[Double]
}
object FillLayoutPropsPossiblyEvaluated {
  
  inline def apply(`fill-sort-key`: PossiblyEvaluatedPropertyValue[Double]): FillLayoutPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fill-sort-key")(`fill-sort-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillLayoutPropsPossiblyEvaluated]
  }
  
  extension [Self <: FillLayoutPropsPossiblyEvaluated](x: Self) {
    
    inline def `setFill-sort-key`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "fill-sort-key", value.asInstanceOf[js.Any])
  }
}
