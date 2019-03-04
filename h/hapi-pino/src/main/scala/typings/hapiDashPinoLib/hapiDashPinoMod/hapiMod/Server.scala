package typings
package hapiDashPinoLib.hapiDashPinoMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  def logger(): pinoLib.pinoMod.PNs.Logger
}

object Server {
  @scala.inline
  def apply(logger: js.Function0[pinoLib.pinoMod.PNs.Logger]): Server = {
    val __obj = js.Dynamic.literal(logger = logger)
  
    __obj.asInstanceOf[Server]
  }
}

