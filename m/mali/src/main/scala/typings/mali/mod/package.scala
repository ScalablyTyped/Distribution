package typings.mali

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GrpcCall = typings.grpc.mod.ServerUnaryCall[js.Any] | typings.grpc.mod.ServerReadableStream[js.Any] | typings.grpc.mod.ServerWriteableStream[js.Any] | (typings.grpc.mod.ServerDuplexStream[js.Any, js.Any])
  type GrpcRequest = js.Any
  type GrpcResponse = js.Any
}
