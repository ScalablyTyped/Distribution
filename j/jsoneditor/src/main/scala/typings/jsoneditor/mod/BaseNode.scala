package typings.jsoneditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNode extends js.Object {
  var dom: StringDictionary[HTMLElement]
  var editable: js.UndefOr[FieldEditable] = js.undefined
  var editor: JSONEditor
  var parent: Node | Null
}

object BaseNode {
  @scala.inline
  def apply(
    dom: StringDictionary[HTMLElement],
    editor: JSONEditor,
    editable: FieldEditable = null,
    parent: Node = null
  ): BaseNode = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
}

