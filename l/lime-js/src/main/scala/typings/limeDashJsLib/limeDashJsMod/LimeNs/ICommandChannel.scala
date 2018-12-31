package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandChannel extends js.Object {
  def onCommand(command: Command): js.Any
  def sendCommand(command: Command): scala.Unit
}

