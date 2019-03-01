package typings
package inlineDashStyleDashPrefixerLib.inlineDashStyleDashPrefixerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticData extends js.Object {
  var plugins: js.Array[Plugin]
  var prefixMap: stdLib.Record[java.lang.String, js.Array[java.lang.String]]
}

object StaticData {
  @scala.inline
  def apply(plugins: js.Array[Plugin], prefixMap: stdLib.Record[java.lang.String, js.Array[java.lang.String]]): StaticData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plugins")(plugins)
    __obj.updateDynamic("prefixMap")(prefixMap)
    __obj.asInstanceOf[StaticData]
  }
}

