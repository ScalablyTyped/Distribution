package typings.libraCore.mempoolGrpcPbMod

import typings.grpc.mod.ChannelCredentials
import typings.grpc.mod.Client
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

