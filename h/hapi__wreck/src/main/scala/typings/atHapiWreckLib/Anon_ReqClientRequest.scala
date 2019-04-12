package typings
package atHapiWreckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReqClientRequest extends js.Object {
  var req: nodeLib.httpMod.ClientRequest
}

object Anon_ReqClientRequest {
  @scala.inline
  def apply(req: nodeLib.httpMod.ClientRequest): Anon_ReqClientRequest = {
    val __obj = js.Dynamic.literal(req = req)
  
    __obj.asInstanceOf[Anon_ReqClientRequest]
  }
}

