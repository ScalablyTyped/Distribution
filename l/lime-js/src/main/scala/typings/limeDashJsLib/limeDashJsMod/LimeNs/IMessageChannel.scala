package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageChannel extends js.Object {
  def onMessage(message: Message): js.Any
  def sendMessage(message: Message): scala.Unit
}

object IMessageChannel {
  @scala.inline
  def apply(onMessage: js.Function1[Message, js.Any], sendMessage: js.Function1[Message, scala.Unit]): IMessageChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMessage")(onMessage)
    __obj.updateDynamic("sendMessage")(sendMessage)
    __obj.asInstanceOf[IMessageChannel]
  }
}

