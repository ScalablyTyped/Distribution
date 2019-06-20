package typings
package log4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appenders extends js.Object {
  var appenders: js.Array[java.lang.String]
  var enableCallStack: js.UndefOr[scala.Boolean] = js.undefined
  var level: java.lang.String
}

object Anon_Appenders {
  @scala.inline
  def apply(
    appenders: js.Array[java.lang.String],
    level: java.lang.String,
    enableCallStack: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Appenders = {
    val __obj = js.Dynamic.literal(appenders = appenders, level = level)
    if (!js.isUndefined(enableCallStack)) __obj.updateDynamic("enableCallStack")(enableCallStack)
    __obj.asInstanceOf[Anon_Appenders]
  }
}

