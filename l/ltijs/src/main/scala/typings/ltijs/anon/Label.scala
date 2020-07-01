package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var id: String
  var label: String
  var title: String
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var `type`: js.Array[_]
}

object Label {
  @scala.inline
  def apply(id: String, label: String, title: String, `type`: js.Array[_]): Label = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

