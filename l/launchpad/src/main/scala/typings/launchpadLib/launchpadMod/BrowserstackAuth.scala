package typings
package launchpadLib.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserstackAuth extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object BrowserstackAuth {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): BrowserstackAuth = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[BrowserstackAuth]
  }
}

