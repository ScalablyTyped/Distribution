package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorError extends js.Object {
  var color: ColorType
  var error: Anon_ColorColorType
  var position: String
  var side: String
}

object Anon_ColorError {
  @scala.inline
  def apply(color: ColorType, error: Anon_ColorColorType, position: String, side: String): Anon_ColorError = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], error = error, position = position, side = side)
  
    __obj.asInstanceOf[Anon_ColorError]
  }
}

