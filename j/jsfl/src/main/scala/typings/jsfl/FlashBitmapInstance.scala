package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// if FlashElement.elementType == 'instance'
@js.native
trait FlashBitmapInstance extends StObject {
  
  def getBits(): FlashBitmap = js.native
  
  var hPixels: Double = js.native
  
  def setBits(bitmap: FlashBitmap): Unit = js.native
  
  var vPixels: Double = js.native
}
object FlashBitmapInstance {
  
  @scala.inline
  def apply(getBits: () => FlashBitmap, hPixels: Double, setBits: FlashBitmap => Unit, vPixels: Double): FlashBitmapInstance = {
    val __obj = js.Dynamic.literal(getBits = js.Any.fromFunction0(getBits), hPixels = hPixels.asInstanceOf[js.Any], setBits = js.Any.fromFunction1(setBits), vPixels = vPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmapInstance]
  }
  
  @scala.inline
  implicit class FlashBitmapInstanceMutableBuilder[Self <: FlashBitmapInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBits(value: () => FlashBitmap): Self = StObject.set(x, "getBits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHPixels(value: Double): Self = StObject.set(x, "hPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBits(value: FlashBitmap => Unit): Self = StObject.set(x, "setBits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVPixels(value: Double): Self = StObject.set(x, "vPixels", value.asInstanceOf[js.Any])
  }
}
