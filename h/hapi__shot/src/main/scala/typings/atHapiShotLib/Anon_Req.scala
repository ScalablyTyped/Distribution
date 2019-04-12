package typings
package atHapiShotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  /** the simulated request object. */
  var req: atHapiShotLib.atHapiShotMod.SimulatedRequestObject
  /** the simulated response object. */
  var res: atHapiShotLib.atHapiShotMod.SimulatedResponseObject
}

object Anon_Req {
  @scala.inline
  def apply(
    req: atHapiShotLib.atHapiShotMod.SimulatedRequestObject,
    res: atHapiShotLib.atHapiShotMod.SimulatedResponseObject
  ): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req, res = res)
  
    __obj.asInstanceOf[Anon_Req]
  }
}

