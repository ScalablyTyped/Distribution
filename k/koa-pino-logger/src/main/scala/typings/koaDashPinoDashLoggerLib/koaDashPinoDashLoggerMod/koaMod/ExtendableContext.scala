package typings
package koaDashPinoDashLoggerLib.koaDashPinoDashLoggerMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendableContext extends js.Object {
  var log: pinoLib.pinoMod.Logger
}

object ExtendableContext {
  @scala.inline
  def apply(log: pinoLib.pinoMod.Logger): ExtendableContext = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[ExtendableContext]
  }
}

