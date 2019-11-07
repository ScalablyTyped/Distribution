package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscoreGrpcUnderscorePbMod

import typings.grpc.grpcMod.ChannelCredentials
import typings.grpc.grpcMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/admission_control_grpc_pb", "AdmissionControlClient")
@js.native
class AdmissionControlClient protected ()
  extends Client
     with IAdmissionControlClient {
  def this(address: String, credentials: ChannelCredentials) = this()
  def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
}

