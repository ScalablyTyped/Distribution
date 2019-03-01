package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  def onConnect(controller: Controller): scala.Unit
  def onDisconnect(controller: Controller): scala.Unit
  def onExit(controller: Controller): scala.Unit
  def onFrame(controller: Controller, frame: Frame): scala.Unit
  def onInit(controller: Controller): scala.Unit
}

object Listener {
  @scala.inline
  def apply(
    onConnect: js.Function1[Controller, scala.Unit],
    onDisconnect: js.Function1[Controller, scala.Unit],
    onExit: js.Function1[Controller, scala.Unit],
    onFrame: js.Function2[Controller, Frame, scala.Unit],
    onInit: js.Function1[Controller, scala.Unit]
  ): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onConnect")(onConnect)
    __obj.updateDynamic("onDisconnect")(onDisconnect)
    __obj.updateDynamic("onExit")(onExit)
    __obj.updateDynamic("onFrame")(onFrame)
    __obj.updateDynamic("onInit")(onInit)
    __obj.asInstanceOf[Listener]
  }
}

