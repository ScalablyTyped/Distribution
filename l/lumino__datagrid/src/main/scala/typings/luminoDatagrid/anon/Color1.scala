package typings.luminoDatagrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color1 extends js.Object {
  
  /**
    * The first color stop for the shadow.
    */
  val color1: String = js.native
  
  /**
    * The second color stop for the shadow.
    */
  val color2: String = js.native
  
  /**
    * The third color stop for the shadow.
    */
  val color3: String = js.native
  
  /**
    * The size of the shadow, in pixels.
    */
  val size: Double = js.native
}
object Color1 {
  
  @scala.inline
  def apply(color1: String, color2: String, color3: String, size: Double): Color1 = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], color3 = color3.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color1]
  }
  
  @scala.inline
  implicit class Color1Ops[Self <: Color1] (val x: Self) extends AnyVal {
    
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
    def setColor1(value: String): Self = this.set("color1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor2(value: String): Self = this.set("color2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor3(value: String): Self = this.set("color3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
