package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageChannel extends js.Object {
  def onMessage(message: Message): js.Any
  def sendMessage(message: Message): scala.Unit
}

