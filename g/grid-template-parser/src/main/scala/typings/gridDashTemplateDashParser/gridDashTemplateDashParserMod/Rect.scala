package typings.gridDashTemplateDashParser.gridDashTemplateDashParserMod

import typings.std.Partial
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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Rect]
  }
}

@JSImport("grid-template-parser", "rect")
@js.native
object rect extends js.Object {
  def apply(): Rect = js.native
  def apply(area: Partial[Area]): Rect = js.native
}

