package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scanbeam extends StObject {
  
  var Y: Double
  
  var next: TEdge
}
object Scanbeam {
  
  inline def apply(Y: Double, next: TEdge): Scanbeam = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanbeam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scanbeam] (val x: Self) extends AnyVal {
    
    inline def setNext(value: TEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
