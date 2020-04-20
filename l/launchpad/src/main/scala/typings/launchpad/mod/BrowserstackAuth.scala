package typings.launchpad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserstackAuth extends js.Object {
  var password: String
  var username: String
}

object BrowserstackAuth {
  @scala.inline
  def apply(password: String, username: String): BrowserstackAuth = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserstackAuth]
  }
}

