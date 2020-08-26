package typings.inlineStylePrefixer.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticData extends js.Object {
  var plugins: js.Array[Plugin] = js.native
  var prefixMap: Record[String, js.Array[String]] = js.native
}

object StaticData {
  @scala.inline
  def apply(plugins: js.Array[Plugin], prefixMap: Record[String, js.Array[String]]): StaticData = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], prefixMap = prefixMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticData]
  }
  @scala.inline
  implicit class StaticDataOps[Self <: StaticData] (val x: Self) extends AnyVal {
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
    def setPrefixMap(value: Record[String, js.Array[String]]): Self = this.set("prefixMap", value.asInstanceOf[js.Any])
  }
  
}

