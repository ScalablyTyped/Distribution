package typings.logat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogOptionsI extends js.Object {
  var logFileName: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[Double] = js.undefined
  var logMethod: js.UndefOr[Double] = js.undefined
}

object LogOptionsI {
  @scala.inline
  def apply(logFileName: String = null, logLevel: Int | Double = null, logMethod: Int | Double = null): LogOptionsI = {
    val __obj = js.Dynamic.literal()
    if (logFileName != null) __obj.updateDynamic("logFileName")(logFileName.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logMethod != null) __obj.updateDynamic("logMethod")(logMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOptionsI]
  }
}

