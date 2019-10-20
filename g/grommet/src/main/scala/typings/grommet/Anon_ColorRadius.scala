package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorRadius extends js.Object {
  var color: ColorType
  var radius: String
  var width: String
}

object Anon_ColorRadius {
  @scala.inline
  def apply(color: ColorType, radius: String, width: String): Anon_ColorRadius = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], radius = radius, width = width)
  
    __obj.asInstanceOf[Anon_ColorRadius]
  }
}

