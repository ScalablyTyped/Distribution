package typings.logg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait loggingLevels extends js.Object {
  var FINE: Double
  var FINER: Double
  var FINEST: Double
  var INFO: Double
  var SEVERE: Double
  var WARN: Double
  def toString(level: Double): String
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
}

