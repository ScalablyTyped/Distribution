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
    onConnect: Controller => scala.Unit,
    onDisconnect: Controller => scala.Unit,
    onExit: Controller => scala.Unit,
    onFrame: (Controller, Frame) => scala.Unit,
    onInit: Controller => scala.Unit
  ): Listener = {
    val __obj = js.Dynamic.literal(onConnect = js.Any.fromFunction1(onConnect), onDisconnect = js.Any.fromFunction1(onDisconnect), onExit = js.Any.fromFunction1(onExit), onFrame = js.Any.fromFunction2(onFrame), onInit = js.Any.fromFunction1(onInit))
  
    __obj.asInstanceOf[Listener]
  }
}

