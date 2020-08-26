package typings.grpcGrpcJs.clientMod

import typings.grpcGrpcJs.callMod.ServiceError
import typings.grpcGrpcJs.callMod.SurfaceCall
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.makeClientMod.ClientMethodDefinition
import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallProperties[RequestType, ResponseType] extends js.Object {
  var argument: js.UndefOr[RequestType] = js.native
  var call: SurfaceCall = js.native
  var callOptions: CallOptions = js.native
  var callback: js.UndefOr[UnaryCallback[ResponseType]] = js.native
  var channel: Channel = js.native
  var metadata: Metadata = js.native
  var methodDefinition: ClientMethodDefinition[RequestType, ResponseType] = js.native
}

object CallProperties {
  @scala.inline
  def apply[RequestType, ResponseType](
    call: SurfaceCall,
    callOptions: CallOptions,
    channel: Channel,
    metadata: Metadata,
    methodDefinition: ClientMethodDefinition[RequestType, ResponseType]
  ): CallProperties[RequestType, ResponseType] = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], callOptions = callOptions.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], methodDefinition = methodDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallProperties[RequestType, ResponseType]]
  }
  @scala.inline
  implicit class CallPropertiesOps[Self <: CallProperties[_, _], RequestType, ResponseType] (val x: Self with (CallProperties[RequestType, ResponseType])) extends AnyVal {
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
    def setCall(value: SurfaceCall): Self = this.set("call", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallOptions(value: CallOptions): Self = this.set("callOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodDefinition(value: ClientMethodDefinition[RequestType, ResponseType]): Self = this.set("methodDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgument(value: RequestType): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    @scala.inline
    def setCallback(value: (/* err */ ServiceError | Null, /* value */ js.UndefOr[ResponseType]) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
  }
  
}

