package typings.inlineStylePrefixer.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticData extends js.Object {
  var plugins: js.Array[Plugin]
  var prefixMap: Record[String, js.Array[String]]
}

object StaticData {
  @scala.inline
  def apply(plugins: js.Array[Plugin], prefixMap: Record[String, js.Array[String]]): StaticData = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], prefixMap = prefixMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticData]
  }
}

