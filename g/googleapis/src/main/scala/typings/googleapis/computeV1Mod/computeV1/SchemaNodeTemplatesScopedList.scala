package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeTemplatesScopedList extends StObject {
  
  /**
    * [Output Only] A list of node templates contained in this scope.
    */
  var nodeTemplates: js.UndefOr[js.Array[SchemaNodeTemplate]] = js.undefined
  
  /**
    * [Output Only] An informational warning that appears when the node templates list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaNodeTemplatesScopedList {
  
  inline def apply(): SchemaNodeTemplatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplatesScopedList]
  }
  
  extension [Self <: SchemaNodeTemplatesScopedList](x: Self) {
    
    inline def setNodeTemplates(value: js.Array[SchemaNodeTemplate]): Self = StObject.set(x, "nodeTemplates", value.asInstanceOf[js.Any])
    
    inline def setNodeTemplatesUndefined: Self = StObject.set(x, "nodeTemplates", js.undefined)
    
    inline def setNodeTemplatesVarargs(value: SchemaNodeTemplate*): Self = StObject.set(x, "nodeTemplates", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
