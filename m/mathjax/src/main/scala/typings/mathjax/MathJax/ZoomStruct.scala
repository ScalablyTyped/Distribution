package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomStruct extends js.Object {
  
  /*The vertical offset from the top of the span to the baseline of the mathematics*/
  var Y: Double = js.native
  
  /*The height of the original mathematics element*/
  var mH: Double = js.native
  
  /*The width of the original mathematics element*/
  var mW: Double = js.native
  
  /*The height of the zoomed math*/
  var zH: Double = js.native
  
  /*The width of the zoomed math*/
  var zW: Double = js.native
}
object ZoomStruct {
  
  @scala.inline
  def apply(Y: Double, mH: Double, mW: Double, zH: Double, zW: Double): ZoomStruct = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], mH = mH.asInstanceOf[js.Any], mW = mW.asInstanceOf[js.Any], zH = zH.asInstanceOf[js.Any], zW = zW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomStruct]
  }
  
  @scala.inline
  implicit class ZoomStructOps[Self <: ZoomStruct] (val x: Self) extends AnyVal {
    
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
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMH(value: Double): Self = this.set("mH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMW(value: Double): Self = this.set("mW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZH(value: Double): Self = this.set("zH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZW(value: Double): Self = this.set("zW", value.asInstanceOf[js.Any])
  }
}
