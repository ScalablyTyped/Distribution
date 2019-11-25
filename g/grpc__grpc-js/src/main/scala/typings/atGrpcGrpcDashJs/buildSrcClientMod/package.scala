package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcClientMod {
  import typings.atGrpcGrpcDashJs.Anon_Address
  import typings.atGrpcGrpcDashJs.buildSrcCallMod.ServiceError
  import typings.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod.ChannelOptions
  import typings.std.Partial

  type ClientOptions = Partial[ChannelOptions] with Anon_Address
  type UnaryCallback[ResponseType] = js.Function2[/* err */ ServiceError | Null, /* value */ js.UndefOr[ResponseType], Unit]
}
