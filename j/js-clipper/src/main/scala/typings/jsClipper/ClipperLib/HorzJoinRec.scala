package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorzJoinRec extends StObject {
  
  var edge: TEdge
  
  var savedIdx: Double
}
object HorzJoinRec {
  
  inline def apply(edge: TEdge, savedIdx: Double): HorzJoinRec = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], savedIdx = savedIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorzJoinRec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorzJoinRec] (val x: Self) extends AnyVal {
    
    inline def setEdge(value: TEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setSavedIdx(value: Double): Self = StObject.set(x, "savedIdx", value.asInstanceOf[js.Any])
  }
}
