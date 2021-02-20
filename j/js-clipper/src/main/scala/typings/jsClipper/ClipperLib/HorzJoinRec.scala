package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorzJoinRec extends StObject {
  
  var edge: TEdge = js.native
  
  var savedIdx: Double = js.native
}
object HorzJoinRec {
  
  @scala.inline
  def apply(edge: TEdge, savedIdx: Double): HorzJoinRec = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], savedIdx = savedIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorzJoinRec]
  }
  
  @scala.inline
  implicit class HorzJoinRecMutableBuilder[Self <: HorzJoinRec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdge(value: TEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedIdx(value: Double): Self = StObject.set(x, "savedIdx", value.asInstanceOf[js.Any])
  }
}
