package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalMinima extends StObject {
  
  var Y: Double
  
  var leftBound: TEdge
  
  var next: TEdge
  
  var rightBound: TEdge
}
object LocalMinima {
  
  inline def apply(Y: Double, leftBound: TEdge, next: TEdge, rightBound: TEdge): LocalMinima = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], leftBound = leftBound.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], rightBound = rightBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalMinima]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalMinima] (val x: Self) extends AnyVal {
    
    inline def setLeftBound(value: TEdge): Self = StObject.set(x, "leftBound", value.asInstanceOf[js.Any])
    
    inline def setNext(value: TEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setRightBound(value: TEdge): Self = StObject.set(x, "rightBound", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
