package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCallDashStreamMod {
  import typings.atGrpcGrpcDashJs.Anon_CancelWithStatus
  import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.metadata
  import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.status
  import typings.atGrpcGrpcDashJs.buildSrcEventsMod.EmitterAugmentation1
  import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
  import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectDuplex
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Partial

  type Call = Anon_CancelWithStatus with (EmitterAugmentation1[metadata, Metadata]) with (EmitterAugmentation1[status, StatusObject]) with (ObjectDuplex[WriteObject, Buffer])
  type Deadline = Date | Double
  type PartialCallStreamOptions = Partial[CallStreamOptions]
}
