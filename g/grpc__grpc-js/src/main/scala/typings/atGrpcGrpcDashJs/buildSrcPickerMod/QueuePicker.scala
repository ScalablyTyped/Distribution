package typings.atGrpcGrpcDashJs.buildSrcPickerMod

import typings.atGrpcGrpcDashJs.buildSrcLoadDashBalancerMod.LoadBalancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/picker", "QueuePicker")
@js.native
class QueuePicker protected () extends js.Object {
  def this(loadBalancer: LoadBalancer) = this()
  var calledExitIdle: js.Any = js.native
  var loadBalancer: js.Any = js.native
  def pick(pickArgs: PickArgs): QueuePickResult = js.native
}

