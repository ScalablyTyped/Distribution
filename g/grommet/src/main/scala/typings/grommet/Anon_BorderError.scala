package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderError extends js.Object {
  var border: Anon_ColorError
  var error: Anon_ColorAnonDarkLightString
  var help: Anon_ColorAnonDarkLightString
}

object Anon_BorderError {
  @scala.inline
  def apply(border: Anon_ColorError, error: Anon_ColorAnonDarkLightString, help: Anon_ColorAnonDarkLightString): Anon_BorderError = {
    val __obj = js.Dynamic.literal(border = border, error = error, help = help)
  
    __obj.asInstanceOf[Anon_BorderError]
  }
}

