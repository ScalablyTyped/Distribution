package typings.grpcGrpcJs.pickerMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/picker", "UnavailablePicker")
@js.native
class UnavailablePicker () extends Picker {
  def this(status: StatusObject) = this()
  
  var status: js.Any = js.native
}
