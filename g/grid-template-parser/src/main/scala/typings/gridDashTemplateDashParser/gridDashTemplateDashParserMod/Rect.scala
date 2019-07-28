package typings.gridDashTemplateDashParser.gridDashTemplateDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Rect {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Rect = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Rect]
  }
}

