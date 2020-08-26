package typings.grpcGrpcJs.callStreamMod

import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.FullListener> */
@js.native
trait Listener extends js.Object {
  var onReceiveMessage: js.UndefOr[MessageListener] = js.native
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.native
  var onReceiveStatus: js.UndefOr[StatusListener] = js.native
}

object Listener {
  @scala.inline
  def apply(): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listener]
  }
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnReceiveMessage(value: (/* message */ js.Any, /* next */ js.Function1[/* message */ js.Any, Unit]) => Unit): Self = this.set("onReceiveMessage", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReceiveMessage: Self = this.set("onReceiveMessage", js.undefined)
    @scala.inline
    def setOnReceiveMetadata(value: (/* metadata */ Metadata, /* next */ js.Function1[/* metadata */ Metadata, Unit]) => Unit): Self = this.set("onReceiveMetadata", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReceiveMetadata: Self = this.set("onReceiveMetadata", js.undefined)
    @scala.inline
    def setOnReceiveStatus(
      value: (/* status */ StatusObject, /* next */ js.Function1[/* status */ StatusObject, Unit]) => Unit
    ): Self = this.set("onReceiveStatus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReceiveStatus: Self = this.set("onReceiveStatus", js.undefined)
  }
  
}

