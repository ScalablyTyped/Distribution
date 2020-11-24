package typings.looksSame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pass to looksSame.colors function
  */
@js.native
trait Color extends js.Object {
  
  /**
    * Blue
    */
  var B: Double = js.native
  
  /**
    * Green
    */
  var G: Double = js.native
  
  /**
    * Red
    */
  var R: Double = js.native
}
object Color {
  
  @scala.inline
  def apply(B: Double, G: Double, R: Double): Color = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    
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
    def setB(value: Double): Self = this.set("B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: Double): Self = this.set("G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("R", value.asInstanceOf[js.Any])
  }
}
