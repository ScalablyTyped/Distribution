package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashBitmap extends StObject {
  
  var bits: Any
  
  var cTab: js.UndefOr[js.Array[String]] = js.undefined
  
  var depth: Any
  
  var height: Any
  
  var width: Any
}
object FlashBitmap {
  
  inline def apply(bits: Any, depth: Any, height: Any, width: Any): FlashBitmap = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashBitmap] (val x: Self) extends AnyVal {
    
    inline def setBits(value: Any): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    inline def setCTab(value: js.Array[String]): Self = StObject.set(x, "cTab", value.asInstanceOf[js.Any])
    
    inline def setCTabUndefined: Self = StObject.set(x, "cTab", js.undefined)
    
    inline def setCTabVarargs(value: String*): Self = StObject.set(x, "cTab", js.Array(value*))
    
    inline def setDepth(value: Any): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
