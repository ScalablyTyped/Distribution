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
  
  @scala.inline
  def apply(): JSONEditorActionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorActionParams]
  }
  
  @scala.inline
  implicit class JSONEditorActionParamsMutableBuilder[Self <: JSONEditorActionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone_(value: JSONEditorNode): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setEndParent(value: JSONEditorNode): Self = StObject.set(x, "endParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndParentUndefined: Self = StObject.set(x, "endParent", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNewType(value: JSONEditorNodeType): Self = StObject.set(x, "newType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTypeUndefined: Self = StObject.set(x, "newType", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setNode(value: JSONEditorNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setOldType(value: JSONEditorNodeType): Self = StObject.set(x, "oldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTypeUndefined: Self = StObject.set(x, "oldType", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    @scala.inline
    def setParent(value: JSONEditorNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setStartParent(value: JSONEditorNode): Self = StObject.set(x, "startParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartParentUndefined: Self = StObject.set(x, "startParent", js.undefined)
  }
}
