package typings.leapmotionts.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  def onConnect(controller: Controller): Unit
  def onDisconnect(controller: Controller): Unit
  def onExit(controller: Controller): Unit
  def onFrame(controller: Controller, frame: Frame): Unit
  def onInit(controller: Controller): Unit
}

object Listener {
  @scala.inline
  def apply(
    onConnect: Controller => Unit,
    onDisconnect: Controller => Unit,
    onExit: Controller => Unit,
    onFrame: (Controller, Frame) => Unit,
    onInit: Controller => Unit
  ): Listener = {
    val __obj = js.Dynamic.literal(onConnect = js.Any.fromFunction1(onConnect), onDisconnect = js.Any.fromFunction1(onDisconnect), onExit = js.Any.fromFunction1(onExit), onFrame = js.Any.fromFunction2(onFrame), onInit = js.Any.fromFunction1(onInit))
  
    __obj.asInstanceOf[Listener]
  }
}

