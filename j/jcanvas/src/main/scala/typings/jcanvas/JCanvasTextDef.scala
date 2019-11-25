package typings.jcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JCanvasTextDef extends js.Object {
  var fillStyle: String
  var fontFamily: String
  var fontSize: Double
  var strokeStyle: String
  var strokeWidth: Double
  var text: String
  var x: Double
  var y: Double
}

object JCanvasTextDef {
  @scala.inline
  def apply(
    fillStyle: String,
    fontFamily: String,
    fontSize: Double,
    strokeStyle: String,
    strokeWidth: Double,
    text: String,
    x: Double,
    y: Double
  ): JCanvasTextDef = {
    val __obj = js.Dynamic.literal(fillStyle = fillStyle.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JCanvasTextDef]
  }
}

