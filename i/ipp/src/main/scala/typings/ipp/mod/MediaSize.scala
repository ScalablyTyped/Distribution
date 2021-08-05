package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSize extends StObject {
  
  var `x-dimension`: js.UndefOr[Double] = js.undefined
  
  var `y-dimension`: js.UndefOr[Double] = js.undefined
}
object MediaSize {
  
  inline def apply(): MediaSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSize]
  }
  
  extension [Self <: MediaSize](x: Self) {
    
    inline def `setX-dimension`(value: Double): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    inline def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    inline def `setY-dimension`(value: Double): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    inline def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
  }
}
