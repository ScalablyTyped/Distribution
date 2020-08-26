package typings.logg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait loggingLevels extends js.Object {
  var FINE: Double = js.native
  var FINER: Double = js.native
  var FINEST: Double = js.native
  var INFO: Double = js.native
  var SEVERE: Double = js.native
  var WARN: Double = js.native
  def toString(level: Double): String = js.native
}

object loggingLevels {
  @scala.inline
  def apply(
    FINE: Double,
    FINER: Double,
    FINEST: Double,
    INFO: Double,
    SEVERE: Double,
    WARN: Double,
    toString: Double => String
  ): loggingLevels = {
    val __obj = js.Dynamic.literal(FINE = FINE.asInstanceOf[js.Any], FINER = FINER.asInstanceOf[js.Any], FINEST = FINEST.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SEVERE = SEVERE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[loggingLevels]
  }
  @scala.inline
  implicit class loggingLevelsOps[Self <: loggingLevels] (val x: Self) extends AnyVal {
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
    def setFINE(value: Double): Self = this.set("FINE", value.asInstanceOf[js.Any])
    @scala.inline
    def setFINER(value: Double): Self = this.set("FINER", value.asInstanceOf[js.Any])
    @scala.inline
    def setFINEST(value: Double): Self = this.set("FINEST", value.asInstanceOf[js.Any])
    @scala.inline
    def setINFO(value: Double): Self = this.set("INFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setSEVERE(value: Double): Self = this.set("SEVERE", value.asInstanceOf[js.Any])
    @scala.inline
    def setWARN(value: Double): Self = this.set("WARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setToString(value: Double => String): Self = this.set("toString", js.Any.fromFunction1(value))
  }
  
}

