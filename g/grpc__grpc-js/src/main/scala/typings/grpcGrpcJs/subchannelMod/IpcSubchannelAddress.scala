package typings.grpcGrpcJs.subchannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpcSubchannelAddress extends SubchannelAddress {
  var path: String
}

object IpcSubchannelAddress {
  @scala.inline
  def apply(path: String): IpcSubchannelAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpcSubchannelAddress]
  }
}

