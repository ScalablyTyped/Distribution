package typings.jsoneditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.ErrorObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node
  extends StObject
     with BaseNode {
  
  var append: js.UndefOr[BaseNode] = js.undefined
  
  var childs: js.UndefOr[js.Array[Node]] = js.undefined
  
  var `enum`: js.UndefOr[Null | js.Array[String]] = js.undefined
  
  var error: js.UndefOr[ErrorObject] = js.undefined
  
  var errorChild: js.UndefOr[Node] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var field: String
  
  var fieldEditable: Boolean
  
  var fieldInnerText: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var previousField: String
  
  var previousValue: NodeValue
  
  var schema: js.UndefOr[js.Object] = js.undefined
  
  var showMore: js.UndefOr[BaseNode] = js.undefined
  
  var `type`: NodeType
  
  var value: NodeValue
  
  var valueFieldHTML: js.UndefOr[String] = js.undefined
  
  var valueInnerText: js.UndefOr[String] = js.undefined
  
  var visibleChilds: Double
}
object Node {
  
  inline def apply(
    dom: StringDictionary[HTMLElement],
    editor: JSONEditor,
    field: String,
    fieldEditable: Boolean,
    previousField: String,
    `type`: NodeType,
    visibleChilds: Double
  ): Node = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldEditable = fieldEditable.asInstanceOf[js.Any], previousField = previousField.asInstanceOf[js.Any], visibleChilds = visibleChilds.asInstanceOf[js.Any], parent = null, previousValue = null, value = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setAppend(value: BaseNode): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setChilds(value: js.Array[Node]): Self = StObject.set(x, "childs", value.asInstanceOf[js.Any])
    
    inline def setChildsUndefined: Self = StObject.set(x, "childs", js.undefined)
    
    inline def setChildsVarargs(value: Node*): Self = StObject.set(x, "childs", js.Array(value :_*))
    
    inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumNull: Self = StObject.set(x, "enum", null)
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    inline def setError(value: ErrorObject): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorChild(value: Node): Self = StObject.set(x, "errorChild", value.asInstanceOf[js.Any])
    
    inline def setErrorChildUndefined: Self = StObject.set(x, "errorChild", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldEditable(value: Boolean): Self = StObject.set(x, "fieldEditable", value.asInstanceOf[js.Any])
    
    inline def setFieldInnerText(value: String): Self = StObject.set(x, "fieldInnerText", value.asInstanceOf[js.Any])
    
    inline def setFieldInnerTextUndefined: Self = StObject.set(x, "fieldInnerText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPreviousField(value: String): Self = StObject.set(x, "previousField", value.asInstanceOf[js.Any])
    
    inline def setPreviousValue(value: NodeValue): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setPreviousValueNull: Self = StObject.set(x, "previousValue", null)
    
    inline def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setShowMore(value: BaseNode): Self = StObject.set(x, "showMore", value.asInstanceOf[js.Any])
    
    inline def setShowMoreUndefined: Self = StObject.set(x, "showMore", js.undefined)
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NodeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFieldHTML(value: String): Self = StObject.set(x, "valueFieldHTML", value.asInstanceOf[js.Any])
    
    inline def setValueFieldHTMLUndefined: Self = StObject.set(x, "valueFieldHTML", js.undefined)
    
    inline def setValueInnerText(value: String): Self = StObject.set(x, "valueInnerText", value.asInstanceOf[js.Any])
    
    inline def setValueInnerTextUndefined: Self = StObject.set(x, "valueInnerText", js.undefined)
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVisibleChilds(value: Double): Self = StObject.set(x, "visibleChilds", value.asInstanceOf[js.Any])
  }
}
