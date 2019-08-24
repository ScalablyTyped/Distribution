package typings.jestDashWorker.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageChannel extends js.Object {
  var port1: MessagePort
  var port2: MessagePort
}

object MessageChannel {
  @scala.inline
  def apply(port1: MessagePort, port2: MessagePort): MessageChannel = {
    val __obj = js.Dynamic.literal(port1 = port1, port2 = port2)
  
    __obj.asInstanceOf[MessageChannel]
  }
}

