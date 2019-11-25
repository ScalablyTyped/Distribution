package typings.heremaps.H.map.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Label extends js.Object {
  var angle: Double
  var color: String
  var font: String
  var size: Double
  var text: String
  var x: Double
  var y: Double
}

object Label {
  @scala.inline
  def apply(angle: Double, color: String, font: String, size: Double, text: String, x: Double, y: Double): Label = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Label]
  }
}

