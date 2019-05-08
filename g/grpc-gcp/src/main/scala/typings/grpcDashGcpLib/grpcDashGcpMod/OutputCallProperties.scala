package typings
package grpcDashGcpLib.grpcDashGcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputCallProperties[RequestType, ResponseType] extends js.Object {
  var argument: js.UndefOr[js.Any] = js.undefined
  var call: grpcLib.grpcMod.ClientUnaryCall | grpcLib.grpcMod.ClientReadableStream[RequestType] | (grpcLib.grpcMod.ClientDuplexStream[RequestType, ResponseType]) | grpcLib.grpcMod.ClientWritableStream[RequestType]
  var callOptions: grpcLib.grpcMod.CallOptions
  var callback: js.UndefOr[js.Function] = js.undefined
  var channel: grpcLib.grpcMod.Channel
  var metadata: grpcLib.grpcMod.Metadata
  var methodDefinition: MethodDefinition[RequestType, ResponseType]
}

object OutputCallProperties {
  @scala.inline
  def apply[RequestType, ResponseType](
    call: grpcLib.grpcMod.ClientUnaryCall | grpcLib.grpcMod.ClientReadableStream[RequestType] | (grpcLib.grpcMod.ClientDuplexStream[RequestType, ResponseType]) | grpcLib.grpcMod.ClientWritableStream[RequestType],
    callOptions: grpcLib.grpcMod.CallOptions,
    channel: grpcLib.grpcMod.Channel,
    metadata: grpcLib.grpcMod.Metadata,
    methodDefinition: MethodDefinition[RequestType, ResponseType],
    argument: js.Any = null,
    callback: js.Function = null
  ): OutputCallProperties[RequestType, ResponseType] = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], callOptions = callOptions, channel = channel, metadata = metadata, methodDefinition = methodDefinition)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[OutputCallProperties[RequestType, ResponseType]]
  }
}

