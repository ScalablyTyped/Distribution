package typings.jsoneditor.mod

import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var dom: Record[String, HTMLElement]
  
  var editable: js.UndefOr[FieldEditable] = js.undefined
  
  var editor: JSONEditor
  
  var parent: Node | Null
}
object BaseNode {
  
  inline def apply(dom: Record[String, HTMLElement], editor: JSONEditor): BaseNode = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[BaseNode]
  }
  
  extension [Self <: BaseNode](x: Self) {
    
    inline def setDom(value: Record[String, HTMLElement]): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: FieldEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEditor(value: JSONEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
  }
}
