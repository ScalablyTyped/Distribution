package typings.libraDashCore.libAtGeneratedMempoolUnderscoreGrpcUnderscorePbMod

import typings.grpc.grpcMod.ChannelCredentials
import typings.grpc.grpcMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_grpc_pb", "MempoolClient")
@js.native
class MempoolClient protected ()
  extends Client
     with IMempoolClient {
  def this(address: String, credentials: ChannelCredentials) = this()
  def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
}

