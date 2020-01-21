package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.callStreamMod.StatusObject
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
    onReceiveMessage: (/* message */ js.Any, /* next */ js.Function) => Unit = null,
    onReceiveMetadata: (/* metadata */ typings.grpcGrpcJs.metadataMod.Metadata, /* next */ js.Function) => Unit = null,
    onReceiveStatus: (/* status */ StatusObject, /* next */ js.Function) => Unit = null
  ): Listener = {
    val __obj = js.Dynamic.literal()
    if (onReceiveMessage != null) __obj.updateDynamic("onReceiveMessage")(js.Any.fromFunction2(onReceiveMessage))
    if (onReceiveMetadata != null) __obj.updateDynamic("onReceiveMetadata")(js.Any.fromFunction2(onReceiveMetadata))
    if (onReceiveStatus != null) __obj.updateDynamic("onReceiveStatus")(js.Any.fromFunction2(onReceiveStatus))
    __obj.asInstanceOf[Listener]
  }
}

