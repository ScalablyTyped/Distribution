package typings.handlebars

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var DEBUG: Double = js.native
  var ERROR: Double = js.native
  var INFO: Double = js.native
  var WARN: Double = js.native
  var level: Double = js.native
  var methodMap: NumberDictionary[String] = js.native
  def log(level: Double, obj: String): Unit = js.native
}

object Logger {
  @scala.inline
  def apply(
    DEBUG: Double,
    ERROR: Double,
    INFO: Double,
    WARN: Double,
    level: Double,
    log: (Double, String) => Unit,
    methodMap: NumberDictionary[String]
  ): Logger = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], log = js.Any.fromFunction2(log), methodMap = methodMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
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
    def setDEBUG(value: Double): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR(value: Double): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINFO(value: Double): Self = this.set("INFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setWARN(value: Double): Self = this.set("WARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: (Double, String) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
    @scala.inline
    def setMethodMap(value: NumberDictionary[String]): Self = this.set("methodMap", value.asInstanceOf[js.Any])
  }
  
}

