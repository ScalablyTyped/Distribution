package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Call = typings.grpcGrpcJs.callMod.ClientUnaryCall | typings.grpcGrpcJs.callMod.ClientReadableStream[js.Any] | typings.grpcGrpcJs.callMod.ClientWritableStream[js.Any] | (typings.grpcGrpcJs.callMod.ClientDuplexStream[js.Any, js.Any])
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  type MetadataListener = js.Function2[
    /* metadata */ typings.grpcGrpcJs.metadataMod.Metadata, 
    /* next */ js.Function, 
    scala.Unit
  ]
  type StatusListener = js.Function2[
    /* status */ typings.grpcGrpcJs.callStreamMod.StatusObject, 
    /* next */ js.Function, 
    scala.Unit
  ]
}
