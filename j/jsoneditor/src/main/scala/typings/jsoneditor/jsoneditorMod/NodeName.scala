package typings.jsoneditor.jsoneditorMod

import typings.jsoneditor.jsoneditorStrings.`object`
import typings.jsoneditor.jsoneditorStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeName extends js.Object {
  var path: js.Array[String]
  var size: Double
  var `type`: `object` | array
}

object NodeName {
  @scala.inline
  def apply(path: js.Array[String], size: Double, `type`: `object` | array): NodeName = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeName]
  }
}

