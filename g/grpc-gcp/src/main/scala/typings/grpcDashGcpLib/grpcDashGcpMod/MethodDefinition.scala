package typings
package grpcDashGcpLib.grpcDashGcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDefinition[RequestType, ResponseType] extends js.Object {
  var path: java.lang.String = js.native
  @JSName("requestSerialize")
  var requestSerialize_Original: grpcLib.grpcMod.serialize[RequestType] = js.native
  var requestStream: scala.Boolean = js.native
  @JSName("responseDeserialize")
  var responseDeserialize_Original: grpcLib.grpcMod.deserialize[ResponseType] = js.native
  var responseStream: scala.Boolean = js.native
  def requestSerialize(value: RequestType): nodeLib.Buffer = js.native
  def responseDeserialize(data: nodeLib.Buffer): ResponseType = js.native
}

