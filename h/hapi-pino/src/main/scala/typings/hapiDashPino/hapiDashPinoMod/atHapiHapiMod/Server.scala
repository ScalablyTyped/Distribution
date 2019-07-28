package typings.hapiDashPino.hapiDashPinoMod.atHapiHapiMod

import typings.pino.pinoMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  def logger(): Logger
}

object Server {
  @scala.inline
  def apply(logger: () => Logger): Server = {
    val __obj = js.Dynamic.literal(logger = js.Any.fromFunction0(logger))
  
    __obj.asInstanceOf[Server]
  }
}

