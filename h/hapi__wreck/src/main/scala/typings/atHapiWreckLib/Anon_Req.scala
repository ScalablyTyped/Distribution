package typings
package atHapiWreckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  var req: nodeLib.httpMod.ClientRequest
  var res: js.UndefOr[nodeLib.httpMod.IncomingMessage] = js.undefined
  var start: scala.Double
  var url: nodeLib.urlMod.URL
}

object Anon_Req {
  @scala.inline
  def apply(
    req: nodeLib.httpMod.ClientRequest,
    start: scala.Double,
    url: nodeLib.urlMod.URL,
    res: nodeLib.httpMod.IncomingMessage = null
  ): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req, start = start, url = url)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Req]
  }
}

