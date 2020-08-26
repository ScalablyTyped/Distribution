package typings.imagemin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var destination: js.UndefOr[String] = js.native
  var glob: js.UndefOr[Boolean] = js.native
  var plugins: js.Array[Plugin] = js.native
}

object Options {
  @scala.inline
  def apply(plugins: js.Array[Plugin]): Options = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
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
    def setPluginsVarargs(value: Plugin*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[Plugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setGlob(value: Boolean): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
  }
  
}

