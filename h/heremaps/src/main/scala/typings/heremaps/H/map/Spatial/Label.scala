package typings.heremaps.H.map.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data to used as rendering hint for a label
  * @property x {number} - The X coordinate of the first line's starting point
  * @property y {number} - The Y coordinate of the first line's base line
  * @property angle {number} - The clockwise rotation angle in radians
  * @property font {string} - The CSS font-family
  * @property size {number} - The CSS font-size
  * @property color {string} - The CSS color
  * @property text {string} - The text content, new line characters (\\u000A) are interpreted as line breaks
  */
@js.native
trait Label extends js.Object {
  
  var angle: Double = js.native
  
  var color: String = js.native
  
  var font: String = js.native
  
  var size: Double = js.native
  
  var text: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Label {
  
  @scala.inline
  def apply(angle: Double, color: String, font: String, size: Double, text: String, x: Double, y: Double): Label = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
