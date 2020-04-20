package typings.interpret

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensions extends js.Object {
  var extensions: String
}

object AnonExtensions {
  @scala.inline
  def apply(extensions: String): AnonExtensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensions]
  }
}

