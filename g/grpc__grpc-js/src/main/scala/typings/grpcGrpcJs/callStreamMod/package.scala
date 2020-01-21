package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object callStreamMod {
  type Call = typings.grpcGrpcJs.AnonCancelWithStatus with (typings.grpcGrpcJs.eventsMod.EmitterAugmentation1[
    typings.grpcGrpcJs.grpcGrpcJsStrings.metadata, 
    typings.grpcGrpcJs.metadataMod.Metadata
  ]) with (typings.grpcGrpcJs.eventsMod.EmitterAugmentation1[
    typings.grpcGrpcJs.grpcGrpcJsStrings.status, 
    typings.grpcGrpcJs.callStreamMod.StatusObject
  ]) with (typings.grpcGrpcJs.objectStreamMod.ObjectDuplex[typings.grpcGrpcJs.callStreamMod.WriteObject, typings.node.Buffer])
  type Deadline = typings.std.Date | scala.Double
  type PartialCallStreamOptions = typings.std.Partial[typings.grpcGrpcJs.callStreamMod.CallStreamOptions]
}
