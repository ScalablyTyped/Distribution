package typings.log4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[typings.log4js.mod.Format] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var nolog: js.UndefOr[js.Any] = js.undefined
  var statusRules: js.UndefOr[js.Array[_]] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    context: js.UndefOr[Boolean] = js.undefined,
    format: typings.log4js.mod.Format = null,
    level: String = null,
    nolog: js.Any = null,
    statusRules: js.Array[_] = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (nolog != null) __obj.updateDynamic("nolog")(nolog.asInstanceOf[js.Any])
    if (statusRules != null) __obj.updateDynamic("statusRules")(statusRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

