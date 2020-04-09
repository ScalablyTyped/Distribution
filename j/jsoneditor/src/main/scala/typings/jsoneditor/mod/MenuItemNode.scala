package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemNode extends js.Object {
  var path: js.Array[String]
  var paths: js.Array[js.Array[String]]
  var `type`: MenuItemNodeType
}

object MenuItemNode {
  @scala.inline
  def apply(path: js.Array[String], paths: js.Array[js.Array[String]], `type`: MenuItemNodeType): MenuItemNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemNode]
  }
}

