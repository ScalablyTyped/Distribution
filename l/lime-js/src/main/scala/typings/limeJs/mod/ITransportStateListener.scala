package typings.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportStateListener extends js.Object {
  def onClose(): Unit
  def onError(error: String): Unit
  def onOpen(): Unit
}

object ITransportStateListener {
  @scala.inline
  def apply(onClose: () => Unit, onError: String => Unit, onOpen: () => Unit): ITransportStateListener = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onError = js.Any.fromFunction1(onError), onOpen = js.Any.fromFunction0(onOpen))
  
    __obj.asInstanceOf[ITransportStateListener]
  }
}

