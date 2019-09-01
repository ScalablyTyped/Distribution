package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorError extends js.Object {
  var color: String
  var error: Anon_ColorAnonDarkLightString
  var position: String
  var side: String
}

object Anon_ColorError {
  @scala.inline
  def apply(color: String, error: Anon_ColorAnonDarkLightString, position: String, side: String): Anon_ColorError = {
    val __obj = js.Dynamic.literal(color = color, error = error, position = position, side = side)
  
    __obj.asInstanceOf[Anon_ColorError]
  }
}

