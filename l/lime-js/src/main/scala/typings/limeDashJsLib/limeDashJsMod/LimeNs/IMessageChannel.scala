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
  def apply(onMessage: Message => js.Any, sendMessage: Message => scala.Unit): IMessageChannel = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), sendMessage = js.Any.fromFunction1(sendMessage))
  
    __obj.asInstanceOf[IMessageChannel]
  }
}

