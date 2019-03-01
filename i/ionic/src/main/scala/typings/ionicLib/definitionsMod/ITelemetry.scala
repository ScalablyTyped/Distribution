package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITelemetry extends js.Object {
  def sendCommand(command: java.lang.String, args: js.Array[java.lang.String]): js.Promise[scala.Unit]
}

object ITelemetry {
  @scala.inline
  def apply(sendCommand: js.Function2[java.lang.String, js.Array[java.lang.String], js.Promise[scala.Unit]]): ITelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendCommand")(sendCommand)
    __obj.asInstanceOf[ITelemetry]
  }
}

