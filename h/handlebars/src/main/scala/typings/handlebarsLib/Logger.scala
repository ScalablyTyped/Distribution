package typings
package handlebarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var DEBUG: scala.Double
  var ERROR: scala.Double
  var INFO: scala.Double
  var WARN: scala.Double
  var level: scala.Double
  var methodMap: org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  def log(level: scala.Double, obj: java.lang.String): scala.Unit
}

object Logger {
  @scala.inline
  def apply(
    DEBUG: scala.Double,
    ERROR: scala.Double,
    INFO: scala.Double,
    WARN: scala.Double,
    level: scala.Double,
    log: js.Function2[scala.Double, java.lang.String, scala.Unit],
    methodMap: org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  ): Logger = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG, ERROR = ERROR, INFO = INFO, WARN = WARN, level = level, log = log, methodMap = methodMap)
  
    __obj.asInstanceOf[Logger]
  }
}

