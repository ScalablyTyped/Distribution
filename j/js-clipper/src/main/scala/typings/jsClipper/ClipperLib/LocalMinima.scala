package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalMinima extends StObject {
  
  var Y: Double = js.native
  
  var leftBound: TEdge = js.native
  
  var next: TEdge = js.native
  
  var rightBound: TEdge = js.native
}
object LocalMinima {
  
  @scala.inline
  def apply(Y: Double, leftBound: TEdge, next: TEdge, rightBound: TEdge): LocalMinima = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], leftBound = leftBound.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], rightBound = rightBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalMinima]
  }
  
  @scala.inline
  implicit class LocalMinimaMutableBuilder[Self <: LocalMinima] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftBound(value: TEdge): Self = StObject.set(x, "leftBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: TEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBound(value: TEdge): Self = StObject.set(x, "rightBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
