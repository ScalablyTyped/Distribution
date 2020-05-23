package typings.gulpAutoprefixer.mod

import typings.gulpAutoprefixer.gulpAutoprefixerBooleans.`false`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.`no-2009`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.`no-autoplace`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.autoplace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var add: js.UndefOr[Boolean] = js.undefined
  var browsers: js.UndefOr[js.Array[String]] = js.undefined
  var cascade: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var flexbox: js.UndefOr[Boolean | `no-2009`] = js.undefined
  var grid: js.UndefOr[`false` | autoplace | `no-autoplace`] = js.undefined
  var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var stats: js.UndefOr[js.Object] = js.undefined
  var supports: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    browsers: js.Array[String] = null,
    cascade: js.UndefOr[Boolean] = js.undefined,
    env: String = null,
    flexbox: Boolean | `no-2009` = null,
    grid: `false` | autoplace | `no-autoplace` = null,
    ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    stats: js.Object = null,
    supports: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.get.asInstanceOf[js.Any])
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.get.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (flexbox != null) __obj.updateDynamic("flexbox")(flexbox.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownVersions)) __obj.updateDynamic("ignoreUnknownVersions")(ignoreUnknownVersions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(supports)) __obj.updateDynamic("supports")(supports.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

