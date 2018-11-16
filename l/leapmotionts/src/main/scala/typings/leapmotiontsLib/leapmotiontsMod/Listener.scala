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

