package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportStateListener extends js.Object {
  def onClose(): scala.Unit
  def onError(error: java.lang.String): scala.Unit
  def onOpen(): scala.Unit
}

object ITransportStateListener {
  @scala.inline
  def apply(onClose: () => scala.Unit, onError: java.lang.String => scala.Unit, onOpen: () => scala.Unit): ITransportStateListener = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onError = js.Any.fromFunction1(onError), onOpen = js.Any.fromFunction0(onOpen))
  
    __obj.asInstanceOf[ITransportStateListener]
  }
}

