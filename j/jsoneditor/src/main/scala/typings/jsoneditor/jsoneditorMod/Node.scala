package typings.jsoneditor.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var field: String
  var path: JSONPath
  var value: js.UndefOr[String] = js.undefined
}

object Node {
  @scala.inline
  def apply(field: String, path: JSONPath, value: String = null): Node = {
    val __obj = js.Dynamic.literal(field = field, path = path)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Node]
  }
}

