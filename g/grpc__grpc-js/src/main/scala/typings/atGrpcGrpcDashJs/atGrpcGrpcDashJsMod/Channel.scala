package typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typings.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod.ChannelOptions
import typings.atGrpcGrpcDashJs.buildSrcChannelMod.ChannelImplementation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "Channel")
@js.native
class Channel protected () extends ChannelImplementation {
  def this(
    target: String,
    credentials: typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials,
    options: ChannelOptions
  ) = this()
}

