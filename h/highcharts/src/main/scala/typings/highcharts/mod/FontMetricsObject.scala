package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontMetricsObject extends js.Object {
  
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
  implicit class FontMetricsObjectOps[Self <: FontMetricsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: Double): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
  }
}
