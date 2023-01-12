package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleLayoutPropsPossiblyEvaluated extends StObject {
  
  var `circle-sort-key`: PossiblyEvaluatedPropertyValue[Double]
}
object CircleLayoutPropsPossiblyEvaluated {
  
  inline def apply(`circle-sort-key`: PossiblyEvaluatedPropertyValue[Double]): CircleLayoutPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("circle-sort-key")(`circle-sort-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLayoutPropsPossiblyEvaluated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleLayoutPropsPossiblyEvaluated] (val x: Self) extends AnyVal {
    
    inline def `setCircle-sort-key`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "circle-sort-key", value.asInstanceOf[js.Any])
  }
}
