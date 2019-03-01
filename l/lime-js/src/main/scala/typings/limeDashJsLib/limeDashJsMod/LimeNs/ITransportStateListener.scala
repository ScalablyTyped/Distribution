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
  def apply(
    onClose: js.Function0[scala.Unit],
    onError: js.Function1[java.lang.String, scala.Unit],
    onOpen: js.Function0[scala.Unit]
  ): ITransportStateListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClose")(onClose)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("onOpen")(onOpen)
    __obj.asInstanceOf[ITransportStateListener]
  }
}

