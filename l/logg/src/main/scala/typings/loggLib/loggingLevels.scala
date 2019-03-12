package typings
package loggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait loggingLevels extends js.Object {
  var FINE: scala.Double
  var FINER: scala.Double
  var FINEST: scala.Double
  var INFO: scala.Double
  var SEVERE: scala.Double
  var WARN: scala.Double
  def toString(level: scala.Double): java.lang.String
}

object loggingLevels {
  @scala.inline
  def apply(
    FINE: scala.Double,
    FINER: scala.Double,
    FINEST: scala.Double,
    INFO: scala.Double,
    SEVERE: scala.Double,
    WARN: scala.Double,
    toString: scala.Double => java.lang.String
  ): loggingLevels = {
    val __obj = js.Dynamic.literal(FINE = FINE, FINER = FINER, FINEST = FINEST, INFO = INFO, SEVERE = SEVERE, WARN = WARN, toString = js.Any.fromFunction1(toString))
  
    __obj.asInstanceOf[loggingLevels]
  }
}

