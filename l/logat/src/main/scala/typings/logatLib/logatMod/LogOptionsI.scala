package typings
package logatLib.logatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogOptionsI extends js.Object {
  var logFileName: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[scala.Double] = js.undefined
  var logMethod: js.UndefOr[scala.Double] = js.undefined
}

object LogOptionsI {
  @scala.inline
  def apply(
    logFileName: java.lang.String = null,
    logLevel: scala.Int | scala.Double = null,
    logMethod: scala.Int | scala.Double = null
  ): LogOptionsI = {
    val __obj = js.Dynamic.literal()
    if (logFileName != null) __obj.updateDynamic("logFileName")(logFileName)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logMethod != null) __obj.updateDynamic("logMethod")(logMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOptionsI]
  }
}

