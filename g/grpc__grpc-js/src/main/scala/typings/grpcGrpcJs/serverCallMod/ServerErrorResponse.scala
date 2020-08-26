package typings.grpcGrpcJs.serverCallMod

import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @grpc/grpc-js.@grpc/grpc-js/build/src/server-call.ServerStatusResponse & std.Error */
@js.native
trait ServerErrorResponse extends js.Object {
  var code: js.UndefOr[Status] = js.native
  var details: js.UndefOr[String] = js.native
  var message: String = js.native
  var metadata: js.UndefOr[Metadata] = js.native
  var name: String = js.native
  var stack: js.UndefOr[String] = js.native
}

object ServerErrorResponse {
  @scala.inline
  def apply(message: String, name: String): ServerErrorResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerErrorResponse]
  }
  @scala.inline
  implicit class ServerErrorResponseOps[Self <: ServerErrorResponse] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Status): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

