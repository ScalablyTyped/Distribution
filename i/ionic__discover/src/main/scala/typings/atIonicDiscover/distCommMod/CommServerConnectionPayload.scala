package typings.atIonicDiscover.distCommMod

import typings.atIonicDiscover.atIonicDiscoverStrings.connect
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
    val __obj = js.Dynamic.literal(device = device, event = event)
  
    __obj.asInstanceOf[CommServerConnectionPayload]
  }
}

