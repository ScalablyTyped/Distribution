package typings.atHapiShot

import typings.atHapiShot.atHapiShotMod.SimulatedRequestObject
import typings.atHapiShot.atHapiShotMod.SimulatedResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  /** the simulated request object. */
  var req: SimulatedRequestObject
  /** the simulated response object. */
  var res: SimulatedResponseObject
}

object Anon_Req {
  @scala.inline
  def apply(req: SimulatedRequestObject, res: SimulatedResponseObject): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Req]
  }
}

