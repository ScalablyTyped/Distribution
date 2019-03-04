package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandChannel extends js.Object {
  def onCommand(command: Command): js.Any
  def sendCommand(command: Command): scala.Unit
}

object ICommandChannel {
  @scala.inline
  def apply(onCommand: js.Function1[Command, js.Any], sendCommand: js.Function1[Command, scala.Unit]): ICommandChannel = {
    val __obj = js.Dynamic.literal(onCommand = onCommand, sendCommand = sendCommand)
  
    __obj.asInstanceOf[ICommandChannel]
  }
}

