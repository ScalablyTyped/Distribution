package typings.log4js

import typings.log4js.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[Format] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var nolog: js.UndefOr[js.Any] = js.undefined
  var statusRules: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply(
    context: js.UndefOr[Boolean] = js.undefined,
    format: Format = null,
    level: String = null,
    nolog: js.Any = null,
    statusRules: js.Array[_] = null
  ): AnonContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (nolog != null) __obj.updateDynamic("nolog")(nolog.asInstanceOf[js.Any])
    if (statusRules != null) __obj.updateDynamic("statusRules")(statusRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

