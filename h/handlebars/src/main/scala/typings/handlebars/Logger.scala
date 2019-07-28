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
    val __obj = js.Dynamic.literal(DEBUG = DEBUG, ERROR = ERROR, INFO = INFO, WARN = WARN, level = level, log = js.Any.fromFunction2(log), methodMap = methodMap)
  
    __obj.asInstanceOf[Logger]
  }
}

