package typings.atGrpcGrpcDashJs.buildSrcServerDashCallMod

import typings.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.Deserialize
import typings.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.Serialize
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidiStreamingHandler[RequestType, ResponseType] extends Handler[RequestType, ResponseType] {
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  @JSName("func")
  var func_Original: handleBidiStreamingCall[RequestType, ResponseType] = js.native
  @JSName("serialize")
  var serialize_Original: Serialize[ResponseType] = js.native
  var `type`: HandlerType = js.native
  def deserialize(bytes: Buffer): RequestType = js.native
  def func(call: ServerDuplexStream[RequestType, ResponseType]): Unit = js.native
  def serialize(value: ResponseType): Buffer = js.native
}

