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

