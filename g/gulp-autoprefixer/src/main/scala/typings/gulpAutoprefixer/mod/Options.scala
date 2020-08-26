package typings.gulpAutoprefixer.mod

import typings.gulpAutoprefixer.gulpAutoprefixerBooleans.`false`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.`no-2009`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.`no-autoplace`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.autoplace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var add: js.UndefOr[Boolean] = js.native
  var browsers: js.UndefOr[js.Array[String]] = js.native
  var cascade: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[String] = js.native
  var flexbox: js.UndefOr[Boolean | `no-2009`] = js.native
  var grid: js.UndefOr[`false` | autoplace | `no-autoplace`] = js.native
  var ignoreUnknownVersions: js.UndefOr[Boolean] = js.native
  var remove: js.UndefOr[Boolean] = js.native
  var stats: js.UndefOr[js.Object] = js.native
  var supports: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setBrowsersVarargs(value: String*): Self = this.set("browsers", js.Array(value :_*))
    @scala.inline
    def setBrowsers(value: js.Array[String]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    @scala.inline
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setFlexbox(value: Boolean | `no-2009`): Self = this.set("flexbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexbox: Self = this.set("flexbox", js.undefined)
    @scala.inline
    def setGrid(value: `false` | autoplace | `no-autoplace`): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setIgnoreUnknownVersions(value: Boolean): Self = this.set("ignoreUnknownVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnknownVersions: Self = this.set("ignoreUnknownVersions", js.undefined)
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setStats(value: js.Object): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setSupports(value: Boolean): Self = this.set("supports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupports: Self = this.set("supports", js.undefined)
  }
  
}

