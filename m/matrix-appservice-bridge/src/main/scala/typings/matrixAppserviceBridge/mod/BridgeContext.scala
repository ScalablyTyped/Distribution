package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.AnonMatrix
import typings.matrixAppserviceBridge.AnonRemote
import typings.matrixAppserviceBridge.AnonRemotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeContext extends js.Object {
  var rooms: AnonRemotes
  var senders: AnonMatrix
  var targets: AnonRemote
}

object BridgeContext {
  @scala.inline
  def apply(rooms: AnonRemotes, senders: AnonMatrix, targets: AnonRemote): BridgeContext = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any], senders = senders.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BridgeContext]
  }
}

