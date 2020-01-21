package typings.gun

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErr extends js.Object {
  var err: Error
  var ok: js.Any
}

object AnonErr {
  @scala.inline
  def apply(err: Error, ok: js.Any): AnonErr = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErr]
  }
}

