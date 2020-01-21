package typings.log4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppenders extends js.Object {
  var appenders: js.Array[String]
  var enableCallStack: js.UndefOr[Boolean] = js.undefined
  var level: String
}

object AnonAppenders {
  @scala.inline
  def apply(appenders: js.Array[String], level: String, enableCallStack: js.UndefOr[Boolean] = js.undefined): AnonAppenders = {
    val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCallStack)) __obj.updateDynamic("enableCallStack")(enableCallStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppenders]
  }
}

