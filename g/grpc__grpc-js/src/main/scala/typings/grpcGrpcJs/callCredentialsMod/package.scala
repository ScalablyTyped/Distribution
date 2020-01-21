package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object callCredentialsMod {
  type CallMetadataGenerator = js.Function2[
    /* options */ typings.grpcGrpcJs.callCredentialsMod.CallMetadataOptions, 
    /* cb */ js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* metadata */ js.UndefOr[typings.grpcGrpcJs.metadataMod.Metadata], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
