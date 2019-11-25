package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGrpcGrpcDashJsMod {
  import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
  import typings.atGrpcGrpcDashJs.buildSrcCallMod.ClientDuplexStream
  import typings.atGrpcGrpcDashJs.buildSrcCallMod.ClientReadableStream
  import typings.atGrpcGrpcDashJs.buildSrcCallMod.ClientUnaryCall
  import typings.atGrpcGrpcDashJs.buildSrcCallMod.ClientWritableStream

  type Call = ClientUnaryCall | ClientReadableStream[js.Any] | ClientWritableStream[js.Any] | (ClientDuplexStream[js.Any, js.Any])
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, Unit]
  type MetadataListener = js.Function2[
    /* metadata */ typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata, 
    /* next */ js.Function, 
    Unit
  ]
  type StatusListener = js.Function2[/* status */ StatusObject, /* next */ js.Function, Unit]
}
