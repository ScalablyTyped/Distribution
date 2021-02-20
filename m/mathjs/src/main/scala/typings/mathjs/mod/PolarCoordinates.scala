package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolarCoordinates extends StObject {
  
  var phi: Double = js.native
  
  var r: Double = js.native
}
object PolarCoordinates {
  
  @scala.inline
  def apply(phi: Double, r: Double): PolarCoordinates = {
    val __obj = js.Dynamic.literal(phi = phi.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarCoordinates]
  }
  
  @scala.inline
  implicit class PolarCoordinatesMutableBuilder[Self <: PolarCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhi(value: Double): Self = StObject.set(x, "phi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
