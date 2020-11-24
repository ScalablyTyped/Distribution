package typings.jsoneditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.ErrorObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends BaseNode {
  
  var append: js.UndefOr[BaseNode] = js.native
  
  var childs: js.UndefOr[js.Array[Node]] = js.native
  
  var enum: js.UndefOr[Null | js.Array[String]] = js.native
  
  var error: js.UndefOr[ErrorObject] = js.native
  
  var errorChild: js.UndefOr[Node] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var field: String = js.native
  
  var fieldEditable: Boolean = js.native
  
  var fieldInnerText: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var previousField: String = js.native
  
  var previousValue: NodeValue = js.native
  
  var schema: js.UndefOr[js.Object] = js.native
  
  var showMore: js.UndefOr[BaseNode] = js.native
  
  var `type`: NodeType = js.native
  
  var value: NodeValue = js.native
  
  var valueFieldHTML: js.UndefOr[String] = js.native
  
  var valueInnerText: js.UndefOr[String] = js.native
  
  var visibleChilds: Double = js.native
}
object Node {
  
  @scala.inline
  def apply(
    dom: StringDictionary[HTMLElement],
    editor: JSONEditor,
    field: String,
    fieldEditable: Boolean,
    previousField: String,
    `type`: NodeType,
    visibleChilds: Double
  ): Node = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldEditable = fieldEditable.asInstanceOf[js.Any], previousField = previousField.asInstanceOf[js.Any], visibleChilds = visibleChilds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldEditable(value: Boolean): Self = this.set("fieldEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousField(value: String): Self = this.set("previousField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NodeType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleChilds(value: Double): Self = this.set("visibleChilds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppend(value: BaseNode): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setChildsVarargs(value: Node*): Self = this.set("childs", js.Array(value :_*))
    
    @scala.inline
    def setChilds(value: js.Array[Node]): Self = this.set("childs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChilds: Self = this.set("childs", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setEnumNull: Self = this.set("enum", null)
    
    @scala.inline
    def setError(value: ErrorObject): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorChild(value: Node): Self = this.set("errorChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorChild: Self = this.set("errorChild", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setFieldInnerText(value: String): Self = this.set("fieldInnerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldInnerText: Self = this.set("fieldInnerText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPreviousValue(value: NodeValue): Self = this.set("previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValueNull: Self = this.set("previousValue", null)
    
    @scala.inline
    def setSchema(value: js.Object): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setShowMore(value: BaseNode): Self = this.set("showMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMore: Self = this.set("showMore", js.undefined)
    
    @scala.inline
    def setValue(value: NodeValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    
    @scala.inline
    def setValueFieldHTML(value: String): Self = this.set("valueFieldHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueFieldHTML: Self = this.set("valueFieldHTML", js.undefined)
    
    @scala.inline
    def setValueInnerText(value: String): Self = this.set("valueInnerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueInnerText: Self = this.set("valueInnerText", js.undefined)
  }
}
