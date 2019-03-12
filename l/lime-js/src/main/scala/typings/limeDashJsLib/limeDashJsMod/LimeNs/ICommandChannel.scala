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
  def apply(onCommand: Command => js.Any, sendCommand: Command => scala.Unit): ICommandChannel = {
    val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand), sendCommand = js.Any.fromFunction1(sendCommand))
  
    __obj.asInstanceOf[ICommandChannel]
  }
}

