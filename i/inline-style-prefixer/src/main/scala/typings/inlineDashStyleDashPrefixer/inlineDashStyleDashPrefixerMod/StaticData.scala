package typings.inlineDashStyleDashPrefixer.inlineDashStyleDashPrefixerMod

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
    val __obj = js.Dynamic.literal(plugins = plugins, prefixMap = prefixMap)
  
    __obj.asInstanceOf[StaticData]
  }
}

