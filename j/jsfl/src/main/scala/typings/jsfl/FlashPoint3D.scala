package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashPoint3D extends FlashPoint {
  
  var z: Double = js.native
}
object FlashPoint3D {
  
  @scala.inline
  def apply(x: Double, y: Double, z: Double): FlashPoint3D = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashPoint3D]
  }
  
  @scala.inline
  implicit class FlashPoint3DMutableBuilder[Self <: FlashPoint3D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
