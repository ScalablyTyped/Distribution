package typings.jsoneditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var dom: StringDictionary[HTMLElement]
  
  var editable: js.UndefOr[FieldEditable] = js.undefined
  
  var editor: JSONEditor
  
  var parent: Node | Null
}
object BaseNode {
  
  @scala.inline
  def apply(dom: StringDictionary[HTMLElement], editor: JSONEditor): BaseNode = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[BaseNode]
  }
  
  @scala.inline
  implicit class BaseNodeMutableBuilder[Self <: BaseNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDom(value: StringDictionary[HTMLElement]): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable(value: FieldEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditor(value: JSONEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
  }
}
