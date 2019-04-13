package typings
package linkifyDashItLib.linkifyDashItMod

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
    val __obj = js.Dynamic.literal(index = index, lastIndex = lastIndex, raw = raw, schema = schema, text = text, url = url)
  
    __obj.asInstanceOf[Match]
  }
}

