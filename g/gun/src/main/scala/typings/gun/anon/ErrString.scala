package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrString extends js.Object {
  var err: String
}

object ErrString {
  @scala.inline
  def apply(err: String): ErrString = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrString]
  }
}

