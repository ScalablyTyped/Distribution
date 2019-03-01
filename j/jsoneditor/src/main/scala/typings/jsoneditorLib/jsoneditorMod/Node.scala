package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var field: java.lang.String
  var path: JSONPath
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Node {
  @scala.inline
  def apply(field: java.lang.String, path: JSONPath, value: java.lang.String = null): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("path")(path)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Node]
  }
}

