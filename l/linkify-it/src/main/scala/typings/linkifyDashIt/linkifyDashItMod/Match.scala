package typings.linkifyDashIt.linkifyDashItMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  var index: Double
  var lastIndex: Double
  var raw: String
  var schema: String
  var text: String
  var url: String
}

object Match {
  @scala.inline
  def apply(index: Double, lastIndex: Double, raw: String, schema: String, text: String, url: String): Match = {
    val __obj = js.Dynamic.literal(index = index, lastIndex = lastIndex, raw = raw, schema = schema, text = text, url = url)
  
    __obj.asInstanceOf[Match]
  }
}

