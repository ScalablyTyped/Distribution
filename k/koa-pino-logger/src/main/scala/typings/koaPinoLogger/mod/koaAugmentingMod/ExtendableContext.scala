package typings.koaPinoLogger.mod.koaAugmentingMod

import typings.pino.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendableContext extends js.Object {
  var log: Logger = js.native
}

object ExtendableContext {
  @scala.inline
  def apply(log: Logger): ExtendableContext = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendableContext]
  }
  @scala.inline
  implicit class ExtendableContextOps[Self <: ExtendableContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLog(value: Logger): Self = this.set("log", value.asInstanceOf[js.Any])
  }
  
}

