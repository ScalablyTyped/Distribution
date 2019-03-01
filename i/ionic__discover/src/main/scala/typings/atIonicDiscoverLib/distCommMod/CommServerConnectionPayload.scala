package typings
package atIonicDiscoverLib.distCommMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommServerConnectionPayload extends js.Object {
  var device: java.lang.String
  var event: atIonicDiscoverLib.atIonicDiscoverLibStrings.connect
}

object CommServerConnectionPayload {
  @scala.inline
  def apply(device: java.lang.String, event: atIonicDiscoverLib.atIonicDiscoverLibStrings.connect): CommServerConnectionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[CommServerConnectionPayload]
  }
}

