package typings.koaDashPinoDashLogger.koaDashPinoDashLoggerMod.koaMod

import typings.pino.pinoMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendableContext extends js.Object {
  var log: Logger
}

object ExtendableContext {
  @scala.inline
  def apply(log: Logger): ExtendableContext = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[ExtendableContext]
  }
}

