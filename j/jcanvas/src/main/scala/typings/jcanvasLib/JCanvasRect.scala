package typings
package jcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JCanvasRect extends js.Object {
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object JCanvasRect {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): JCanvasRect = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[JCanvasRect]
  }
}

