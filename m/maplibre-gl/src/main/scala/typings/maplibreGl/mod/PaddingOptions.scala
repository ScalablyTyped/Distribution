package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingOptions extends StObject {
  
  /**
  	 * @property {number} bottom Padding in pixels from the bottom of the map canvas.
  	 */
  var bottom: Double
  
  /**
  	 * @property {number} right Padding in pixels from the right of the map canvas.
  	 */
  var left: Double
  
  /**
  	 * @property {number} left Padding in pixels from the left of the map canvas.
  	 */
  var right: Double
  
  /**
  	 * @property {number} top Padding in pixels from the top of the map canvas.
  	 */
  var top: Double
}
object PaddingOptions {
  
  inline def apply(bottom: Double, left: Double, right: Double, top: Double): PaddingOptions = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingOptions]
  }
  
  extension [Self <: PaddingOptions](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
