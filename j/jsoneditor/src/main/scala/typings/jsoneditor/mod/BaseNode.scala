package typings.jsoneditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseNode extends js.Object {
  var dom: StringDictionary[HTMLElement] = js.native
  var editable: js.UndefOr[FieldEditable] = js.native
  var editor: JSONEditor = js.native
  var parent: Node | Null = js.native
}

object BaseNode {
  @scala.inline
  def apply(dom: StringDictionary[HTMLElement], editor: JSONEditor): BaseNode = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  @scala.inline
  implicit class BaseNodeOps[Self <: BaseNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDom(value: StringDictionary[HTMLElement]): Self = this.set("dom", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditor(value: JSONEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: FieldEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setParent(value: Node): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

