package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterVolumeSupported extends StObject {
  
  var `x-dimension`: js.UndefOr[Double] = js.undefined
  
  var `y-dimension`: js.UndefOr[Double] = js.undefined
  
  var `z-dimension`: js.UndefOr[Double] = js.undefined
}
object PrinterVolumeSupported {
  
  inline def apply(): PrinterVolumeSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterVolumeSupported]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterVolumeSupported] (val x: Self) extends AnyVal {
    
    inline def `setX-dimension`(value: Double): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    inline def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    inline def `setY-dimension`(value: Double): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    inline def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
    
    inline def `setZ-dimension`(value: Double): Self = StObject.set(x, "z-dimension", value.asInstanceOf[js.Any])
    
    inline def `setZ-dimensionUndefined`: Self = StObject.set(x, "z-dimension", js.undefined)
  }
}
