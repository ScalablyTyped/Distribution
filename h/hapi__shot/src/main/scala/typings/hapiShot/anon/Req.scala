package typings.hapiShot.anon

import typings.hapiShot.mod.SimulatedRequestObject
import typings.hapiShot.mod.SimulatedResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Req extends js.Object {
  /** the simulated request object. */
  var req: SimulatedRequestObject
  /** the simulated response object. */
  var res: SimulatedResponseObject
}

object Req {
  @scala.inline
  def apply(req: SimulatedRequestObject, res: SimulatedResponseObject): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
}

