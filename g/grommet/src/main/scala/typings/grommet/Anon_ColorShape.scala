package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorShape extends js.Object {
  var color: ColorType
  var shape: String
  var size: String
  var width: String
}

object Anon_ColorShape {
  @scala.inline
  def apply(color: ColorType, shape: String, size: String, width: String): Anon_ColorShape = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], shape = shape, size = size, width = width)
  
    __obj.asInstanceOf[Anon_ColorShape]
  }
}

