package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentSubdivisionsOpt
  extends StObject
     with PrecisionOpt {
  
  var segmentSubdivisions: js.UndefOr[js.Array[js.Array[Curve]]] = js.undefined
}
object SegmentSubdivisionsOpt {
  
  inline def apply(): SegmentSubdivisionsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSubdivisionsOpt]
  }
  
  extension [Self <: SegmentSubdivisionsOpt](x: Self) {
    
    inline def setSegmentSubdivisions(value: js.Array[js.Array[Curve]]): Self = StObject.set(x, "segmentSubdivisions", value.asInstanceOf[js.Any])
    
    inline def setSegmentSubdivisionsUndefined: Self = StObject.set(x, "segmentSubdivisions", js.undefined)
    
    inline def setSegmentSubdivisionsVarargs(value: js.Array[Curve]*): Self = StObject.set(x, "segmentSubdivisions", js.Array(value :_*))
  }
}
