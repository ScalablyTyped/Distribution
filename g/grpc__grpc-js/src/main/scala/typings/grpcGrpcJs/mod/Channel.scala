package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.channelMod.ChannelImplementation
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js", "Channel")
@js.native
class Channel protected () extends ChannelImplementation {
  def this(
    target: String,
    credentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
    options: ChannelOptions
  ) = this()
}
