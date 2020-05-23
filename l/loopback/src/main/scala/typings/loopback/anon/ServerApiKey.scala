package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerApiKey extends js.Object {
  var serverApiKey: String
}

object ServerApiKey {
  @scala.inline
  def apply(serverApiKey: String): ServerApiKey = {
    val __obj = js.Dynamic.literal(serverApiKey = serverApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerApiKey]
  }
}

