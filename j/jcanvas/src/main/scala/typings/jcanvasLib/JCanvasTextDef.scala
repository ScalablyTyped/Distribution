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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fillStyle")(fillStyle)
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("strokeStyle")(strokeStyle)
    __obj.updateDynamic("strokeWidth")(strokeWidth)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[JCanvasTextDef]
  }
}

