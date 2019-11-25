package typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typings.atGrpcGrpcDashJs.buildSrcClientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "Client")
@js.native
class Client protected ()
  extends typings.atGrpcGrpcDashJs.buildSrcClientMod.Client {
  def this(
    address: String,
    credentials: typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials
  ) = this()
  def this(
    address: String,
    credentials: typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials,
    options: ClientOptions
  ) = this()
}

