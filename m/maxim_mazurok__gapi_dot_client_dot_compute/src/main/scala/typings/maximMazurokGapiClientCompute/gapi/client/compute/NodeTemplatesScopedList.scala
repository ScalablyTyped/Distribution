package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTemplatesScopedList extends StObject {
  
  /** [Output Only] A list of node templates contained in this scope. */
  var nodeTemplates: js.UndefOr[js.Array[NodeTemplate]] = js.undefined
  
  /** [Output Only] An informational warning that appears when the node templates list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object NodeTemplatesScopedList {
  
  inline def apply(): NodeTemplatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTemplatesScopedList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeTemplatesScopedList] (val x: Self) extends AnyVal {
    
    inline def setNodeTemplates(value: js.Array[NodeTemplate]): Self = StObject.set(x, "nodeTemplates", value.asInstanceOf[js.Any])
    
    inline def setNodeTemplatesUndefined: Self = StObject.set(x, "nodeTemplates", js.undefined)
    
    inline def setNodeTemplatesVarargs(value: NodeTemplate*): Self = StObject.set(x, "nodeTemplates", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
