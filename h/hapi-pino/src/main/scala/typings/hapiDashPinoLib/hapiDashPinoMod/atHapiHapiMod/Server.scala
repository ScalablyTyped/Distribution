package typings
package hapiDashPinoLib.hapiDashPinoMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  def logger(): pinoLib.pinoMod.Logger
}

object Server {
  @scala.inline
  def apply(logger: () => pinoLib.pinoMod.Logger): Server = {
    val __obj = js.Dynamic.literal(logger = js.Any.fromFunction0(logger))
  
    __obj.asInstanceOf[Server]
  }
}

