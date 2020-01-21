package typings.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSessionStorage extends js.Object {
  var sessionStorage: Boolean
}

object AnonSessionStorage {
  @scala.inline
  def apply(sessionStorage: Boolean): AnonSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSessionStorage]
  }
}

