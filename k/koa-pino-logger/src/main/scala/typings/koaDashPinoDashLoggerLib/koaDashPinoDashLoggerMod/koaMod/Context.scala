package typings
package koaDashPinoDashLoggerLib.koaDashPinoDashLoggerMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var log: pinoLib.pinoMod.PNs.Logger
}

object Context {
  @scala.inline
  def apply(log: pinoLib.pinoMod.PNs.Logger): Context = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[Context]
  }
}

