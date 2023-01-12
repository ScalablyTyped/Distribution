package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorActionParams extends StObject {
  
  @JSName("clone")
  var clone_FJSONEditorActionParams: js.UndefOr[JSONEditorNode] = js.undefined
  
  var endIndex: js.UndefOr[Double] = js.undefined
  
  var endParent: js.UndefOr[JSONEditorNode] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var newType: js.UndefOr[JSONEditorNodeType] = js.undefined
  
  var newValue: js.UndefOr[String] = js.undefined
  
  var node: js.UndefOr[JSONEditorNode] = js.undefined
  
  var oldType: js.UndefOr[JSONEditorNodeType] = js.undefined
  
  var oldValue: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[JSONEditorNode] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
  
  var startParent: js.UndefOr[JSONEditorNode] = js.undefined
}
object JSONEditorActionParams {
  
  inline def apply(): JSONEditorActionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorActionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONEditorActionParams] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: JSONEditorNode): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setEndParent(value: JSONEditorNode): Self = StObject.set(x, "endParent", value.asInstanceOf[js.Any])
    
    inline def setEndParentUndefined: Self = StObject.set(x, "endParent", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNewType(value: JSONEditorNodeType): Self = StObject.set(x, "newType", value.asInstanceOf[js.Any])
    
    inline def setNewTypeUndefined: Self = StObject.set(x, "newType", js.undefined)
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setNode(value: JSONEditorNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOldType(value: JSONEditorNodeType): Self = StObject.set(x, "oldType", value.asInstanceOf[js.Any])
    
    inline def setOldTypeUndefined: Self = StObject.set(x, "oldType", js.undefined)
    
    inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setParent(value: JSONEditorNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setStartParent(value: JSONEditorNode): Self = StObject.set(x, "startParent", value.asInstanceOf[js.Any])
    
    inline def setStartParentUndefined: Self = StObject.set(x, "startParent", js.undefined)
  }
}
