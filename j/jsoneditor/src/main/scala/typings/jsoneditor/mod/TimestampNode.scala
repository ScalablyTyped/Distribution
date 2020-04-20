package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampNode extends js.Object {
  var field: String
  var path: js.Array[String]
  var value: String
}

object TimestampNode {
  @scala.inline
  def apply(field: String, path: js.Array[String], value: String): TimestampNode = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampNode]
  }
}

