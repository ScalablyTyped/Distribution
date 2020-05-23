package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var debug: js.UndefOr[LogFn] = js.undefined
  var deprecate: js.UndefOr[js.Function2[/* method */ String, /* alternative */ String, Unit]] = js.undefined
  var enableColors: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[LogFn] = js.undefined
  var inspectionDepth: js.UndefOr[Double] = js.undefined
  var warn: js.UndefOr[LogFn] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    debug: /* message */ js.Any => Unit = null,
    deprecate: (/* method */ String, /* alternative */ String) => Unit = null,
    enableColors: js.UndefOr[Boolean] = js.undefined,
    error: /* message */ js.Any => Unit = null,
    inspectionDepth: js.UndefOr[Double] = js.undefined,
    warn: /* message */ js.Any => Unit = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (deprecate != null) __obj.updateDynamic("deprecate")(js.Any.fromFunction2(deprecate))
    if (!js.isUndefined(enableColors)) __obj.updateDynamic("enableColors")(enableColors.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (!js.isUndefined(inspectionDepth)) __obj.updateDynamic("inspectionDepth")(inspectionDepth.get.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
}

