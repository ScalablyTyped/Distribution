package typings.got.gotMod

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
    val __obj = js.Dynamic.literal(dns = dns, download = download, firstByte = firstByte, request = request, tcp = tcp, total = total, wait = wait)
  
    __obj.asInstanceOf[GotTimingsPhases]
  }
}

