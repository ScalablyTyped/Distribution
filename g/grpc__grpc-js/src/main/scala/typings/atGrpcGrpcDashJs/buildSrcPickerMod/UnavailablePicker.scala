package typings.atGrpcGrpcDashJs.buildSrcPickerMod

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/picker", "UnavailablePicker")
@js.native
class UnavailablePicker () extends Picker {
  def this(status: StatusObject) = this()
  var status: js.Any = js.native
  /* CompleteClass */
  override def pick(pickArgs: PickArgs): PickResult = js.native
}

