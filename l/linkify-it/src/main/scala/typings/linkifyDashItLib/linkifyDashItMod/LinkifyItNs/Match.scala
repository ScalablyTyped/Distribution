package typings
package linkifyDashItLib.linkifyDashItMod.LinkifyItNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  var index: scala.Double
  var lastIndex: scala.Double
  var raw: java.lang.String
  var schema: java.lang.String
  var text: java.lang.String
  var url: java.lang.String
}

object Match {
  @scala.inline
  def apply(
    index: scala.Double,
    lastIndex: scala.Double,
    raw: java.lang.String,
    schema: java.lang.String,
    text: java.lang.String,
    url: java.lang.String
  ): Match = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("lastIndex")(lastIndex)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Match]
  }
}

