package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServerApiKey extends js.Object {
  var serverApiKey: String
}

object AnonServerApiKey {
  @scala.inline
  def apply(serverApiKey: String): AnonServerApiKey = {
    val __obj = js.Dynamic.literal(serverApiKey = serverApiKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonServerApiKey]
  }
}

