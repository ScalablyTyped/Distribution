package typings.gulpJspm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arithmetic: js.UndefOr[String] = js.undefined
  var inject: js.UndefOr[Boolean] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var plugin: js.UndefOr[Boolean | String] = js.undefined
  var selfExecutingBundle: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arithmetic: String = null,
    inject: js.UndefOr[Boolean] = js.undefined,
    minify: js.UndefOr[Boolean] = js.undefined,
    plugin: Boolean | String = null,
    selfExecutingBundle: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arithmetic != null) __obj.updateDynamic("arithmetic")(arithmetic.asInstanceOf[js.Any])
    if (!js.isUndefined(inject)) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (!js.isUndefined(selfExecutingBundle)) __obj.updateDynamic("selfExecutingBundle")(selfExecutingBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

