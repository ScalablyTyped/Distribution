package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCallDashCredentialsMod {
  import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
  import typings.std.Error

  type CallMetadataGenerator = js.Function2[
    /* options */ CallMetadataOptions, 
    /* cb */ js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[Metadata], Unit], 
    Unit
  ]
}
