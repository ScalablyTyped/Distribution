package typings.log4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appenders extends js.Object {
  var appenders: js.Array[String]
  var enableCallStack: js.UndefOr[Boolean] = js.undefined
  var level: String
}

object Anon_Appenders {
  @scala.inline
  def apply(appenders: js.Array[String], level: String, enableCallStack: js.UndefOr[Boolean] = js.undefined): Anon_Appenders = {
    val __obj = js.Dynamic.literal(appenders = appenders, level = level)
    if (!js.isUndefined(enableCallStack)) __obj.updateDynamic("enableCallStack")(enableCallStack)
    __obj.asInstanceOf[Anon_Appenders]
  }
}

