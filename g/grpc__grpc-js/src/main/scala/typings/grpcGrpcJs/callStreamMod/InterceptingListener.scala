package typings.grpcGrpcJs.callStreamMod

import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterceptingListener extends js.Object {
  def onReceiveMessage(message: js.Any): Unit = js.native
  def onReceiveMetadata(metadata: Metadata): Unit = js.native
  def onReceiveStatus(status: StatusObject): Unit = js.native
}

object InterceptingListener {
  @scala.inline
  def apply(
    onReceiveMessage: js.Any => Unit,
    onReceiveMetadata: Metadata => Unit,
    onReceiveStatus: StatusObject => Unit
  ): InterceptingListener = {
    val __obj = js.Dynamic.literal(onReceiveMessage = js.Any.fromFunction1(onReceiveMessage), onReceiveMetadata = js.Any.fromFunction1(onReceiveMetadata), onReceiveStatus = js.Any.fromFunction1(onReceiveStatus))
    __obj.asInstanceOf[InterceptingListener]
  }
  @scala.inline
  implicit class InterceptingListenerOps[Self <: InterceptingListener] (val x: Self) extends AnyVal {
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
    def setOnReceiveMessage(value: js.Any => Unit): Self = this.set("onReceiveMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setOnReceiveMetadata(value: Metadata => Unit): Self = this.set("onReceiveMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def setOnReceiveStatus(value: StatusObject => Unit): Self = this.set("onReceiveStatus", js.Any.fromFunction1(value))
  }
  
}

