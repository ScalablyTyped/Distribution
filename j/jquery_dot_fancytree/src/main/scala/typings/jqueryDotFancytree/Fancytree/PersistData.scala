package typings.jqueryDotFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistData extends js.Object {
  var active: String | Null
  var expanded: js.Array[String]
  var focus: String | Null
  var selected: js.Array[String]
}

object PersistData {
  @scala.inline
  def apply(
    expanded: js.Array[String],
    selected: js.Array[String],
    active: String = null,
    focus: String = null
  ): PersistData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistData]
  }
}

