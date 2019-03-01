package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  var onReceiveMessage: js.UndefOr[MessageListener] = js.undefined
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.undefined
  var onReceiveStatus: js.UndefOr[StatusListener] = js.undefined
}

object Listener {
  @scala.inline
  def apply(
    onReceiveMessage: MessageListener = null,
    onReceiveMetadata: MetadataListener = null,
    onReceiveStatus: StatusListener = null
  ): Listener = {
    val __obj = js.Dynamic.literal()
    if (onReceiveMessage != null) __obj.updateDynamic("onReceiveMessage")(onReceiveMessage)
    if (onReceiveMetadata != null) __obj.updateDynamic("onReceiveMetadata")(onReceiveMetadata)
    if (onReceiveStatus != null) __obj.updateDynamic("onReceiveStatus")(onReceiveStatus)
    __obj.asInstanceOf[Listener]
  }
}

