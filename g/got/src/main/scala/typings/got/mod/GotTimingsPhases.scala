package typings.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotTimingsPhases extends js.Object {
  var dns: Double
  var download: Double
  var firstByte: Double
  var request: Double
  var tcp: Double
  var total: Double
  @JSName("wait")
  var wait_FGotTimingsPhases: Double
}

object GotTimingsPhases {
  @scala.inline
  def apply(
    dns: Double,
    download: Double,
    firstByte: Double,
    request: Double,
    tcp: Double,
    total: Double,
    wait: Double
  ): GotTimingsPhases = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], firstByte = firstByte.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tcp = tcp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GotTimingsPhases]
  }
}

