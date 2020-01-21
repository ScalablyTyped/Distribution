package typings.ionicDiscover.commMod

import typings.ionicDiscover.ionicDiscoverStrings.connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommServerConnectionPayload extends js.Object {
  var device: String
  var event: connect
}

object CommServerConnectionPayload {
  @scala.inline
  def apply(device: String, event: connect): CommServerConnectionPayload = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommServerConnectionPayload]
  }
}

