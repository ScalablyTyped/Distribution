package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbrComponentAPI
  extends StObject
     with ComponentAPI {
  
  val bwEstimator: js.UndefOr[EwmaBandWidthEstimator] = js.undefined
  
  var nextAutoLevel: Double
}
object AbrComponentAPI {
  
  inline def apply(destroy: () => Unit, nextAutoLevel: Double): AbrComponentAPI = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), nextAutoLevel = nextAutoLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbrComponentAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbrComponentAPI] (val x: Self) extends AnyVal {
    
    inline def setBwEstimator(value: EwmaBandWidthEstimator): Self = StObject.set(x, "bwEstimator", value.asInstanceOf[js.Any])
    
    inline def setBwEstimatorUndefined: Self = StObject.set(x, "bwEstimator", js.undefined)
    
    inline def setNextAutoLevel(value: Double): Self = StObject.set(x, "nextAutoLevel", value.asInstanceOf[js.Any])
  }
}
