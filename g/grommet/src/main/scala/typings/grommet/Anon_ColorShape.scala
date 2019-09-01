package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorShape extends js.Object {
  var color: Anon_DarkLightString
  var shape: String
  var size: String
  var width: String
}

object Anon_ColorShape {
  @scala.inline
  def apply(color: Anon_DarkLightString, shape: String, size: String, width: String): Anon_ColorShape = {
    val __obj = js.Dynamic.literal(color = color, shape = shape, size = size, width = width)
  
    __obj.asInstanceOf[Anon_ColorShape]
  }
}

