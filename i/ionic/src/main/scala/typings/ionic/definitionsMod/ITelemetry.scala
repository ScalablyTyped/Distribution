package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITelemetry extends js.Object {
  def sendCommand(command: String, args: js.Array[String]): js.Promise[Unit]
}

object ITelemetry {
  @scala.inline
  def apply(sendCommand: (String, js.Array[String]) => js.Promise[Unit]): ITelemetry = {
    val __obj = js.Dynamic.literal(sendCommand = js.Any.fromFunction2(sendCommand))
    __obj.asInstanceOf[ITelemetry]
  }
}

