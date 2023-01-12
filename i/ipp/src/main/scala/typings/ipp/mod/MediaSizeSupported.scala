package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSizeSupported extends StObject {
  
  var `x-dimension`: js.UndefOr[Double | String] = js.undefined
  
  var `y-dimension`: js.UndefOr[Double | String] = js.undefined
}
object MediaSizeSupported {
  
  inline def apply(): MediaSizeSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSizeSupported]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaSizeSupported] (val x: Self) extends AnyVal {
    
    inline def `setX-dimension`(value: Double | String): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    inline def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    inline def `setY-dimension`(value: Double | String): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    inline def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
  }
}
