package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionStorage extends js.Object {
  var sessionStorage: Boolean
}

object SessionStorage {
  @scala.inline
  def apply(sessionStorage: Boolean): SessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStorage]
  }
}

