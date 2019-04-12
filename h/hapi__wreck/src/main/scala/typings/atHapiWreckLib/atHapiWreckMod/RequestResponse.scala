package typings
package atHapiWreckLib.atHapiWreckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResponse extends js.Object {
  var payload: js.Any
  var res: nodeLib.httpMod.IncomingMessage
}

object RequestResponse {
  @scala.inline
  def apply(payload: js.Any, res: nodeLib.httpMod.IncomingMessage): RequestResponse = {
    val __obj = js.Dynamic.literal(payload = payload, res = res)
  
    __obj.asInstanceOf[RequestResponse]
  }
}

