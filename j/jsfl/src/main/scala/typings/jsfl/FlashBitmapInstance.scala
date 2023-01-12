package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// if FlashElement.elementType == 'instance'
trait FlashBitmapInstance extends StObject {
  
  def getBits(): FlashBitmap
  
  var hPixels: Double
  
  def setBits(bitmap: FlashBitmap): Unit
  
  var vPixels: Double
}
object FlashBitmapInstance {
  
  inline def apply(getBits: () => FlashBitmap, hPixels: Double, setBits: FlashBitmap => Unit, vPixels: Double): FlashBitmapInstance = {
    val __obj = js.Dynamic.literal(getBits = js.Any.fromFunction0(getBits), hPixels = hPixels.asInstanceOf[js.Any], setBits = js.Any.fromFunction1(setBits), vPixels = vPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmapInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashBitmapInstance] (val x: Self) extends AnyVal {
    
    inline def setGetBits(value: () => FlashBitmap): Self = StObject.set(x, "getBits", js.Any.fromFunction0(value))
    
    inline def setHPixels(value: Double): Self = StObject.set(x, "hPixels", value.asInstanceOf[js.Any])
    
    inline def setSetBits(value: FlashBitmap => Unit): Self = StObject.set(x, "setBits", js.Any.fromFunction1(value))
    
    inline def setVPixels(value: Double): Self = StObject.set(x, "vPixels", value.asInstanceOf[js.Any])
  }
}
