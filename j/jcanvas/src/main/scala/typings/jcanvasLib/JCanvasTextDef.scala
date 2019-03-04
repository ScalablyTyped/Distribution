package typings
package jcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JCanvasTextDef extends js.Object {
  var fillStyle: java.lang.String
  var fontFamily: java.lang.String
  var fontSize: scala.Double
  var strokeStyle: java.lang.String
  var strokeWidth: scala.Double
  var text: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object JCanvasTextDef {
  @scala.inline
  def apply(
    fillStyle: java.lang.String,
    fontFamily: java.lang.String,
    fontSize: scala.Double,
    strokeStyle: java.lang.String,
    strokeWidth: scala.Double,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): JCanvasTextDef = {
    val __obj = js.Dynamic.literal(fillStyle = fillStyle, fontFamily = fontFamily, fontSize = fontSize, strokeStyle = strokeStyle, strokeWidth = strokeWidth, text = text, x = x, y = y)
  
    __obj.asInstanceOf[JCanvasTextDef]
  }
}

