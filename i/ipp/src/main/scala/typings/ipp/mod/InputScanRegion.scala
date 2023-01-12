package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputScanRegion extends StObject {
  
  var `x-dimension`: js.UndefOr[String] = js.undefined
  
  var `x-origin`: js.UndefOr[String] = js.undefined
  
  var `y-dimension`: js.UndefOr[String] = js.undefined
  
  var `y-origin`: js.UndefOr[String] = js.undefined
}
object InputScanRegion {
  
  inline def apply(): InputScanRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputScanRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputScanRegion] (val x: Self) extends AnyVal {
    
    inline def `setX-dimension`(value: String): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    inline def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    inline def `setX-origin`(value: String): Self = StObject.set(x, "x-origin", value.asInstanceOf[js.Any])
    
    inline def `setX-originUndefined`: Self = StObject.set(x, "x-origin", js.undefined)
    
    inline def `setY-dimension`(value: String): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    inline def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
    
    inline def `setY-origin`(value: String): Self = StObject.set(x, "y-origin", value.asInstanceOf[js.Any])
    
    inline def `setY-originUndefined`: Self = StObject.set(x, "y-origin", js.undefined)
  }
}
