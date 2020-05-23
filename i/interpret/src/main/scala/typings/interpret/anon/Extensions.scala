package typings.interpret.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions extends js.Object {
  var extensions: String
}

object Extensions {
  @scala.inline
  def apply(extensions: String): Extensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
}

