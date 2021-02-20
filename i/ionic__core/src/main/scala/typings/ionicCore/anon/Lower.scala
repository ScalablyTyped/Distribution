package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lower extends StObject {
  
  var lower: Double = js.native
  
  var upper: Double = js.native
}
object Lower {
  
  @scala.inline
  def apply(lower: Double, upper: Double): Lower = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lower]
  }
  
  @scala.inline
  implicit class LowerMutableBuilder[Self <: Lower] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLower(value: Double): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper(value: Double): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
  }
}
