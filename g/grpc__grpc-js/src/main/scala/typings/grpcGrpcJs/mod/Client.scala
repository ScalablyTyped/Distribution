package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.clientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "Client")
@js.native
class Client protected ()
  extends typings.grpcGrpcJs.clientMod.Client {
  def this(address: String, credentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials) = this()
  def this(
    address: String,
    credentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
    options: ClientOptions
  ) = this()
}

