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
    val __obj = js.Dynamic.literal(fillStyle = fillStyle, fontFamily = fontFamily, fontSize = fontSize, strokeStyle = strokeStyle, strokeWidth = strokeWidth, text = text, x = x, y = y)
  
    __obj.asInstanceOf[JCanvasTextDef]
  }
}

