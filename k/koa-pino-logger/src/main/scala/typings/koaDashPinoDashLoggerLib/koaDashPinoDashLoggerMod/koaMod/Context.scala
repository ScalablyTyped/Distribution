package typings
package koaDashPinoDashLoggerLib.koaDashPinoDashLoggerMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var log: pinoLib.pinoMod.Logger
}

object Context {
  @scala.inline
  def apply(log: pinoLib.pinoMod.Logger): Context = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[Context]
  }
}

