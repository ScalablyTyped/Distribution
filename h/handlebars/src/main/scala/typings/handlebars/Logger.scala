package typings.handlebars

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var DEBUG: Double
  var ERROR: Double
  var INFO: Double
  var WARN: Double
  var level: Double
  var methodMap: NumberDictionary[String]
  def log(level: Double, obj: String): Unit
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
}

