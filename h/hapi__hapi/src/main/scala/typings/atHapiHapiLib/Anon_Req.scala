package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  var req: nodeLib.httpMod.IncomingMessage
  var res: nodeLib.httpMod.ServerResponse
}

object Anon_Req {
  @scala.inline
  def apply(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req, res = res)
  
    __obj.asInstanceOf[Anon_Req]
  }
}

