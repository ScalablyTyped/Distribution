package typings.grpcGrpcJs.makeClientMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientMethodDefinition[RequestType, ResponseType] extends js.Object {
  var originalName: js.UndefOr[String] = js.native
  var path: String = js.native
  @JSName("requestSerialize")
  var requestSerialize_Original: Serialize[RequestType] = js.native
  var requestStream: Boolean = js.native
  @JSName("responseDeserialize")
  var responseDeserialize_Original: Deserialize[ResponseType] = js.native
  var responseStream: Boolean = js.native
  def requestSerialize(value: RequestType): Buffer = js.native
  def responseDeserialize(bytes: Buffer): ResponseType = js.native
}

