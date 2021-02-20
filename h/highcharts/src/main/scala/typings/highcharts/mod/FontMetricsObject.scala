package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontMetricsObject extends StObject {
  
  /**
    * The baseline relative to the top of the box.
    */
  var b: Double = js.native
  
  /**
    * The font size.
    */
  var f: Double = js.native
  
  /**
    * The line height.
    */
  var h: Double = js.native
}
object FontMetricsObject {
  
  @scala.inline
  def apply(b: Double, f: Double, h: Double): FontMetricsObject = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontMetricsObject]
  }
  
  @scala.inline
  implicit class FontMetricsObjectMutableBuilder[Self <: FontMetricsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
  }
}
