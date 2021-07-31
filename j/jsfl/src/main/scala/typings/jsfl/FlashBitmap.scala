package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashBitmap extends StObject {
  
  var bits: js.Any
  
  var cTab: js.UndefOr[js.Array[String]] = js.undefined
  
  var depth: js.Any
  
  var height: js.Any
  
  var width: js.Any
}
object FlashBitmap {
  
  @scala.inline
  def apply(bits: js.Any, depth: js.Any, height: js.Any, width: js.Any): FlashBitmap = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmap]
  }
  
  @scala.inline
  implicit class FlashBitmapMutableBuilder[Self <: FlashBitmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBits(value: js.Any): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCTab(value: js.Array[String]): Self = StObject.set(x, "cTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCTabUndefined: Self = StObject.set(x, "cTab", js.undefined)
    
    @scala.inline
    def setCTabVarargs(value: String*): Self = StObject.set(x, "cTab", js.Array(value :_*))
    
    @scala.inline
    def setDepth(value: js.Any): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
