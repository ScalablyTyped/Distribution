package typings.grpcGrpcJs.subchannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpSubchannelAddress extends SubchannelAddress {
  var host: String
  var port: Double
}

object TcpSubchannelAddress {
  @scala.inline
  def apply(host: String, port: Double): TcpSubchannelAddress = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpSubchannelAddress]
  }
}

