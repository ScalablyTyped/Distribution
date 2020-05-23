package typings.grpcGrpcJs.serverCallMod

import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/server-call.ServerStatusResponse & std.Error */
trait ServerErrorResponse extends js.Object {
  var code: js.UndefOr[Status] = js.undefined
  var details: js.UndefOr[String] = js.undefined
  var message: String
  var metadata: js.UndefOr[Metadata] = js.undefined
  var name: String
  var stack: js.UndefOr[String] = js.undefined
}

object ServerErrorResponse {
  @scala.inline
  def apply(
    message: String,
    name: String,
    code: Status = null,
    details: String = null,
    metadata: Metadata = null,
    stack: String = null
  ): ServerErrorResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerErrorResponse]
  }
}

