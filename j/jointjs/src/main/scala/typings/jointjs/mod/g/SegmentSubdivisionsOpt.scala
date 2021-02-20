package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentSubdivisionsOpt extends PrecisionOpt {
  
  var segmentSubdivisions: js.UndefOr[js.Array[js.Array[Curve]]] = js.native
}
object SegmentSubdivisionsOpt {
  
  @scala.inline
  def apply(): SegmentSubdivisionsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSubdivisionsOpt]
  }
  
  @scala.inline
  implicit class SegmentSubdivisionsOptMutableBuilder[Self <: SegmentSubdivisionsOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentSubdivisions(value: js.Array[js.Array[Curve]]): Self = StObject.set(x, "segmentSubdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentSubdivisionsUndefined: Self = StObject.set(x, "segmentSubdivisions", js.undefined)
    
    @scala.inline
    def setSegmentSubdivisionsVarargs(value: js.Array[Curve]*): Self = StObject.set(x, "segmentSubdivisions", js.Array(value :_*))
  }
}
