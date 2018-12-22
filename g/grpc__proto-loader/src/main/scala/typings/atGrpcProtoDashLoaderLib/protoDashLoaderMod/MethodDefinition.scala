package typings
package atGrpcProtoDashLoaderLib.protoDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDefinition[RequestType, ResponseType] extends js.Object {
  var originalName: js.UndefOr[java.lang.String] = js.native
  var path: java.lang.String = js.native
  @JSName("requestDeserialize")
  var requestDeserialize_Original: Deserialize[RequestType] = js.native
  @JSName("requestSerialize")
  var requestSerialize_Original: Serialize[RequestType] = js.native
  var requestStream: scala.Boolean = js.native
  @JSName("responseDeserialize")
  var responseDeserialize_Original: Deserialize[ResponseType] = js.native
  @JSName("responseSerialize")
  var responseSerialize_Original: Serialize[ResponseType] = js.native
  var responseStream: scala.Boolean = js.native
  def requestDeserialize(bytes: nodeLib.Buffer): RequestType = js.native
  def requestSerialize(value: RequestType): nodeLib.Buffer = js.native
  def responseDeserialize(bytes: nodeLib.Buffer): ResponseType = js.native
  def responseSerialize(value: ResponseType): nodeLib.Buffer = js.native
}

