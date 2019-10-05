package typings.mali

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object maliMod {
  import typings.grpc.grpcMod.ServerDuplexStream
  import typings.grpc.grpcMod.ServerReadableStream
  import typings.grpc.grpcMod.ServerUnaryCall
  import typings.grpc.grpcMod.ServerWriteableStream

  type GrpcCall = ServerUnaryCall[js.Any] | ServerReadableStream[js.Any] | ServerWriteableStream[js.Any] | (ServerDuplexStream[js.Any, js.Any])
}
