package typings
package gulpDashJspmLib.gulpDashJspmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arithmetic: js.UndefOr[java.lang.String] = js.undefined
  var inject: js.UndefOr[scala.Boolean] = js.undefined
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  var plugin: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var selfExecutingBundle: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arithmetic: java.lang.String = null,
    inject: js.UndefOr[scala.Boolean] = js.undefined,
    minify: js.UndefOr[scala.Boolean] = js.undefined,
    plugin: scala.Boolean | java.lang.String = null,
    selfExecutingBundle: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arithmetic != null) __obj.updateDynamic("arithmetic")(arithmetic)
    if (!js.isUndefined(inject)) __obj.updateDynamic("inject")(inject)
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (!js.isUndefined(selfExecutingBundle)) __obj.updateDynamic("selfExecutingBundle")(selfExecutingBundle)
    __obj.asInstanceOf[Options]
  }
}

